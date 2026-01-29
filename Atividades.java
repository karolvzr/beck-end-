import java.util.Scanner;

public class Atividades {
    static void main() {


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite seu peso (kg): ");
        double peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("\n--- Dados do Usuário ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("IMC: %.2f%n", imc);

        sc.close();
    }
}