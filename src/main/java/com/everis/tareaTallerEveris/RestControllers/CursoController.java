package com.everis.tareaTallerEveris.RestControllers;

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

import com.everis.tareaTallerEveris.Dominio.Curso;
import com.everis.tareaTallerEveris.Services.Impl.CursoServiceImpl;

@Controller
@RequestMapping("/Curso")
public class CursoController {
	
	
	@Autowired
	private CursoServiceImpl cursoServiceImpl;
	
	
	@RequestMapping(value= {"/Listar"},method=RequestMethod.GET)
	public @ResponseBody List<Curso> listar() {
		
		
		 return cursoServiceImpl.listar();
	}
	
	//ELIMINAR Y EDITAR
	
	@RequestMapping(value= {"/Guardar"},method=RequestMethod.POST)
	public @ResponseBody Curso curso(@RequestBody Curso entity) {
		System.out.println(entity);
		 return cursoServiceImpl.guardar(entity);
	}


	@RequestMapping(value= {"/Eliminar/{id}"},method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminar(@PathVariable Integer id) {
		
		Curso entity=cursoServiceImpl.buscar(id);
		if(entity!=null) {
			cursoServiceImpl.eliminar(entity);
		}
		
	}

}
