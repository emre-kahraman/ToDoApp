package com.example.ToDoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @GetMapping
    public String home(Model model){
        model.addAttribute("todos",toDoService.findAllToDos());
        model.addAttribute("newtodo", new ToDo());
        return "index";
    }

    @PostMapping
    public String addtodo(@ModelAttribute ToDo newtodo){
        toDoService.addtodo(newtodo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deletetodo(@PathVariable Long id){
        toDoService.deletetodo(id);
        return "redirect:/";
    }

    @GetMapping("/api/todos")
    public List<ToDo> findAllToDos(){
        return toDoService.findAllToDos();
    }
}
