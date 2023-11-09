import java.util.Date;

public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private String cod;
    private Date dataVal; 
    
    public Produto(String nome, String descricao, double preco, String cod) {
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
        this.cod = cod;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean verificarVal(){ // Verificação caso não haja data de validade é executada na main!
        Date hoje = new Date(); // Objeto Date que possui a data atual,     
        if(dataVal.after(hoje) ){
            return true;
        }
        else {
            return false;
        }
    }

    
}

