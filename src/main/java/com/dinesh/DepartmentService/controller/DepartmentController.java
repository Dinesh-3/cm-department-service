package com.dinesh.DepartmentService.controller;

import com.dinesh.DepartmentService.entity.Department;
import com.dinesh.DepartmentService.service.DepartmentService;
import com.dinesh.DepartmentService.util.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping()
    ResponseEntity<ResponseBody> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<ResponseBody> get(@PathVariable long id) {
        return service.getById(id);
    }

    @PostMapping()
    ResponseEntity<ResponseBody> create(@RequestBody Department department) {
        return service.create(department);
    }

    @PutMapping()
    ResponseEntity<ResponseBody> update(@RequestBody Department department) {
        return service.create(department);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<ResponseBody> delete(@PathVariable long id) {
        return service.delete(id);
    }

}
