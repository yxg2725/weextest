<template>
  <div class="page">
      <text class="title">请添加分类</text>
      <input type="text" placeholder="请输入分类名称" class="in" @input="onInput"></input>
      <div class="sureAndCancel">
          <text class="text" @click="cancel">取消</text>
          <text class="text" @click="confirm">确定</text>
      </div>
      
  </div>
</template>

<script>
const addCategoryBroadcast = new BroadcastChannel('addCategory')
const storage = weex.requireModule('storage')
export default {
  data() {
    return {
        category:'',
        categoryList:[],
    }
  },
  components: {
  },
  created(){
      storage.getItem('category', event => {
          console.log('get value:', event.data);
          if(!event.data){
              this.categoryList = JSON.parse(event.data);
          }
          
        })
  },
  methods:{
      cancel(){
          addCategoryBroadcast.postMessage("");
          console.log("cancel");
      },
      confirm(){
          addCategoryBroadcast.postMessage("");
          console.log("confirm");

            this.categoryList.forEach(element => {
                if(element == this.category){
                    return;
                }
            });

            this.categoryList.unshift(this.category);
          storage.setItem('category', JSON.stringify(this.categoryList), event => {
            console.log('set success')
        })
      },
      onInput(event){
          this.category = event.value;
      }
  }
}
</script>

<style scoped>
    .page{
        position: absolute;
        left: 10;
        bottom:517px;
        width:400px;
        height: 200px;
        border-width: 1px;
        background-color: white;
        padding:10px;
        border-radius: 10px;
    }
    .sureAndCancel{
        flex-direction: row;
        margin-top:5px;
        align-items: center;
    }
    .title{
        text-align: center;
        padding:10px;
        font-size: 28px;
    }
    .in{
        border-bottom-width: 1px;
        padding:10px;
    }
    .text{
        flex:1;
        text-align: center;
        padding: 10px;
        font-size: 28px;
    }
</style>
