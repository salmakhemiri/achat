package com.esprit.achat.repositories;

import com.esprit.achat.persistence.entity.Question;
import com.esprit.achat.persistence.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface QuesionRepository extends GenericRepository<Question, Integer>{
}
