public class ClientePF extends Cliente {
    private String cpf;
    private int qtdparcelas;

    public ClientePF(String nome, Endereco endereco, String datacadastro, String cpf, int qtdparcelas) {
        super(nome, endereco, datacadastro);
        this.cpf = cpf;
        this.qtdparcelas = qtdparcelas;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getQtdparcelas() {
        return qtdparcelas;
    }

    public void setQtdparcelas(int qtdparcelas) {
        this.qtdparcelas = qtdparcelas;
    }

    

}
