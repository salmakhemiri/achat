package com.esprit.achat.rest;

import com.esprit.achat.persistence.entity.Rating;
import com.esprit.achat.persistence.entity.Reponse;
import com.esprit.achat.services.RatingService;
import com.esprit.achat.services.ReponseService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("rating")
@AllArgsConstructor
public class RatingController {
    private RatingService ratingService;
    @GetMapping
    List<Rating> retrieveAll(){
        return ratingService.retrieveAll();
    }
    @PostMapping("/add")
    void add(Rating r){

        ratingService.add(r);
    }
    @PutMapping("/edit")
    void update(Rating r){

        ratingService.update(r);
    }
    @DeleteMapping("/delete/{idRating}")
    void remove(Integer id){

        ratingService.remove(id);
    }
    @GetMapping("/{idRating}")
    Rating retrieve(Integer id){

        return ratingService.retrieve(id);
    }
}
