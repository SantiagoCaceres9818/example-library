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

import com.uptc.bases.example.models.Autor;
import com.uptc.bases.example.services.AutorServices;

@RestController
@RequestMapping("/api/autor")
public class AutorController {

    @Autowired
    private AutorServices autorService;

    @PostMapping
    public Autor saveAutor(@RequestBody Autor autor) {
        return autorService.save(autor);
    }

    @GetMapping
    public List<Autor> getAll() {
        return autorService.findAll();
    }

    @GetMapping("/{id}")
    public Autor getById (@PathVariable Long id) {
        return autorService.findById(id);
    }

     @DeleteMapping("/{id}")
    public void eliminarAutor(@PathVariable Long id) {
        autorService.deleteById(id);
    }
}
