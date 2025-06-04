package com.mycompany.app;
import java.util.Date;

import static org.junit.Assert.*;
import org.junit.Test;

public class EmprestimoTest {

        Date dataRetirada = new Date();

        Date dataDevolucao = new Date();

        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);

        Usuario usuario = new Usuario(21,"Gabriel");

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        //getDataRetirada
        @Test
        public void TestGetDataRetirada(){
                assertEquals(dataRetirada,emprestimo.getDataRetirada());
        }
        @Test
        public void TestGetDataDevolucao(){
                assertEquals(dataDevolucao,emprestimo.getDataDevolucao());
        }
        @Test
        public void testGetLivro(){
                assertEquals(livro,emprestimo.getLivro());
        }
        @Test
        public void testGetUsuario(){
                assertEquals(usuario,emprestimo.getUsuario());
        }

}
