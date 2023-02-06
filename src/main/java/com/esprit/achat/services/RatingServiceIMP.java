package com.esprit.achat.services;

import com.esprit.achat.persistence.entity.Question;
import com.esprit.achat.persistence.entity.Rating;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceIMP extends GenericServiceIMP<Rating,Integer> implements RatingService{
}
