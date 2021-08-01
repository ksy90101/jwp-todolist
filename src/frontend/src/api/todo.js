import {http} from './http'

export const createTodo = (param) => {
    const {todo} = http.post('/todos', param)

    return todo;
}

export const fetchTodo = (id) => {
    const {todo} = http.get(`/todos/${id}`)

    return todo
}

export const fetchTodos = () => {
    const {todos} = http.get('/todos')

    return todos
}

export const updateTodo = (param) => {
    const {todo} = http.put('/todos', param)

    return todo;
}

export const deleteTodo = (id) => {
    http.delete(`/todos/${id}`);
}

export const changeStatus = (stauts) => {
    const {todo} = http.patch(`/todos/${status}`)

    return todo;
}