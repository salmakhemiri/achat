package com.esprit.achat.rest;

import com.esprit.achat.persistence.entity.Question;
import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.services.QuestionService;
import com.esprit.achat.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("question")
@AllArgsConstructor
public class QuestionController {
    private QuestionService questionService;
    @GetMapping
    List<Question> retrieveAll(){
        return questionService.retrieveAll();
    }
    @PostMapping("/add")
    void add(Question q){
        questionService.add(q);
    }
    @PutMapping("/edit")
    void update(Question q){
        questionService.update(q);
    }
    @DeleteMapping("/delete/{idQuestion}")
    void remove(Integer id){
        questionService.remove(id);
    }
    @GetMapping("/{idQuestion}")
    Question retrieve(Integer id){
        return questionService.retrieve(id);
    }
}
