package com.example.jwptodolist.dto;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.doamin.Todo;

public class TodoCreateRequest {
    private String title;

    public Todo toEntity() {
        return new Todo(null, title, Status.ACTIVE);
    }
}
