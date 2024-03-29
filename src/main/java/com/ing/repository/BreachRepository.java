package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.entity.Breach;

@Repository
public interface BreachRepository extends JpaRepository<Breach, Long>{

}
