package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class LivroTest{

        Autor autor = new Autor("Jess", "Brasileira");

        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);

        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        @Test
        public void testGetTitulo(){
                assertEquals("Java Basico", livro1.getTitulo());
                assertEquals("Java Avançado", livro2.getTitulo());
        }
        @Test
        public void testGetGenero(){
                assertEquals("tecnologia", livro1.getGenero());
        }
        @Test
        public void testGetAutor(){
                assertEquals(autor, livro1.getAutor());
        }
        @Test
        public void testIsDisponivel(){
                assertEquals(true, livro1.isDisponivel());
                assertEquals(false, livro2.isDisponivel());
        }
}
        
