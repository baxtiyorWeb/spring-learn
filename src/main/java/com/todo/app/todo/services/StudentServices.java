package com.todo.app.todo.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.app.todo.entities.Task;
import com.todo.app.todo.repository.StudentRepository;

@Service
public class StudentServices {
     @Autowired
     private StudentRepository studentRepository;

     public List<Task> getAllTodos() {
          Iterable<Task> tasks = studentRepository.findAll();
          return StreamSupport.stream(tasks.spliterator(), false)
                    .collect(Collectors.toList());
     }

     public Task create(Task entity) {
          studentRepository.save(entity);
          return entity;
     }

}
