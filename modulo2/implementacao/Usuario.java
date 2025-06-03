public class Usuario extends Pessoa{
    private int idade;
    private Emprestimo[] historicoEmprestimo;

    public Usuario(int idade, String nome){
        super(nome);
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade; 
    }
    
    public void setHistoricoEmprestimo(Emprestimo[] historicoEmprestimo) {
        this.historicoEmprestimo = historicoEmprestimo;
    }
    
    public Emprestimo[] getHistoricoEmprestimo() {
        return historicoEmprestimo;
    }
}
