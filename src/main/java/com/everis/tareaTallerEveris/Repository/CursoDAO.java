package com.everis.tareaTallerEveris.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.tareaTallerEveris.Dominio.Curso;

@Repository
public interface CursoDAO extends JpaRepository<Curso,Integer> {

}
