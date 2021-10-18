package net.tg.apirestcategoria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.tg.apirestcategoria.model.Categoria;
import net.tg.apirestcategoria.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> findAll(){
		return categoriaRepository.findAll();
	}
	
	public Categoria save (Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

}
