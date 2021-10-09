package com.example.ToDoApp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String context;
    //private boolean completed = false;


    public ToDo(String text) {
        this.id = null;
        this.context = text;
    }

    public ToDo(){
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "text='" + context + '\'' +
                '}';
    }
}
