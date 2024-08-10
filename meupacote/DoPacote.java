package meupacote;

public class DoPacote {
    public static void main(String[] args) {
        DeDentro objeto = new DeDentro();
        objeto.A = 10;
        objeto.B = 7.0; //Está dando erro porque o atributo B foi declarado como privado
        objeto.C = 'R';
        objeto.D = "Teste de acesso";

        objeto.atribuirValores();
        objeto.mostrarValores();
    }
}
