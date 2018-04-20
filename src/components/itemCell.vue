<template>
  <div class="page">
        <image class="img"></image>
        <div class="right">
            <text class="item">{{categoryName}}</text>
            <div class="item" >
                <div class="item num">
                    <text>数量：</text>
                    <text>{{num}}</text>
                </div>
                <div class="item num">
                    <text>单价：</text>
                    <text>{{price}}元</text>
                </div>
            </div>
            
            <div class="item">
                <text>总价：</text>
                <text>{{toatal}}元</text>
            </div>
            
        </div>
  </div>
</template>

<script>
export default {
    props:['categoryName','num','price','toatal'],
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
        flex-direction: row;
        align-items: center;
        margin:5px;
        padding:5px;
        height: 180px;
        border-width: 1px;
    }
    .img{
        background-color: goldenrod;
        width: 150px;
        height: 150px;
        margin-left: 5px;
        margin-right: 5px;
    }

    .right{
        margin-left: 10px;
        padding-right: 5px;
    }

    .item{
        flex-direction: row;
        text-align: center;
        align-items: center;
    }
    .num{
        margin:5px;
        border-width: 1px;
    }
</style>
