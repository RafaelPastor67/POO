package com.mycompany.app;
public class Autor extends Pessoa{ 
    private String nacionalidade;
    private Livro[] obrasPublicadas;

    public Autor(String nacionalidade, String nome){
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setObrasPublicadas(Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }
/* 
    public Livro[] getObrasPublicadasPorGenero(String genero) {

    NAO SEI FAZER AINDA

        return ObrasPublicadasPorGenero;
    }
*/
    
}
