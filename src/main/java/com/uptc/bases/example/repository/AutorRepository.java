package com.uptc.bases.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptc.bases.example.models.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long>{
    
}
