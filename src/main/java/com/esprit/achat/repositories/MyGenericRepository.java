package com.esprit.achat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@NoRepositoryBean
public interface MyGenericRepository<T,ID> extends JpaRepository<T, ID> {
}
