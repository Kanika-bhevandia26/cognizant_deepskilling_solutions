package com.library.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BookRepository {

    public String display() {
        return "Inside BookRepository";
    }
}