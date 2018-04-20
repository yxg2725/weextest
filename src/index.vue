<template>
  <div class="wrapper">
    <!--<label-view keyName="姓名:" hint="请输入姓名" content=""></label-view>
     <image :src="logo" class="logo" />
    <text class="greeting">The environment is ready!hahhahahahhahahah</text> 
    <HelloWorld/>-->
    <TopHeader title="购买清单" @menu="onMenu"></TopHeader>
    <add-tab :category = "categoryName" :numValue="num" :priceValue = "price" @onAdd="addClick" @onNumChange="onNumChange" @onPriceChange="onPriceChange" @selectCategory="onSelectCategory"></add-tab>
    <line></line>

    <!-- 清单列表 -->
    <list class="list">
      <cell v-for="item in list">
         <itemCell  :categoryName="item.categoryName" :num="item.num" :price="item.price" :toatal="item.total" ></itemCell>
      </cell>
    </list>

    <!-- 底部栏 -->
    <bottom :total = "totalPrice" ></bottom>
    <!-- 菜单 -->
    <menu v-if="showMenu" @addCategory="onAddCategory" @delCategory="onDelCategory" @about="onAbout"></menu>
    <addCategory class="add" v-if="showAddCategory"></addCategory>
  </div>
</template>

<script>
// import HelloWorld from '@/components/HelloWorld.vue'
import TopHeader from '@/components/TopHeader.vue'
// import labelView from '@/components/LabelView.vue'
import addTab from '@/components/addTab.vue'
import line from '@/components/line.vue'
import itemCell from '@/components/itemCell.vue'
import bottom from '@/components/bottom.vue'
import menu from '@/components/menu.vue'
import addCategory from '@/components/addCategory.vue'
const storage = weex.requireModule('storage')
const picker = weex.requireModule('picker')
const addCategoryBroadcast = new BroadcastChannel('addCategory')
export default {
  name: 'App',
  components: {
    // 'HelloWorld':HelloWorld,
    // 'label-view':labelView
    'TopHeader':TopHeader,
    'add-tab':addTab,
    'line':line,
    'itemCell':itemCell,
    'bottom':bottom,
    'menu':menu,
    'addCategory':addCategory,
  },
  data () {
    return {
      // logo: 'https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png',
      list:[],
      categoryName:'请选择分类',
      num:'',
      price:'',
      total:'',
      totalPrice:0,
      showMenu:false,
      showAddCategory:false,
      categoryList:[],
    }
  },
  methods:{
    addClick(){
      var bean = {};
      bean.categoryName = this.categoryName;
      bean.num = this.num;
      bean.price = this.price;
      bean.total = parseInt(bean.num) * parseInt(bean.price);
      this.list.push(bean);

      //小计
      let temp = 0;
      this.list.forEach(item => {
        console.log("小计：" + this.totalPrice +" itemTotalPrice：" + item.total);
        temp = temp + item.total;
      });
      this.totalPrice = temp;

      console.log("JSON:" + JSON.stringify(this.list));

      this.cleanInput();
    },
    onNumChange(e){
      this.num = e;
    },
    onPriceChange(e){
      this.price = e;
    },

    //清空输入项
    cleanInput(){
      this.num = '';
      this.price = '';
    },

    //打开菜单
    onMenu(){
      console.log("menu.....");
      this.showMenu = true;
    },

    //添加分类
    onAddCategory(){
      this.showMenu = false;
      this.showAddCategory = true;
      
    },

    //删除分类
    onDelCategory(){
      this.showMenu = false;
    },

    //关于
    onAbout(){
      this.showMenu = false;
    },

    //选择分类
    onSelectCategory(){
      picker.pick({
        
      },function(params) {
        
      });
    }
  },
  created (){

    //添加分类时 点击确定或取消监听
    addCategoryBroadcast.onmessage = function (e) {
      this.showAddCategory = false;
      console.log("收到了。。。");
    };

    storage.getItem('category', event => {
          console.log('get value:', event.data);
          if(!event.data){
            this.categoryList = JSON.parse(event.data);
          }
          
    });
  }
}
</script>

<style scoped>
  .wrapper {
    /* justify-content: center;
    align-items: center; */
  }
  .logo {
    width: 424px;
    height: 200px;
  }
  .greeting {
    text-align: center;
    margin-top: 70px;
    font-size: 50px;
    color: #41B883;
  }
  .message {
    margin: 30px;
    font-size: 32px;
    color: #727272;
  }
  .add{
    position: absolute;
    left: 175px;
    bottom:5170px;
  }
  .list{
    margin-bottom: 100px;
  }
</style>
