package com.dinesh.DepartmentService.exception;

public class DepartmentNotFoundException extends RuntimeException{

    public DepartmentNotFoundException() {
        super("Department Not Found");
    }

    public DepartmentNotFoundException(String message) {
        super(message);
    }
}
