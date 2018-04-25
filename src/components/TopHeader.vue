<template>
  <div class="page">
      <text class="top" @longPress="onLongPress"> {{title}}</text>
      <image class="img" @click="onClick" src="assets:icon_menu.png"></image>
  </div>
</template>

<script>
  export default {
    props:["title"],
    data() {
      return {
      }
    },
    methods:{
      onClick(){
        this.$emit("menu","");
      },
      //item长按删除
    onLongPress(){
      //弹出对话框
      // var dialogModule = require('@weex-module/dialog');
      // dialogModule.delDialogShow(function (e) {
      // if (e.result == 'ok') {
      //   console.log("点击了确定：index ：" + index);
      // } 
      // });

      console.log("+++++++++++++++index ：");
    }
    }
}
</script>

<style scoped>
    .page{
      justify-content: center;
        align-items: center;
        background-color: aquamarine;
        height:100px;
    }
    .top{
        padding: 20px;
        font-size:30px;
    }
    .img{
      width: 60px;
      height: 60px;
      position: absolute;
      right: 20px;
      top:20px;
    }
</style>
