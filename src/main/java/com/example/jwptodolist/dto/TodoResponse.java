package com.example.jwptodolist.dto;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.doamin.Todo;

import java.util.List;
import java.util.stream.Collectors;

public class TodoResponse {
    private final Long id;

    private final String title;

    private final String description;

    private final Status status;

    public TodoResponse(final Long id, final String title, final String description, final Status status) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public static TodoResponse of(final Todo todo) {
        return new TodoResponse(todo.getId(), todo.getTitle(), todo.getDescription(), todo.getStatus());
    }

    public static List<TodoResponse> ofList(final List<Todo> todos) {
        return todos.stream()
                .map(TodoResponse::of)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }
}
