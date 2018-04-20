<template>
  <div class="page">
      <div class="wrapper">
          <text class="text">{{keyName}}</text>
          <input class='input' type="text" :placeholder="hint" :value="content"/>
      </div>
  </div>
</template>

<script>
export default {
    props:["keyName","hint","content"],
  data() {
    return {
    }
  }
}
</script>

<style scoped>
    .wrapper{
        flex-direction: row;

    }

    .text{
        flex:1;
        text-align: center;
        text-color:red
    }

    .input{
        flex:2;
        margin-left: 20px;
        text-color:red;
    }

</style>
