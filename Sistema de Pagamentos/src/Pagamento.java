public abstract class Pagamento {

        double valor;

        Pagamento(double valor){
            this.valor = valor;
        }

        abstract void processarPagamento();
    }

