package ex1;

import java.util.Scanner;

public class Principal {
    static void main(){

       // Scanner sc = new Scanner(System.in);
      //  IO.println("Digite o nome");
        //String nome = sc.next();
      //  IO.println("Digite a idade");
       // int idade = sc.nextInt();
       // IO.println("Digite o sexo");
       // String sexo= sc.next();
       // IO.println("Digite a raca");
       // String raca = sc.next();

       // Cachorro cachorro = new Cachorro(nome, idade, sexo, raca);
      //  IO.println(cachorro);


        Scanner sc = new Scanner(System.in);
        IO.println("Digite o nome");
        String nome = sc.next();
        IO.println("Digite a idade");
        int idade = sc.nextInt();
        IO.println("Digite o sexo");
        String sexo= sc.next();
        IO.println("Digite a raca");
        String raca = sc.next();


        Gato gato = new Gato(nome, idade, sexo, raca);
         IO.println(gato);
    }
}
