package com.uptc.bases.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptc.bases.example.models.Autor;
import com.uptc.bases.example.models.Editorial;
import com.uptc.bases.example.models.Libro;
import com.uptc.bases.example.repository.AutorRepository;
import com.uptc.bases.example.repository.EditorialRepository;
import com.uptc.bases.example.repository.LibroReopsitory;

@Service
public class LibroServices {

    @Autowired
    private LibroReopsitory libroReopsitory;

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private EditorialRepository editorialRepository;

    public Libro save(Libro libro) {
        Autor autor = autorRepository.findById(libro.getAutor().getId())
                .orElseThrow(() -> new IllegalArgumentException("Autor no encontrado con id: " + libro.getAutor().getId()));
        libro.setAutor(autor);
        autor.getLibros().add(libro);

        Editorial editorial = editorialRepository.findById(libro.getEditorial().getId())
                .orElseThrow(() -> new IllegalArgumentException("Editorial no encontrada con id: " + libro.getEditorial().getId()));
        libro.setEditorial(editorial);
        editorial.getLibros().add(libro);
        return libroReopsitory.save(libro);
    }

    public List<Libro> findAll() {
        return libroReopsitory.findAll();
    }

    public Libro findById(Long id) {
        return libroReopsitory.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        libroReopsitory.deleteById(id);
    }

}
