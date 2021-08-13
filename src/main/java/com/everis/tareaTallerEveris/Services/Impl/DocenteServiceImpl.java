package com.everis.tareaTallerEveris.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import com.everis.tareaTallerEveris.Dominio.Docente;
import com.everis.tareaTallerEveris.Repository.DocenteDAO;
import com.everis.tareaTallerEveris.Services.IDocenteService;
import com.everis.tareaTallerEveris.commons.GenericServiceImpl;

@Service
public class DocenteServiceImpl extends GenericServiceImpl<Docente, Integer> implements IDocenteService{

	@Autowired
	private DocenteDAO docenteDAO;
	
	@Override
	public JpaRepository<Docente, Integer> getDAO() {
		return docenteDAO;
	}

}
