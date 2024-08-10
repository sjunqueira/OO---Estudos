package meupacote;

public class DeDentro {
    public int A;
    private double B;
    protected char C;
    String D; //Acesso Padrão

    public void atribuirValores() {
        A = 1;
        B = 2.5;
        C = '3';
        D = "4.0";
    }

    public void mostrarValores() {
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);
        System.out.println("D = " + D);
    }
}
