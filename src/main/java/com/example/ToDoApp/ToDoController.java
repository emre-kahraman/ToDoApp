package com.example.ToDoApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ToDoController {

    private final ToDoService toDoService;

    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }


    @GetMapping
    public String home(Model model){
        toDoService.addtodo(new ToDo("asd"));
        model.addAttribute("todos",toDoService.findAllToDos());
        model.addAttribute("newtodo", new ToDo());
        return "index";
    }

    @PostMapping
    public String addtodo(@ModelAttribute ToDo newtodo){
        toDoService.addtodo(newtodo);
        return "redirect:/";
    }

    @GetMapping("/api/todos")
    public List<ToDo> findAllToDos(){
        return toDoService.findAllToDos();
    }
}
