import Vue from 'vue'
import axios from 'axios'
import { VueAxios } from './axios'

let apiBaseUrl = "/constrast";
//console.log("apiBaseUrl= ",apiBaseUrl)
// 创建 axios 实例
const service = axios.create({
    //baseURL: '/jeecg-boot',
    baseURL: apiBaseUrl, // api base_url
    timeout: 9000 // 请求超时时间
})

const err = (error) => {
    if (error.response) {
        let that=this;
        let data = error.response.data
        const token = Vue.ls.get(ACCESS_TOKEN)
        console.log("------异常响应------",token)
        console.log("------异常响应------",error.response.status)
    }
    return Promise.reject(error)
};

// request interceptor
service.interceptors.request.use(config => {

    return config
},(error) => {
    return Promise.reject(error)
})

// response interceptor
service.interceptors.response.use((response) => {
    return response.data
}, err)



export {
    service as axios
}