package com.todo.app.todo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todo.app.todo.entities.Task;
import com.todo.app.todo.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {
     @Autowired
     private StudentServices studentServices;

     @PostMapping("/create")
     public Task create(@RequestBody Task entity) {
          return studentServices.create(entity);
     }

     @GetMapping("/get-todos")
     public List<Task> getAll() {
          return studentServices.getAllTodos();
     }

}
