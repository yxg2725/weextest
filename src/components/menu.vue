<template>
  <div >
      <div class="bg">

      </div>
      <div class="page"> 
            <text class="text" @click="onAdd">添加分类</text>
            <div class="line"></div>
            <text class="text" @click="onDel">删除分类</text>
            <div class="line"></div>
            <text class="text" @click="onAbout">关于</text>
      </div>
      
  </div>
</template>

<script>
export default {
  data() {
    return {

    }
  },
  components: {

  },
  methods:{
      onAdd(){
          this.$emit("addCategory");
      },
      onDel(){
          this.$emit("delCategory");
      },
      onAbout(){
          this.$emit("about");
      },

  }
}
</script>

<style scoped>
    .wrapper{
        position: absolute;
        opacity: 0.5;
        left: 0px;
        top:0px;
        right: 0px;
        bottom:0px;
    }
    .page{
        background-color: white;
        position: absolute;
        top:10px;
        right: 10px;
        width:250px;
        border-width: 1px;
        padding-bottom: 10px;
    }
    .text{
        margin-left: 10px;
        margin-top:10px;
        font-size: 28px;
    }
    .line{
        height: 1px;
        background-color: grey;
    }
    .bg{
        background-color: grey;
        position: absolute;
        opacity: 0.5;
        left: 0px;
        top:0px;
        right: 0px;
        bottom:0px;
    }
</style>
