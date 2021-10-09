package com.example.ToDoApp;

import com.example.ToDoApp.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo , Long> {
}
