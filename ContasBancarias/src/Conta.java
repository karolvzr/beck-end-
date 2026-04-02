public abstract class Conta {
        protected int numero;
        protected String agencia;
        protected String titular;
        protected double saldo;

        public Conta(int numero, String agencia, String titular, double saldoInicial) {
            this.numero = numero;
            this.agencia = agencia;
            this.titular = titular;
            this.saldo = saldoInicial;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && saldo >= valor) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado.");
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Saldo atual: R$ " + saldo);
        }

        // Método abstrato
        public abstract double calcularTarifaMensal();
    }

