import java.util.ArrayList;
import java.util.Date;

public class Compra {
    private double valorTotal;
    private String id;
    private Date dataCompra;
    private String idCliente; // Recebe Cpf ou Cnpj do cliente.
    private double valorPago;
    private ArrayList <Item> itensLista = new ArrayList<Item>();
    
    public Compra(String id, String idCliente, Date dataCompra, double valorTotal, double valorPago, ArrayList<Item> itensLista ) {
        this.valorTotal = valorTotal;
        this.id = id;
        this.dataCompra = dataCompra;
        this.idCliente = idCliente;
        this.valorPago = valorPago;
        this.itensLista = itensLista;
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
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
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

    public double calcularValorTotal() {
            double total = 0;
            for (Item item : itensLista) {
                total += item.precoFinal();
            }
            return total;
    }

    public void defineValorTotal() {
        this.valorTotal = calcularValorTotal();
    }
    
    public double valorRestante(){
        return valorTotal-valorPago;
    }

    
    
}
