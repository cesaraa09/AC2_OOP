import java.util.Date;

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Date datacadastro;

    public Cliente(String nome, Endereco endereco, java.util.Date hoje) {
        this.nome = nome;
        this.endereco = endereco;
        this.datacadastro = hoje;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Date datacadastro) {
        this.datacadastro = datacadastro;
    }
    
    public String paraString(){
        return "Cliente: " + nome + "\n" + endereco.paraString() + "\nData de cadastro:" + datacadastro; 
    }
    
    

}
