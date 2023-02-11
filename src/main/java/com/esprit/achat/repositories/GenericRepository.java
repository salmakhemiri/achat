package com.esprit.achat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface GenericRepository <T,ID> extends JpaRepository<T, ID> {
}
