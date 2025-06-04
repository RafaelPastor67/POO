package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;


public class PessoaTest {
    @Test
    public void TestGetNome(){
        Pessoa pessoa = new Pessoa("Rafael");

        //getNome -> retorna nome da Pessoa, nao precisa de parametro
        assertEquals("Rafael", pessoa.getNome());
    }

@Test
public void testSetNome(){
    Pessoa pessoa = new Pessoa("Rafa");

    //setNome -> define um novo nome pra Pessoa
        pessoa.setNome("Rafa");
        assertEquals("Rafa", pessoa.getNome());
}
@Test
public void testGetLivro(){
    Livro livro1 = new Livro("Livro Teste", null, "Romance", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro2 = new Livro("Livro Teste2", null, "autoaujda", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro3 = new Livro("Livro Teste3", null, "ficcao", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Pessoa pessoa = new Pessoa("Rafa");
    Livro[] livrosteste = new Livro[]{livro1,livro2,livro3};
    pessoa.setLivros(livrosteste);
    //getLivro ->Retorna lista de livros da Pessoa, não recebe parâmetro
        assertArrayEquals(livrosteste, pessoa.getLivros());
}
@Test
public void testSetLivro(){
    Livro livro1 = new Livro("Livro Teste", null, "Romance", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro2 = new Livro("Livro Teste2", null, "autoaujda", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro3 = new Livro("Livro Teste3", null, "ficcao", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Pessoa pessoa = new Pessoa("Rafa");
    Livro[] livrosteste = new Livro[]{livro1,livro2,livro3};
    pessoa.setLivros(livrosteste);

    Livro livro4 = new Livro("Livro Teste", null, "Romance", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro5 = new Livro("Livro Teste2", null, "autoaujda", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro livro6 = new Livro("Livro Teste3", null, "ficcao", false);//Deixei o campo de Autor como nulo pq aqui ele ainda nao foi criado
    Livro[] livrosteste2 = new Livro[]{livro4,livro5,livro6};
    //setLivros -> Define lista de Livro, recebe array de objetos do tipo Livro
    pessoa.setLivros(livrosteste2);
    assertArrayEquals(livrosteste2, pessoa.getLivros());
        
}
}





