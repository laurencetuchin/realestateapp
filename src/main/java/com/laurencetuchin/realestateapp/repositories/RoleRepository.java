package com.laurencetuchin.realestateapp.repositories;

import com.laurencetuchin.realestateapp.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
