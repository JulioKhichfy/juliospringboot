package com.julio.springboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.julio.springboot.domain.Categoria;
import com.julio.springboot.repositories.CategoriaRepository;

@SpringBootApplication
public class JuliospringbootApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(JuliospringbootApplication.class, args);
	}

	//CommandLineRunner para popular a tabela CATEGORIA
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));//método novo SaveAll para spring2.x.x
		
	}

}

