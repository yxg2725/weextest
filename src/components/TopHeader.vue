<template>
  <div class="page">
      <text class="top"> {{title}}</text>
      <image class="img" @click="onClick"></image>
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
      }
    }
}
</script>

<style scoped>
    .page{
      width: 750px;
      height: 30px;
      justify-content: center;
      align-items: center;
      background-color: aquamarine;
    }
    .top{
        padding: 20px;
        font-size: 30px;
    }
    .img{
      width: 60px;
      height: 60px;
      background-color: red;
      position: absolute;
      right: 20px;
      top:20px;
      
    }
</style>
