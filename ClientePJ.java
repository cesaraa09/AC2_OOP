import java.util.Date;

public class ClientePJ extends Cliente {
    private String cnpj;
    private String razao;
    private int prazoMax;

    public ClientePJ(String nome, Endereco endereco, Date datacadastro, String cnpj, String razao, int prazoMax) {
        super(nome, endereco, datacadastro);
        this.cnpj = cnpj;
        this.razao = razao;
        this.prazoMax = prazoMax;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public int getPrazoMax() {
        return prazoMax;
    }

    public void setPrazoMax(int prazoMax) {
        this.prazoMax = prazoMax;
    }

    public String paraString(){
        return super.paraString() + "\nCnpj: " + cnpj + "\nRazao Social: " + razao + "\nPrazo maximo: " + prazoMax; 
    }    
}