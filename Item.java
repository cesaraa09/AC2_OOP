public class Item {
    private double preco;
    private String nomeProduto;
    private int qtd;
    private double precoF;
    private String cod;
    
    public Item(double preco, String nomeProduto, int qtd, double precoF, String cod) {
        this.preco = preco;
        this.nomeProduto = nomeProduto;
        this.qtd = qtd;
        this.precoF = precoF;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrecoF() {
        return precoF;
    }

    public void setPrecoF(double precoF) {
        this.precoF = precoF;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    
}
