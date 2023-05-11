package com.example.minitest.exception;

public class FileRequestException extends RuntimeException {
    public FileRequestException(String message) {
        super(message);
    }
}
