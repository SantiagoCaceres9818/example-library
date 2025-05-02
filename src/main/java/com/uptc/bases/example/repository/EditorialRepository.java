package com.uptc.bases.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uptc.bases.example.models.Editorial;

public interface EditorialRepository extends JpaRepository<Editorial, Long> {
    
}
