package com.example.jwptodolist.controller;

import com.example.jwptodolist.doamin.Status;
import com.example.jwptodolist.dto.TodoCreateRequest;
import com.example.jwptodolist.dto.TodoResponse;
import com.example.jwptodolist.dto.TodoUpdateRequest;
import com.example.jwptodolist.service.TodoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping(path = "/api/todos")
public class TodoController {

    private final TodoService todoService;

    public TodoController(final TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping()
    public ResponseEntity<TodoResponse> create(@RequestBody final TodoCreateRequest todoCreateRequest) throws URISyntaxException {
        final TodoResponse todoResponse = todoService.create(todoCreateRequest);

        return ResponseEntity.created(new URI("/api/todos" + todoResponse.getId()))
                .body(todoResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoResponse> findTodo(@PathVariable final Long id) {

        final TodoResponse todo = todoService.findTodo(id);

        return ResponseEntity.ok(todo);
    }

    @GetMapping()
    public ResponseEntity<List<TodoResponse>> findTodos(@RequestParam final String status) {
        final List<TodoResponse> todos = todoService.findTodos(status);

        return ResponseEntity.ok(todos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoResponse> update(@PathVariable final Long id, @RequestBody final TodoUpdateRequest todoUpdateRequest) {
        final TodoResponse todo = todoService.update(id, todoUpdateRequest);

        return ResponseEntity.ok(todo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final Long id) {
        todoService.delete(id);

        return ResponseEntity.noContent()
                .build();
    }

    @PatchMapping("/{id}/{status}")
    public ResponseEntity<TodoResponse> changeStatus(@PathVariable final Long id, @PathVariable final Status status) {
        final TodoResponse todoResponse = todoService.changeStatus(id, status);

        return ResponseEntity.ok(todoResponse);
    }
}
