package org.comportamentAdapters;

import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(new Libro("agudelito", "juan"));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "juan"));
        biblioteca.agregarLibro(new Libro("Moby Dick", "juan"));

        Iterator<Libro> iterador = biblioteca.iterator();
        while (iterador.hasNext()) {
            Libro libro = iterador.next();
            System.out.println(libro.getTitulo());
            System.out.println(libro.getAutor());
        }
    }
}