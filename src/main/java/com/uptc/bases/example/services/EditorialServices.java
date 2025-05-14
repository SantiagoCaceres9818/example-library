package com.uptc.bases.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptc.bases.example.models.Editorial;
import com.uptc.bases.example.repository.EditorialRepository;

@Service
public class EditorialServices {
    
    @Autowired
    private EditorialRepository editorialRepository;

    public Editorial save (Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    public List<Editorial> findAll () {
        return editorialRepository.findAll();
    }

    public Editorial findById (Long id) {
        return editorialRepository.findById(id).orElse(null);
    }

    public void deleteById (Long id) {
        editorialRepository.deleteById(id);
    }
}
