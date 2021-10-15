package com.luv4code.sf.app.ws.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BlogAlreadyExistsException extends RuntimeException {
    private String message;

    public BlogAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }

}