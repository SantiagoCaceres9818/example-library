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

import com.uptc.bases.example.models.Editorial;
import com.uptc.bases.example.services.EditorialServices;

@RestController
@RequestMapping("api/editorial")
public class EditorialController {
    
    @Autowired
    private EditorialServices editorialService;

    @PostMapping
    public Editorial createEditorial(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

    @GetMapping
    public List<Editorial> getAll() {
        return editorialService.findAll();
    }

    @GetMapping("/{id}")
    public Editorial getById(@PathVariable Long id) {
        return editorialService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEditorial(@PathVariable Long id) {
        editorialService.deleteById(id);
    }
}
