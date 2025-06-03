package com.mycompany.app;
public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private boolean disponivel;

    public Livro(String titulo, Autor autor, String genero, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponivel = disponivel;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel(){
        return disponivel;
    }

    public void validarDiponibilidade(){
        if(disponivel){
            System.out.print("O livro esta disponivel\n");
        }
        else{
            System.out.print("O livro nao esta disponivel\n");
        }
    }
}

