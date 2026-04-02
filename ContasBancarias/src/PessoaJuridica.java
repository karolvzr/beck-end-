public class PessoaJuridica extends Conta {

    public PessoaJuridica(int numero, String agencia, String titular, double saldo) {
        super(numero, agencia, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.5;
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            System.out.println("Saque: R$ " + valor + " | Taxa: R$ " + taxa);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public double calcularTarifaMensal() {
        return 20;
    }
}