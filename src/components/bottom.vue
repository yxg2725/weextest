<template>
  <div class="page">
      <div class="bottom">
          <text class="text total">总计</text>
          <div class="line"></div>
          <text class="text price">{{total}}元</text>
      </div>
  </div>
</template>

<script>
export default {
    props:['total'],
  data() {
    return {
    }
  },
  components: {

  }
}
</script>

<style scoped>
    .page{
        height: 100px;
        justify-content: center;
        border-top-width: 1px;
        border-top-color: gray;
        background-color: aquamarine;

        position: absolute;
        left: 0px;
        right: 0px;
        bottom: 0px;
    }
    .bottom{
        flex-direction: row;
        align-items: center;
        justify-content: center;

    }
    .line{
        width: 1px;
        height: 60px;
        background-color: gray;
    }
    .text{
        text-align: center;
        padding:10px;
    }
    .total{
        flex:2;
    }
    .price{
        flex:1;
    }
</style>
