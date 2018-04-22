<template>
  <div class="page">
      <text class="text" @click="onAdd">添加分类</text>
      <div class="line"></div>
      <text class="text" @click="onDel">删除分类</text>
      <div class="line"></div>
      <text class="text" @click="onAbout">关于</text>
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
        font-size:28px;
        padding:10px;
    }
    .line{
        height: 1px;
        background-color: grey;
    }
</style>
