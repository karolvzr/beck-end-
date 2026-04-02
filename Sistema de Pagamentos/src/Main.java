public class Main {
    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito(100);
        Pagamento p2 = new Boleto(200);
        Pagamento p3 = new Pix(50);

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
    }
}