package com.Assignment2.Housing.Model;

import org.springframework.http.HttpStatus;

import java.util.List;

public class ResponseDTO {
    private List<?> body;
    private String message;
    private String errorMessage;
    private HttpStatus status;

    public List<?> getBody() {
        return body;
    }

    public void setBody(List<?> body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
