public class Compra {
    private double valorTotal;
    private String id;
    private String dataCompra;
    private String idCliente; // Recebe Cpf ou Cnpj do cliente.

    public Compra(double valorTotal, String id, String dataCompra, String idCliente) {
        this.valorTotal = valorTotal;
        this.id = id;
        this.dataCompra = dataCompra;
        this.idCliente = idCliente;
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

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    
    


    
    
}
