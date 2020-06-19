<template>
    <div>
        <Layout>
            <template>
            <v-app id="inspire">
                <v-card
                        class="mx-auto"
                        max-width="434"
                        tile
                >
                    <v-img
                            height="100%"
                            src="https://cdn.vuetifyjs.com/images/cards/server-room.jpg"
                    >
                        <v-row
                                align="end"
                                class="fill-height"
                        >
                            <v-col
                                    align-self="start"
                                    class="pa-0"
                                    cols="12"
                            >
                                <v-avatar
                                        class="profile"
                                        color="grey"
                                        size="164"
                                        tile
                                >
                                    <v-img src="https://cdn.vuetifyjs.com/images/profiles/marcus.jpg"></v-img>
                                </v-avatar>
                            </v-col>

                        </v-row>
                    </v-img>
                </v-card>
            </v-app>
            </template>
        </Layout>
        </div>
</template>
<script>
    import Layout from "../Layout";
    import {mapState} from 'vuex'
    export default {
        components: {Layout},
        el: '#app',
        name: "MyPage",
        data(){

        },
        methods: {
            change(){

            }
        },
        computed:{
            ...mapState({
                auth:state=>state.user.auth,
                user:state=>state.user.user
            })
        }
    }
</script>


<style scoped>

</style>