package com.everis.tareaTallerEveris.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.everis.tareaTallerEveris.Dominio.Curso;
import com.everis.tareaTallerEveris.Repository.CursoDAO;
import com.everis.tareaTallerEveris.Services.ICursoService;
import com.everis.tareaTallerEveris.commons.GenericServiceImpl;

@Service
public class CursoServiceImpl extends GenericServiceImpl<Curso, Integer> implements ICursoService{

	@Autowired
	private CursoDAO cursoDAO;

	
	@Override
	public JpaRepository<Curso, Integer> getDAO() {
		return cursoDAO;
	}

}
