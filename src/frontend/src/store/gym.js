
import axios from 'axios'

const state ={
    context : "http://localhost:5000",
    searchWord : 'null',
    gyms : [],

}
const actions ={
    async findAll({commit}){
        axios.get(state.context+"/GYM/list")
            .then(({data})=>{
                commit('FINDALL',data)

            }).catch( error =>{
            alert(`통신실패입니다 :: ${error}`)
        })
    }
}
const mutations ={
    FINDALL(state, data){
        console.log(data)
        data.forEach(item =>{state.gyms.push({
            gymNo: item.gymNo,
            open_YN: item.open_YN,
            number : item.number,
            address: item.address,
            mailing_address: item.mailing_address,
            name : item.name,
        });

        });
    },
}
const getters ={
    gym: state => state.gym
}



export default {
    name:"gym",
    namespaced: true,
    state,
    actions,
    mutations,
    getters
}