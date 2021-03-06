package net.tg.apirestcategoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.tg.apirestcategoria.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
