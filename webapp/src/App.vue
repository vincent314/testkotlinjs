<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
    <h1>{{greetings}}</h1>
  </div>
</template>

<script>
    import {greetings} from 'testkotlinjs-libjs'

    export default {
        name: 'app',
        computed: {
            greetings() {
                return greetings("Vincent")
            }
        }
    }
</script>

<style>
  #app {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
</style>
