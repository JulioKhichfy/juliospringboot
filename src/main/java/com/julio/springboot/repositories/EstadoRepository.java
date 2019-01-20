package com.julio.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.springboot.domain.Estado;



@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
