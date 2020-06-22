import axios from 'axios';
import router from "@/router";

const state ={
    context : "http://localhost:5000",
    member : [],
    status : 'guest',
    auth: false,
    fail:false,
    user:{},

}

const actions = {
    async join({commit},payload){
        const url = `${state.context}/users/join`
        const headers = {
            authorization: 'JWT eyoga..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }
        axios
            .post(url, payload, headers)
            .then(({data})=>{
                commit('JOIN',data)
                alert(data)
            })
            .catch(()=>{
                alert('액션 서버 전송 실패')
            })
    },
    async login({commit},payload){
        const url = `${state.context}/users/login`
        const headers = {
            authorization: 'JWT eyoga..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }
        axios
            .post(url, payload, headers)
            .then(({data})=>{
                if(data.result){
                    commit('LOGIN', data)
                }else{
                    commit('FAIL')
                }
            })
            .catch(()=>{
                alert('액션 서버 전송 실패')
            })
    },
}

const mutations ={
    JOIN(){
        router.push('/login')
    },
    LOGIN(state,data){
        state.auth=true
        state.user = data.user
        state.status = 'user'
        router.push('/')
        alert("Hi")
    },
    FAIL(state) {
        state.fail=true
    },

    LOGOUT(){
        state.status = 'guest'
        router.push('/')
    }
};


export  default {
    name: 'user',
    namespaced : true,
    state,
    actions,
    mutations
}