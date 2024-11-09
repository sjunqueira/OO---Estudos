import java.io.*;
import java.util.Scanner;

public class Dica2 {
  public static void main (String[] args) throws Exception {
    FileInputStream streamArquivo = new FileInputStream(new File("arquivo.txt"));
    Scanner leitorArquivo = new Scanner(streamArquivo);
    while (leitorArquivo.hasNextLine()) {
      String linhaArquivo = leitorArquivo.nextLine();
      System.out.println("Conteudo da linha lida: " + linhaArquivo);
    }
    leitorArquivo.close();
    streamArquivo.close();
  }
}
