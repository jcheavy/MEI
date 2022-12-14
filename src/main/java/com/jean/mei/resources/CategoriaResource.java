package com.jean.mei.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jean.mei.entities.Categoria;
import com.jean.mei.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
		
	@Autowired
	CategoriaService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find( @PathVariable Integer id) {
		
		Categoria obj = service.bucar(id);	
		return ResponseEntity.ok().body(obj);
	}
	
	

}
