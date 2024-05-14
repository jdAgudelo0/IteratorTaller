package org.comportamentAdapters;

public class Libro {
    private String titulo;
    private String autor;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
