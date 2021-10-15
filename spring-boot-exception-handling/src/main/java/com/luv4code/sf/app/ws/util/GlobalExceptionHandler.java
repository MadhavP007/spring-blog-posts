package com.luv4code.sf.app.ws.util;

import com.luv4code.sf.app.ws.exception.BlogAlreadyExistsException;
import com.luv4code.sf.app.ws.exception.BlogNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Value(value = "${data.exception.message1}")
    private String message1;
    @Value(value = "${data.exception.message2}")
    private String message2;
    @Value(value = "${data.exception.message3}")
    private String message3;

    @ExceptionHandler(value = BlogAlreadyExistsException.class)
    public ResponseEntity handleBlogAlreadyExistsException(BlogAlreadyExistsException blogAlreadyExistsException) {
        return new ResponseEntity(message1, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(value = BlogNotFoundException.class)
    public ResponseEntity blogNotFoundException(BlogNotFoundException blogNotFoundException) {
        return new ResponseEntity(message2, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity databaseConnectionFailsException(Exception exception) {
        return new ResponseEntity<>(message3, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}