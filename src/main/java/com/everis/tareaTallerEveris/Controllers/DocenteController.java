package com.everis.tareaTallerEveris.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.everis.tareaTallerEveris.Dominio.Docente;
import com.everis.tareaTallerEveris.Services.Impl.DocenteServiceImpl;
import com.everis.tareaTallerEveris.Services.Impl.PersonaServiceImpl;

@Controller
@RequestMapping("/Docente")
public class DocenteController {
	
	@Autowired
	private DocenteServiceImpl DocenteServiceImpl;
	
	@Autowired
	private PersonaServiceImpl PersonaServiceImpl;
	
	
	@RequestMapping(value= {"/Listar"},method=RequestMethod.GET)
	public @ResponseBody List<Docente> listar() {
		
		 return DocenteServiceImpl.listar();
	}

	//GUARDAR Y EDITAR
	
	@RequestMapping(value= {"/Guardar"},method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	public @ResponseBody Docente guardar(@RequestBody Docente docente) {
		
		
		PersonaServiceImpl.guardar(docente.getPersona());
		 return DocenteServiceImpl.guardar(docente);
	}
	
	
	@RequestMapping(value= {"/Eliminar/{id}"},method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		
		Docente entity=DocenteServiceImpl.buscar(id);
		if(entity!=null) {
			DocenteServiceImpl.eliminar(entity);
		}
	}
	
	@RequestMapping(value= {"/Buscar/{id}"},method=RequestMethod.GET)
	public  @ResponseBody Docente buscar(@PathVariable Integer id) {
		
		Docente entity=DocenteServiceImpl.buscar(id);
		if(entity!=null) {
			return entity;
		}
		return null;
	}

}
