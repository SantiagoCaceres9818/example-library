package com.uptc.bases.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LIBRO")
public class Libro {
    
    @Id
    @Column(name = "ID_LIBRO")
    private Long id;
    @Column(name = "TITULO")
    private String nombre;
    @Column(name = "ISBN")
    private String ibsn;

    @ManyToOne
    @JoinColumn(name = "ID_AUTOR")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "ID_EDITORIAL")
    private Editorial editorial;


    public Libro () { }

    public Libro(Long id, String ibsn) {
        this.id = id;
        this.ibsn = ibsn;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIbsn() {
        return ibsn;
    }
    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    
}
