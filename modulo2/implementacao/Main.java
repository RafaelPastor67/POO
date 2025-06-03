import java.util.Date;

public class Main {
    public static void main(String[] args){

        //Criando Autor (Ele começa sem Livros, mas logo na criação de um livro ele é setado como OBRA dele)
        Autor autor1 = new Autor("brasileiro","Machado de Assis");

        //Criando Livro
        Livro livro1 = new Livro("Memorias Postumas", autor1, "Romance", false);
        // Passando o livro como obra do autor
        autor1.setObrasPublicadas(new Livro[] {livro1});// MUDAR FUTURAMENTE

        //Criando Usuário
        Usuario usuario1 = new Usuario(20,"Matheus");
        
        //Criando Emprestimo
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro1, usuario1);

        livro1.validarDiponibilidade();
        System.out.printf("Livro: %s \n", livro1.getTitulo());
        System.out.printf("Autor: %s \n", autor1.getNome());
        System.out.printf("Genero: %s \n", livro1.getGenero());
        System.out.printf("Usuario: %s \n", usuario1.getNome());
        System.out.printf("Idade: %s \n", usuario1.getIdade());
        System.out.printf("Data de Retirada: %s \n", emprestimo.getDataRetirada());
        System.out.printf("Data de Devolucao: %s \n", emprestimo.getDataDevolucao());
    
        
    }
}
