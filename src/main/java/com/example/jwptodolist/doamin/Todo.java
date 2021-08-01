package com.example.jwptodolist.doamin;

import com.example.jwptodolist.common.BaseTimeEntity;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    @Enumerated(EnumType.STRING)
    private Status status;

    protected Todo() {
    }

    public Todo(final Long id, final String content, final Status status) {
        this.id = id;
        this.content = content;
        this.status = status;
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

    public void changeStatus(final Status status) {
        this.status = status;
    }
}
