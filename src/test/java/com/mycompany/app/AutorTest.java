package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class AutorTest{
        Autor autor = new Autor("Brasileira", "Luiz");
        Livro livro1 = new Livro("Nome criativo", autor, "Romance", true);
        Livro livro2 = new Livro("Astrofisica", autor, "Cientifico", true);
        Livro[] arrayDeLivro = new Livro[]{livro1,livro2};
        @Test
        public void TestGetNacionalidade(){
                assertEquals("Brasileira", autor.getNacionalidade());
        }
        @Test
        public void TestGetObras(){
                assertArrayEquals(null,autor.getObrasPublicadas());;
        }
        @Test
        public void TestSetObras(){
                autor.setObrasPublicadas(arrayDeLivro);
                assertArrayEquals(arrayDeLivro,autor.getObrasPublicadas());
        }
}