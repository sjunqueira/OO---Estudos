import meupacote.DeDentro;

public class DeFora {
    public static void main(String[] args) {
        DeDentro objeto = new DeDentro();
        objeto.A = 10; //OK, o atributo foi declarado como public
        //objeto.B = 7.0; //ERRO, o atributo foi declarado como private
        //objeto.C = 'C'; // ERRO, o atributo foi declarado como protected
        //objeto.D = "Teste de acesso"; //Erro, o atributo foi declarado de forma padrão

        //objeto.atribuirValores();
        objeto.mostrarValores();
    }
}
