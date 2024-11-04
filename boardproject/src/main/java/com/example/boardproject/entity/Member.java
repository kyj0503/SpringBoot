package com.example.boardproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Entity
@ToString
@Slf4j
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String title;
    private String content;
    public Member(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Member() {

    }

    public void logInfo() {
        log.info("id: {}, title: {}, content: {} ", id, title, content);
    }
}
