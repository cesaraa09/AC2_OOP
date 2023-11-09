import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    private double valorTotal;
    private String id;
    private Date dataCompra;
    private String idCliente; // Recebe Cpf ou Cnpj do cliente.
    private double valorPago;
    private List<Item> itens = new ArrayList<>();

    public Compra(double valorTotal, String id, Date dataCompra, String idCliente, double valorPago) {
        this.valorTotal = valorTotal;
        this.id = id;
        this.dataCompra = dataCompra;
        this.idCliente = idCliente;
        this.valorPago = valorPago;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getvalorPago() {
        return valorPago;
    }

    public void setvalorPago(double valorPago) {
        this.valorPago = valorPago;
    }
    
    public double valorRestante(){
        return valorTotal-valorPago;
    }

    public void adicionarItem(Produto produto, int qtd) {
        Item item = new Item(produto,qtd);
        itens.add(item);
        valorTotal += item.precoFinal();
    }
    
    
}
