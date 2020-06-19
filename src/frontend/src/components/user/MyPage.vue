<template>
    <div>
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
                            <v-col class="py-0">
                                <v-list-item
                                        color="rgba(0, 0, 0, .4)"
                                        dark
                                >
                                    <v-list-item-content>
                                        <v-list-item-title class="title">Marcus Obrien</v-list-item-title>
                                        <v-list-item-subtitle>Fitness Trainer</v-list-item-subtitle>
                                    </v-list-item-content>
                                </v-list-item>
                            </v-col>
                        </v-row>
                    </v-img>
                </v-card>
            </v-app>
        </div>
</template>
<script>
    import {mapState} from 'vuex'
    export default {
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