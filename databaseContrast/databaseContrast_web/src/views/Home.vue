<template>
  <div class="home">
    <!--    <img alt="Vue logo" src="../assets/logo.png">
        <HelloWorld msg="Welcome to Your Vue.js App"/>-->
    <button @click="test">test</button>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import {putAction} from "@/axios";


export default {
  name: 'Home',
  components: {
    HelloWorld
  },
  methods: {
    test() {
      putAction('/test',{})
    }
  }
}
</script>
