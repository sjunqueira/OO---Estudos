import java.util.Scanner;

public class Exercicio4 {
  public static void main(String [] args) {
    try(Scanner entrada = new Scanner(System.in)) {
      System.out.println("Digite um valor inteiro: ");
      //int valor = entrada.nextInt();
      //System.out.println("Você digitou o valor: " + valor);

      if (entrada.hasNextInt() == false) {
        System.out.println("ERRO! Digite um valor inteiro!");
      } else {
        int valor = entrada.nextInt();
        System.out.println("Você digitou o valor: " + valor);
      }
    }   
  }
}
