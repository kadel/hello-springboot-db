package com.example.demo;

import com.example.demo.Task;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TaskRepository extends CrudRepository<Task, Integer> {

}
