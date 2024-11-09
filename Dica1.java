import java.io.*;

public class Dica1 {
  public static void main(String[] args) throws Exception{
    FileWriter arquivoEscrita = new FileWriter(new File("arquivo.txt"));
    arquivoEscrita.write("Escrevendo uma linha de texto no arquivo . \n");
    arquivoEscrita.write("Escrevendo outra linha de texto no arquivo txt. \n");
    arquivoEscrita.write("Escrevendo mais uma linha no arquivo. \n");
    System.out.println("Linhas geradas");
    arquivoEscrita.close();
  }
}
