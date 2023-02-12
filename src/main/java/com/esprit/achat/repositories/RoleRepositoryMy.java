package com.esprit.achat.repositories;

import com.esprit.achat.persistence.entity.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoryMy extends CrudRepository<Role, Integer> {
}
