package com.dinesh.DepartmentService.service;

import com.dinesh.DepartmentService.entity.Department;
import com.dinesh.DepartmentService.repository.DepartmentRepository;
import com.dinesh.DepartmentService.util.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository repository;

    public ResponseEntity<ResponseBody> getAll() {
        Iterable<Department> departments = repository.findAll();
        ResponseBody responseBody = new ResponseBody(departments);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    public ResponseEntity<ResponseBody> getById(long id) {
        Optional<Department> department = repository.findById(id);
        ResponseBody responseBody = new ResponseBody(department);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    public ResponseEntity<ResponseBody> create(Department department) {
        Department savedDepartment = repository.save(department);
        ResponseBody responseBody = new ResponseBody(savedDepartment);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    public ResponseEntity<ResponseBody> delete(long id) {
        repository.deleteById(id);
        ResponseBody responseBody = new ResponseBody(null);
        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }
}
