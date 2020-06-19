<template>
    <div>
        <v-app id="inspire">

            <header>
            <v-app-bar
                    app
                    color="black"
                    dark
            >
                <v-app-bar-nav-icon @click="drawer = true"></v-app-bar-nav-icon>
                <v-toolbar-title @click="log2" style="cursor: pointer">로그인이 필요합니다.</v-toolbar-title>
                <v-btn icon>
                    <v-icon>mdi-magnify</v-icon>
                </v-btn>

                <v-btn icon>
                    <v-icon>mdi-heart</v-icon>
                </v-btn>

                <v-btn icon>
                    <v-icon>mdi-dots-vertical</v-icon>
                </v-btn>

            </v-app-bar>
            </header>

            <v-navigation-drawer
                    v-model="drawer"
                    absolute
                    temporary
                    app
            >
                <v-divider></v-divider>

                <div v-if="auth">
                    <v-list dense>
                        <v-list-item link>
                            <v-list-item-action>
                                <v-icon>mdi-home</v-icon>
                            </v-list-item-action>

                            <v-list-item-content>
                                <router-link to="/"><v-list-item-title>Home</v-list-item-title></router-link>
                            </v-list-item-content>
                        </v-list-item>

                        <v-list-item>
                            <v-list-item-action>
                                <v-icon>fas fa-list</v-icon>
                            </v-list-item-action>
                            <v-list-item-content >
                                <v-list-item-title @click="mypage">MyPage</v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>
                        
                        <v-list-item link>
                            <v-list-item-action>
                                <v-icon>mdi-email</v-icon>
                            </v-list-item-action>

                            <v-list-item-content>
                                <v-list-item-title @click="log">Logout</v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>

<!--                        asd-->
                        <v-list-item Place>
                            <v-list-item-action>
                                <v-icon>fas fa-list</v-icon>
                            </v-list-item-action>
                            <v-list-item-content >
                                <v-list-item-title @click="place">Location</v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>

                        <v-list-item>
                            <v-list-item-action>
                                <v-icon>fas fa-list</v-icon>
                            </v-list-item-action>
                            <v-list-item-content >
                                <v-list-item-title @click="link">Link</v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>

                    </v-list>
                </div>

                <div v-else>
                    <v-list dense>
                        <v-list-item link>
                            <v-list-item-action>
                                <v-icon>mdi-home</v-icon>
                            </v-list-item-action>

                            <v-list-item-content>
                                <router-link to="/"><v-list-item-title>Home</v-list-item-title></router-link>
                            </v-list-item-content>
                        </v-list-item>

                        <v-list-item link>
                            <v-list-item-action>
                                <v-icon>mdi-email</v-icon>
                            </v-list-item-action>

                            <v-list-item-content>
                                <v-list-item-title @click="log">Login</v-list-item-title>
                            </v-list-item-content>
                        </v-list-item>
                    </v-list>
                </div>
            </v-navigation-drawer>
            <body>

            <section id="content">
                <slot name="vue-content">
                    <router-view/>
                </slot>
            </section>
            </body>




            <template>
                <v-footer
                        dark
                        padless
                >
                    <v-card
                            class="flex"
                            flat
                            tile
                    >
                        <v-card-title class="teal">
                            <strong class="subheading">Get connected with us on social networks!</strong>

                            <v-spacer></v-spacer>

                            <v-btn
                                    v-for="icon in icons"
                                    :key="icon"
                                    class="mx-4"
                                    black
                                    icon
                            >
                                <v-icon size="24px">{{ icon }}</v-icon>
                            </v-btn>
                        </v-card-title>

                        <v-card-text class="py-2 white--text text-center">
                            {{ new Date().getFullYear() }} — <strong>로그인이 필요합니다.</strong>
                        </v-card-text>
                    </v-card>

                </v-footer>
            </template>
        </v-app>
    </div>
</template>

<script>
    import axios from 'vuex'
    import {mapState} from 'vuex'
    export default {
        props: {
            source: String,
        },
        methods:{

            log(){
                this.$router.push('/Login')
            },
            place(){
                this.$router.push('/Place')
            },
            log2(){
                this.$router.push('/Login')
            },
            link(){
                this.$router.push('/link')
            },
            list(){
                this.$router.push('/list')
            },
            mypage(){
                this.$router.push('/Mypage')
            },
            cl(){
                alert("확인이요~")
                axios.get('https://localhost:5001/').then().catch(err=>{
                    alert("통신 실패입니다." + err)
                })
            }
        },
        computed: {
            ...mapState ({
                auth : state=>state.user.auth,
                member:state=>state.user.member
            })
        },
        data: () => ({
            drawer: false,

            icons: [
                'mdi-facebook',
                'mdi-twitter',
                'mdi-linkedin',
                'mdi-instagram',
            ],
        })
    }


</script>
<style scoped>
    #search {
        color: white;
    }

</style>