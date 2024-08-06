package com.todo.app.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.todo.app.todo.entities.Task;

public interface StudentRepository extends CrudRepository<Task, Integer> {
}
