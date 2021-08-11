import { axios } from "@/axios/utils/request";

export function putAction(url, parameter) {
    console.log(parameter)
    return axios({
        url: url,
        method: 'post',
        data: parameter
    })
}