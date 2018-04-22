<template>
    <div class="container">
        <div class="wrapper" @click="bgClick">
            
        </div>
        <div class="page">
            <text class="title">请添加分类</text>
            <input type="text" placeholder="请输入分类名称" class="in" @input="onInput"></input>
            <div class="sureAndCancel">
                <text class="text" @click="cancel">取消</text>
                <text class="text" @click="confirm">确定</text>
            </div>
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
    }
  },
  components: {
  },
  created(){
      
  },
  methods:{
      cancel(){
          this.$emit('onCancel',"");
      },
      confirm(){
          this.$emit('onConfirm',this.category);
      },
      onInput(event){
          this.category = event.value;
      },
      bgClick(event){
        // 阻止继续冒泡.
        event.stopPropagation();
      }
  }
}
</script>

<style scoped>
    .container{
        position: absolute;
        left:0px;
        right:0px;
        bottom:0px;
        top:0px;
        
    }
    .wrapper{
        width:750px;
        height:1334px;
        background-color:#000000;
        opacity:0.5;
    }
    .page{
        position: absolute;
        right: 175;
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
        font-size:28px;

    }
    .in{
        border-bottom-width: 1px;
        padding:10px;
    }
    .text{
        margin-top:10px;
        flex:1;
        text-align: center;
        font-size:28px;
    }
</style>
