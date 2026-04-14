public class Pedido {

    private int id;
    private String cliente;
    private StatusPedido status;

    public Pedido(int id, String cliente) {
        this.id = id;
        this.cliente = cliente;
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

        public void avancarStatus() {

            if (status == StatusPedido.AGUARDANDO_PAGAMENTO) {
                status = StatusPedido.PROCESSANDO;
            } else if (status == StatusPedido.PROCESSANDO) {
                status = StatusPedido.ENVIADO;
            } else if (status == StatusPedido.ENVIADO) {
                status = StatusPedido.ENTREGUE;
            } else if (status == StatusPedido.ENTREGUE || status == StatusPedido.CANCELADO) {
                // não muda
            }
    }
    public void cancelarPedido() {
        if (status != StatusPedido.ENTREGUE) {
            status = StatusPedido.CANCELADO;
            System.out.println("Pedido cancelado");
        } else {
            System.out.println("Não é possível cancelar um pedido já entregue");
        }
    }
}

