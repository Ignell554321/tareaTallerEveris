package com.everis.tareaTallerEveris.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.everis.tareaTallerEveris.Dominio.Docente;

@Repository
public interface DocenteDAO extends JpaRepository<Docente,Integer>{

}
