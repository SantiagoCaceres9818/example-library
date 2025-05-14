package com.uptc.bases.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uptc.bases.example.models.Libro;
import com.uptc.bases.example.services.LibroServices;

@RestController
@RequestMapping("api/libro")
public class LibroController {
    
    @Autowired
    private LibroServices libroService;

    @PostMapping
    public Libro createBook(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @GetMapping
    public List<Libro> getAll() {
        return libroService.findAll();
    }

    @GetMapping("/{id}")
    public Libro findById(@PathVariable Long id) {
        return libroService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        libroService.deleteById(id);
    }

}
