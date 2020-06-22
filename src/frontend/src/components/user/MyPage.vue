<template>
    <div>
        <v-app-bar
                app
                color="black"
                dark
        >
            <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
            <div v-if="auth">
                <v-toolbar-title @click="log2" style="cursor: pointer">{{user.userId}}</v-toolbar-title>
            </div>
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
                                    <v-toolbar-title>회원정보수정</v-toolbar-title>
                                    <v-spacer></v-spacer>

                                </v-toolbar>
                                <v-card-text>
                                    <v-form>
                                        <h3>수정 할 회원님의 정보를 입력해주세요.</h3>
                                        <v-text-field
                                                label="아이디입력"
                                                name="아이디입력"
                                                prepend-icon="mdi-account"
                                                type="text"
                                                v-model="userId"
                                        ></v-text-field>

                                        <v-text-field
                                                id="password"
                                                label="패스워드입력"
                                                name="패스워드입력"
                                                prepend-icon="mdi-lock"
                                                type="password"
                                                v-model="password"
                                        ></v-text-field>
                                        <v-text-field
                                                id="FirstName"
                                                label="FirstName"
                                                name="FirstName"
                                                prepend-icon="mdi-lock"
                                                type="FirstName"
                                                v-model="FirstName"
                                        ></v-text-field>
                                        <v-text-field
                                                id="LastName"
                                                label="LastName"
                                                name="LastName"
                                                prepend-icon="mdi-lock"
                                                type="LastName"
                                                v-model="LastName"
                                        ></v-text-field>
                                        <v-text-field
                                                id="address"
                                                label="address"
                                                name="address"
                                                prepend-icon="mdi-lock"
                                                type="address"
                                                v-model="address"

                                        ></v-text-field>
                                        <v-text-field
                                                id="Email"
                                                label="Email"
                                                name="Email"
                                                prepend-icon="mdi-lock"
                                                type="Email"
                                                v-model="Email"

                                        ></v-text-field>
                                    </v-form>
                                </v-card-text>
                                <v-card-actions>
                                    <v-spacer></v-spacer>
                                    <v-btn color="primary" @click="cancel">취소</v-btn>
                                    <v-btn color="primary" @click="signup">정보수정</v-btn>
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

        data(){
            return{

                userId: '',
                password:'',
                FirstName:'',
                LastName:'',
                address:'',
                Email:'',

            };
        },

        methods: {
            signup(){
                alert(this.id)
                this.$store.dispatch('user/join',
                    { nameF : this.FirstName, nameL : this.LastName,
                        userId : this.userId, userPw : this.password,
                        email : this.Email, address: this.address})
            },
            cancel() {
                this.$router.push("/")
            }
        }
    }
</script>

<style scoped>
</style>
