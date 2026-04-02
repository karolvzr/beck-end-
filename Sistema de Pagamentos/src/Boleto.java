public class Boleto extends Pagamento {

        Boleto(double valor) {
            super(valor);
        }

        void processarPagamento(){
            System.out.println("Pagamento de R$" + valor + "via Boleto");
        }
    }

