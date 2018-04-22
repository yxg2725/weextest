<template>
  <div class="page">
        <image class="img" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1524308066692&di=a976aacdaaf2e23629bbf1cacbedccae&imgtype=0&src=http%3A%2F%2Fwww.jituwang.com%2Fuploads%2Fallimg%2F150924%2F258216-1509241AT548.jpg"></image>
        <div class="right">
            <text class="category">{{categoryName}}</text>
            <div class="item" >
                <div class="item num" style="width:250px">
                    <text class="font">数量：</text>
                    <text class="font" >{{num}}</text>
                </div>
                <div class="item num">
                    <text class="font">单价：</text>
                    <text class="font">{{price}}元</text>
                </div>
            </div>
            
            <div class="item">
                <text class="font">总价：</text>
                <text class="font">{{toatal}}元</text>
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
        padding:5px;
        font-size:28px;
    }
    .num{
        margin-right:80px;
    }

    .font{
        font-size:28px;
    }
    .category{
        flex-direction: row;
        text-align: center;
        align-items: center;
        padding:10px;
        font-size:28px;
    }
</style>
