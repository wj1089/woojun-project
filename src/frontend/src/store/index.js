import Vue from 'vue'
import Vuex from 'vuex'
import gym from "./gym";
import user from "./user"

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules:{
        gym,user
    }
})