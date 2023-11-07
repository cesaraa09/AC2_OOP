public class Cliente {
    private String nome;
    private Endereco endereco;
    private String datacadastro;

    public Cliente(String nome, Endereco endereco, String datacadastro) {
        this.nome = nome;
        this.endereco = endereco;
        this.datacadastro = datacadastro;
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

    public String getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(String datacadastro) {
        this.datacadastro = datacadastro;
    }
    
    public String paraString(){
        return "Cliente: " + nome + "\n Endereco:" + endereco.paraString() + "\n Data de cadastro:" + datacadastro; 
    }
    
    

}
