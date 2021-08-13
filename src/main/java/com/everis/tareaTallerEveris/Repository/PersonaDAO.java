package com.everis.tareaTallerEveris.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.tareaTallerEveris.Dominio.Persona;

@Repository
public interface PersonaDAO extends JpaRepository<Persona,String>{

}
