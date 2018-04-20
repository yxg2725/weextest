<template>
  <div class="page">
        <text class="category" @click="selectCategory">{{category}}</text>
        <input class="num" type="number" placeholder="数量" :value = "numValue" @input="onNumChange"/>
        <input class="price" type="number" placeholder="单价" :value = "priceValue" @input="onPriceChange"/>
        <text class="add" @click="add">添加</text>
  </div>
</template>

<script>
export default {
  props:["category","numValue","priceValue"],
  data() {
    return {
    }
  },
  components: {
  },
  methods:{
      add(){
          this.$emit('onAdd','');
      },

      onNumChange(event){
          this.$emit('onNumChange',event.value);
      },

      onPriceChange(event){
          this.$emit('onPriceChange',event.value);
      },

      selectCategory(){
          this.$emit("selectCategory","");
      }
  }
}
</script>

<style scoped>
    .page{
        flex-direction: row;
        margin:5px;
    }

    .category{
        flex:2;
        margin:3px;
    }

    .num{
        flex:1;
        border-width: 1px;
        margin:3px;
    }

    .price{
        flex:1;
        border-width: 1px;
        margin:3px;
    }
    .add{
        flex:1;
        border-color:aqua;
        border-width: 1px;
        border-radius: 10px;
        text-align: center;
        margin:3px;
        background-image: linear-gradient(to top,#a80077,#66ff00);
    }
</style>
