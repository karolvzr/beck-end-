public enum StatusPedido {

    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    PROCESSANDO("Pedido em processamento"),
    ENVIADO("Pedido enviado para transporte"),
    ENTREGUE("Pedido entregue ao cliente"),
    CANCELADO("Pedido cancelado");

    private String descricao;

    StatusPedido(String descricao) {
        this.descricao = descricao;
    }
     public String getDescricao() {
        return descricao;
    }
}

