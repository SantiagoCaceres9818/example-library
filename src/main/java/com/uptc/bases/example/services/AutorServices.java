package com.uptc.bases.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptc.bases.example.models.Autor;
import com.uptc.bases.example.repository.AutorRepository;

@Service
public class AutorServices {
    
    @Autowired
    private AutorRepository autorRepository;

    public Autor saveAutor(Autor autor) {
        return autorRepository.save(autor);
    }

}
