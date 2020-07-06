<template>
    <div>
        <Layout>
            <template #vue-content>
                <div>
                    <h1>지역별 헬스장 현황</h1>

                    <div>
                        <maptest/>
                    </div>

                    <div id="app">
                        <v-app id="inspire">
                            <tr>
                                <input type="radio" name="radioTest" value="yongsan" @click="yongsan" checked>용산구<br>
                                <input type="radio" name="radioTest" value="junggu" @click="junggu" checked>중구<br>
                                <input type="radio" name="radioTest" value="jongro" @click="jongro" checked>종로구<br>
                            </tr>
                            <div>
                                <button id="serbtn" @click="serbtn">눌러눌러 버튼</button>
                            </div>

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
                                        <tr v-for="item of gym" :key="item.open_YN">
                                            <td>{{item.gymNo}}</td>
                                            <td><a @click="nm">{{item.open_YN}}</a></td>
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
        </Layout>
    </div>
</template>

<script>
    import { mapState } from "vuex";
    import Layout from "../Layout";
    import maptest from "./maptest";


    export default {
        components: {Layout, maptest},
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
        methods:{
            yongsan(){
            },
            junggu(){
            },
            jongro(){
            },
            nm(){
            },
            serbtn(){
                this.$store.dispatch('gym/searchPlace')
            }
        }
    }
</script>

<style scoped>

</style>