package com.jean.mei.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jean.mei.entities.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
