class Cliente {
    String cpf;
    String nome;
    String telefone;
    int idade;
    double altura;
    double peso;

    double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    double calcularPesoDesejado(double metaPeso) {
        if (peso > metaPeso) return peso - metaPeso;
        else return metaPeso - peso;
    }

    void imprimirDados() {
        System.out.println(
            "CPF=" + cpf 
            + ", Nome=" + nome
            + ", Telefone=" + telefone
            + ", idade=" + idade
            + ", Altura=" + altura + "m"
            + ", Peso=" + peso + "kg"
        );
    }
}

class AppCliente {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.cpf = "999.999.999-99";
        novoCliente.nome = "Sergio Junqueira";
        novoCliente.telefone = "3223";
        novoCliente.idade = 28;
        novoCliente.altura = 1.85;
        novoCliente.peso = 90.4;

        novoCliente.imprimirDados();
        System.out.println("IMC= " + novoCliente.calcularIMC());
        double dif = novoCliente.calcularPesoDesejado(95.0);
        System.out.println("Você está a "+ dif + "Kgs de distancia do objetivo"); 
        
    }
}

