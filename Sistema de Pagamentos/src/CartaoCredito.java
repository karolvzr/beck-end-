 public class CartaoCredito extends Pagamento {

        CartaoCredito(double valor) {
            super(valor);
        }

        void processarPagamento(){
            System.out.println("Pagamento de R$" + valor + "no Cartao de Credito");
        }

    }

