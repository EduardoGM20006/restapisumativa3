package net.tg.apirestcategoria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.tg.apirestcategoria.model.Categoria;
import net.tg.apirestcategoria.service.CategoriaService;

@RestController
@RequestMapping("api/v1/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("")
	public ResponseEntity<List<Categoria>> getAll(){
		List<Categoria> categorias = new ArrayList<Categoria>();
		categoriaService.findAll().forEach(categorias::add);
		if(categorias.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(categorias, HttpStatus.OK);
		}
	}
	
	@PostMapping("")
	public ResponseEntity<Categoria> create(@RequestBody Categoria categoria){
		return new ResponseEntity<>(categoriaService.save(categoria), HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
}
