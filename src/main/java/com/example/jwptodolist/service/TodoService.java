package com.example.jwptodolist.service;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.dto.TodoCreateRequest;
import com.example.jwptodolist.dto.TodoResponse;
import com.example.jwptodolist.dto.TodoUpdateRequest;

import java.util.List;

public interface TodoService {
    TodoResponse create(TodoCreateRequest todoRequest);

    TodoResponse findTodo(Long id);

    List<TodoResponse> findTodos(String status);

    TodoResponse update(Long id, TodoUpdateRequest todoUpdateRequest);

    void delete(Long id);

    TodoResponse changeStatus(Long id, Status status);
}
