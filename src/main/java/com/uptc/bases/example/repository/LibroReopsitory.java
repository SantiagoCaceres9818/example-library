package com.uptc.bases.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptc.bases.example.models.Libro;

public interface LibroReopsitory extends JpaRepository <Libro, Long>  {
    
}
