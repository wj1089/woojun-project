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
                            <v-container fluid>
                                <v-checkbox v-model="selected" @click="yongsan" label="용산구"></v-checkbox>
                                <v-checkbox v-model="selected" @click="junggu" label="중구"></v-checkbox>
                                <v-checkbox v-model="selected" @click="jongro" label="종로구"></v-checkbox>
                            </v-container>
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
                                            <td><a @click="nm(item.gymNo)">{{item.open_YN}}</a></td>
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
                checkbox1: true,
                checkbox2: false,
                checkbox3: false,
            }},
       /* mounted() {
            this.$store.dispatch('gym/findAll')
        },*/
        computed: {
            ...mapState({
                gym: state => state.gym.gyms
            })
        },

        methods:{

            yongsan(){
                this.$store.dispatch('gym/searchPlace')
            },
            junggu(){

                this.$store.dispatch('gym/searchPlace2')
            },
            jongro(){
                this.$store.dispatch('gym/searchPlace3')
            },
            nm(){
                this.nm(initMap)
            },
            /*serbtn(){
                this.$store.dispatch('gym/searchPlace')
            }*/
        }
    }
</script>

<style scoped>

</style>