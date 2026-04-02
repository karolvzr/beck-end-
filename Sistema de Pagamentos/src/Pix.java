 public class Pix extends Pagamento {

        Pix(double valor) {
            super(valor);
        }

        void processarPagamento(){
            System.out.println("Pagamento de R$" + valor + "via Pix");
        }

    }

