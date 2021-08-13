package com.everis.tareaTallerEveris.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.everis.tareaTallerEveris.Dominio.Persona;
import com.everis.tareaTallerEveris.Repository.PersonaDAO;
import com.everis.tareaTallerEveris.Services.IPersonaService;
import com.everis.tareaTallerEveris.commons.GenericServiceImpl;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, String> implements IPersonaService{

	@Autowired
	private PersonaDAO personaDAO;
	

	@Override
	public JpaRepository<Persona, String> getDAO() {
		return personaDAO;
	}

}
