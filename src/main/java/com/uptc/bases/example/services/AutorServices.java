package com.uptc.bases.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptc.bases.example.models.Autor;
import com.uptc.bases.example.repository.AutorRepository;

@Service
public class AutorServices {
    
    @Autowired
    private AutorRepository autorRepository;

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> findAll () {
        return autorRepository.findAll();
    }

    public Autor findById (Long id) {
        return autorRepository.findById(id) .orElse(null);
    }

    public void deleteById (Long id) {
        autorRepository.deleteById(id);
    }
}
