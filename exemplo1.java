import java.util.Scanner;

public class exemplo1 {
  public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
      int codigo;
      String nome;
      double preco;

      System.out.print("Digite o código do produto: ");
      codigo = entrada.nextInt();
      System.out.print("Digite o nome do produto: ");
      nome = entrada.next();
      System.out.print("Digite o preço do produto: ");
      preco = entrada.nextDouble();

      System.out.println("Produto Cadastrado");
      System.out.println("Código: " + codigo);
      System.out.println("Nome: " + nome);
      System.out.println("Preço: " + preco);
    }
  }
}