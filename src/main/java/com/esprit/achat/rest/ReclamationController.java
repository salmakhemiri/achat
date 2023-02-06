package com.esprit.achat.rest;

import com.esprit.achat.persistence.entity.Reclamation;
import com.esprit.achat.persistence.entity.Role;
import com.esprit.achat.services.ReclamationService;
import com.esprit.achat.services.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("reclamation")
@AllArgsConstructor
public class ReclamationController {
    private ReclamationService reclamationService;
    @GetMapping
    List<Reclamation> retrieveAll(){

        return reclamationService.retrieveAll();
    }
    @PostMapping("/add")
    void add(Reclamation r){
        reclamationService.add(r);
    }
    @PutMapping("/edit")
    void update(Reclamation r){

        reclamationService.update(r);
    }
    @DeleteMapping("/delete/{idReclamation}")
    void remove(Integer id){

        reclamationService.remove(id);
    }
    @GetMapping("/{idReclamation}")
    Reclamation retrieve(Integer id){

        return reclamationService.retrieve(id);
    }
}
