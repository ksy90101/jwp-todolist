package com.example.jwptodolist.service;

import com.example.jwptodolist.doamin.Todo;
import com.example.jwptodolist.doamin.TodoRepository;
import com.example.jwptodolist.dto.TodoCreateRequest;
import com.example.jwptodolist.dto.TodoResponse;
import com.example.jwptodolist.dto.TodoUpdateRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;

    public TodoServiceImpl(final TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public TodoResponse create(final TodoCreateRequest todoCreateRequest) {
        final Todo todo = todoCreateRequest.toEntity();
        final Todo savedTodo = todoRepository.save(todo);

        return TodoResponse.of(savedTodo);
    }

    @Override
    public TodoResponse findTodo(final Long id) {
        final Todo todo = todoRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);

        return TodoResponse.of(todo);
    }

    @Override
    public List<TodoResponse> findTodos() {
        final List<Todo> todos = todoRepository.findAll();

        return TodoResponse.ofList(todos);
    }

    @Override
    public TodoResponse update(final Long id, final TodoUpdateRequest todoUpdateRequest) {
        return null;
    }

    @Override
    public void delete(final List<Long> ids) {
        todoRepository.deleteAllByIdInBatch(ids);
    }
}
