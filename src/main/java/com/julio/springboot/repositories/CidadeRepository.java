package com.julio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.springboot.domain.Cidade;



@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
