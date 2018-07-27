<template>
  <div style="padding: 10px">
    <h1>Nuxt.js + Spring Boot</h1>
    <p>Message from API: {{ ip }}</p>
  </div>
</template>

<script>
  export default {
    async asyncData({ app }) {
      const ip = await app.$axios.$get('http://localhost:8080');
      return { ip }
    }
  }
</script>
