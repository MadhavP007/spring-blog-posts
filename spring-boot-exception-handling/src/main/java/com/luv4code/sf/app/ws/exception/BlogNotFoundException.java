package com.luv4code.sf.app.ws.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BlogNotFoundException extends RuntimeException {
    private String message;

    public BlogNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}