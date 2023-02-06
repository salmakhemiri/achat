package com.esprit.achat.services;

import com.esprit.achat.persistence.entity.Question;
import com.esprit.achat.persistence.entity.Role;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceIMP extends GenericServiceIMP<Question,Integer> implements QuestionService{
}