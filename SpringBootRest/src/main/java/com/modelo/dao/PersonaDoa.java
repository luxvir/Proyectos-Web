package com.modelo.dao;

import com.modelo.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaDoa extends JpaRepository<Persona, Integer> {

}
