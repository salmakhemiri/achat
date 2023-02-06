package com.esprit.achat.services;

import com.esprit.achat.persistence.entity.Question;
import com.esprit.achat.persistence.entity.Reponse;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class ReponseServiceIMP extends GenericServiceIMP<Reponse,Integer> implements ReponseService{
}
