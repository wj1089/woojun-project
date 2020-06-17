<template>
    <div>
        <v-app-bar
                app
                color="black"
                dark
        >
            <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
            <v-toolbar-title>Park. GYM</v-toolbar-title>
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


        <v-navigation-drawer
                v-model="drawer"
                app
        >
            <v-divider></v-divider>

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
                        <v-list-item-title @click="log">Logout</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>


                <v-list-item Place>
                    <v-list-item-action>
                        <v-icon>fas fa-list</v-icon>
                    </v-list-item-action>
                    <v-list-item-content >
                        <v-list-item-title @click="place">Place</v-list-item-title>
                    </v-list-item-content>
                </v-list-item>

            </v-list>
        </v-navigation-drawer>

        <v-col cols="12" sm="6" md="4">
            <v-subheader>지역별 헬스장 현황</v-subheader>
            <tr>
                <input type="radio" name="radioTest" value="yongsan" @click="yongsan" checked>용산구<br>
                <input type="radio" name="radioTest" value="junggu" @click="junggu" checked>중구<br>
                <input type="radio" name="radioTest" value="jongro" @click="jongro" checked>종로구<br>
            </tr>
        </v-col>

        <div id="app">
            <v-app id="inspire">
                <v-simple-table>
                    <template v-slot:default>
                        <thead>
                        <tr>
                            <th class="text-left">순번</th>
                            <th class="text-left">영업장이름</th>
                            <th class="text-left">우편번호</th>
                            <th class="text-left">영업현황</th>
                            <th class="text-left">전화번호</th>
                            <th class="text-left">상세주소</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-for="item of gym" :key="item.gym_no">
                            <td>{{item.ser_Num}}</td>
                            <td>{{item.open_YN}}</td>
                            <td>{{item.number}}</td>
                            <td>{{item.address}}</td>
                            <td>{{item.mailing_address}}</td>
                            <td>{{item.name}}</td>
                        </tr>
                        </tbody>
                    </template>
                </v-simple-table>
            </v-app>
        </div>
    </div>
</template>

<script>
    import { mapState } from "vuex";

    export default {
        data () {
            return {
                drawer:'',
                log:'',
                place:'',
                searchWord:'',

        }},
        mounted() {
            this.$store.dispatch('gym/findAll')

        },
        computed: {
            ...mapState({
                gym: state => state.gym.gyms
            })
        },

    }
</script>

<style scoped>

</style>