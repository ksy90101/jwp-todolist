package com.example.jwptodolist.dto;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.doamin.Todo;

public class TodoCreateRequest {
    private String content;
    private String status;

    public TodoCreateRequest() {
    }

    public Todo toEntity() {
        return new Todo(null, this.content, Status.ACTIVE);
    }

    @Override
    public String toString() {
        return "TodoCreateRequest{" +
                "content='" + content + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public String getStatus() {
        return status;
    }
}
