<template>
<div>
  <Layout>
     <template #vue-content>
       <div>
        <v-carousel
                cycle
                show-arrows-on-hover
        >
          <v-carousel-item
                  v-for="(item,i) in slides"
                  :key="i"
                  :src="item.src"
                  reverse-transition="fade-transition"
                  transition="fade-transition"
          ></v-carousel-item>
        </v-carousel>
      <v-container
              class="fill-height"
              fluid
      >
      </v-container>
       </div>
     </template>
  </Layout>
</div>
</template>

<script>

  import Layout from "../Layout";
  export default {
    components: {Layout},
    methods:{
      created () {
        this.$store.state.user = this.item.get('src')
      },
    },

    data: () => ({

      slides: [
        {
          src: 'https://images.unsplash.com/photo-1576678927484-cc907957088c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=634&q=80',
        },
        {
          src : 'https://images.unsplash.com/photo-1507398941214-572c25f4b1dc?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=966&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1580051745101-2dca6e53f15c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
        {
          src: 'https://images.unsplash.com/photo-1518622358385-8ea7d0794bf6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80',
        },
      ],
    })
  }


</script>
<style scoped>
  #search {
    color: white;
  }

</style>