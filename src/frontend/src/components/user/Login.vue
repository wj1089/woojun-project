<template>
    <div>
        <v-app-bar
                app
                color="black"
                dark
        >
            <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
            <v-toolbar-title>로그인이 필요합니다.</v-toolbar-title>
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

<!--        <section id="welcome" class="overflow-hidden">-->
<!--            <div class="row no-gutters">-->

<!--                <div class="align-content-space-between layout wrap col-md-6 col-12">-->

<!--                    <div class="row align-center justify-center">-->
<!--                        <div class="col-md-6 col-10">-->
<!--                            <h1 class="display-3 v-heading mb-3 font-weight-light">로그인</h1>-->
<!--                            <p class="title font-weight-light" style="line-height: 1.7 !important;"><br> 회원님의 정보를 입력해주세요. </p>-->
<!--                            <div  class="mt-4 v-btn v-btn&#45;&#45;contained v-btn&#45;&#45;rounded theme&#45;&#45;light v-size&#45;&#45;default secondary">-->
<!--                                <span class="v-btn__content">  </span>-->
<!--                                <input v-model="userId" type="text" style="width: 200px; height:30px; border: #695b55 1px solid" placeholder="ID">-->

<!--                            </div>-->
<!--                            <div  class="mt-4 v-btn v-btn&#45;&#45;contained v-btn&#45;&#45;rounded theme&#45;&#45;light v-size&#45;&#45;default secondary">-->
<!--                                <span class="v-btn__content"> </span>-->
<!--                                <input v-model="userPw" type="text" style="width: 200px; height:30px; border: #695b55 1px solid" placeholder="PASSWORD">-->

<!--                            </div>-->

<!--                        </div>-->
<!--                        <button @click="login" class="mt-4 v-btn v-btn&#45;&#45;contained v-btn&#45;&#45;rounded theme&#45;&#45;light v-size&#45;&#45;default secondary">Sign in</button>-->
<!--                    </div>-->

<!--                </div>-->
<!--            </div>-->
<!--        </section>-->

        <v-app id="inspire">
            <v-main>
                <v-container
                        class="fill-height"
                        fluid
                >
                    <v-row
                            align="center"
                            justify="center"
                    >
                        <v-col
                                cols="30"
                                sm="15"
                                md="6"
                        >
                            <v-card class="elevation-12">
                                <v-toolbar
                                        color="black"
                                        dark
                                        flat
                                >
                                    <v-toolbar-title>로그인.</v-toolbar-title>
                                    <v-spacer></v-spacer>

                                </v-toolbar>
                                <v-card-text>
                                    <v-form>
                                        <h3>회원님의 아이디와 비밀번호를 입력해주세요.</h3>
                                        <v-text-field
                                                label="아이디입력"
                                                name="아이디입력"
                                                prepend-icon="mdi-account"
                                                type="text"
                                        ></v-text-field>

                                        <v-text-field
                                                id="패스워드입력"
                                                label="패스워드입력"
                                                name="패스워드입력"
                                                prepend-icon="mdi-lock"
                                                type="password"
                                        ></v-text-field>
                                    </v-form>
                                </v-card-text>
                                <v-card-actions>
                                    <v-spacer></v-spacer>
                                    <v-btn color="primary" @click="signup">회원가입</v-btn>
                                    <v-btn color="primary" @click="login">로그인</v-btn>
                                </v-card-actions>
                            </v-card>
                        </v-col>
                    </v-row>
                </v-container>
            </v-main>
        </v-app>

        </div>
</template>

<script>
    export default {
            name: "Login",
                data() {
                return{
                    userId : '',
                    userPw : ''
                }
            },
            methods: {
                login() {
                    alert('dispatch :' + this.userId)
                    this.$store.dispatch('user/login', {userId: this.userId, userPw: this.userPw})
                },
                signup() {
                    this.$router.push('/Join')
                }
            },
        props: {
            source: String,
        },
        }

</script>

<style scoped>

</style>