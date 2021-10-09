package com.example.ToDoApp;

import com.example.ToDoApp.ToDo;
import com.example.ToDoApp.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private final ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAllToDos() {
        return toDoRepository.findAll();
    }

    public ToDo addtodo(ToDo todo) {
        return toDoRepository.save(todo);
    }
}
