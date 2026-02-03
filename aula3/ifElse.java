//package aula3;

//public class ifElse {
  //  static void main() {

        //int idade =18;

  //   if(idade < 18){
      //   IO.println("Foi barrado na porta");
    // }else{
       //  System.out.println("Onde");
        // IO.println("Liberado");
   //  }

  //  }
//}

import java.util.Scanner;

static void main() {
    Scanner aluno = new Scanner(System.in);
    IO.println("Digite a primeira nota");// saida de texto no terminal
    double nota1 = aluno.nextDouble();
    IO.println("Digite a segunda nota");
    double nota2 = aluno.nextDouble();
    IO.println("Digite a terceira nota");
    double nota3 = aluno.nextDouble();

    double somarNotas = (nota1+nota2+nota3)/3;

    if (somarNotas < 4){
        IO.println("Reprovado");
        return;
    }
    if (somarNotas <= 6){
        IO.println("Recuperação");
    }
    if (somarNotas > 6){
        IO.println("Aprovado");
        return;
    }else{
        System.out.println("Voce foi aprovado!");
        IO.println("Liberado");
    }
}