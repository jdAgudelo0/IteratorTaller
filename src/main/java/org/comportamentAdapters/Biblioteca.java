package org.comportamentAdapters;

import java.util.ArrayList;
import java.util.Iterator;

class Biblioteca implements Iterable<Libro> {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public Iterator<Libro> iterator() {
        return new Iterator<Libro>() {
            private int indiceActual = 0;

            @Override
            public boolean hasNext() {
                return indiceActual < libros.size();
            }

            @Override
            public Libro next() {
                return libros.get(indiceActual++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("error");
            }
        };
    }
}