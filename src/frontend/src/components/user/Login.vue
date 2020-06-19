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
                                cols="22"
                                sm="10"
                                md="4"
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
                                                v-model="userId"

                                        ></v-text-field>

                                        <v-text-field
                                                id="패스워드입력"
                                                label="패스워드입력"
                                                name="패스워드입력"
                                                prepend-icon="mdi-lock"
                                                type="password"
                                                v-model="userPw"

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
                drawer:'',
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