import axios from 'axios'

export const http = axios.create({
    baseURL: 'https://localhost:8080/api/',
    headers: {
        'Content-Type': 'application/json'
    }
});