package com.example.jwptodolist.dto;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.doamin.Todo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class TodoResponse {
    private final Long id;

    private final String content;

    private final Status status;

    private final LocalDateTime updatedAt;

    public TodoResponse(final Long id, final String content, final Status status, final LocalDateTime updatedAt) {
        this.id = id;
        this.content = content;
        this.status = status;
        this.updatedAt = updatedAt;
    }

    public static TodoResponse of(final Todo todo) {
        return new TodoResponse(todo.getId(), todo.getContent(), todo.getStatus(), todo.getUpdatedAt());
    }

    public static List<TodoResponse> ofList(final List<Todo> todos) {
        return todos.stream()
                .map(TodoResponse::of)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
