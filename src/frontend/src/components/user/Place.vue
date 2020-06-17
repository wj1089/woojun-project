<template>
    <div>

        <div id="app">
            <v-app id="inspire">
                <v-simple-table>
                    <template v-slot:default>
                        <thead>
                        <tr>
                            <th class="text-left">순번</th>
                            <th class="text-left">영업장이름</th>
                            <th class="text-left">우편번호</th>
                            <th class="text-left">상세주소</th>
                            <th class="text-left">영업코드</th>
                            <th class="text-left">영업현황</th>
                            <th class="text-left">전화번호</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr v-for="item of gym" :key="item.ser_Num">
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