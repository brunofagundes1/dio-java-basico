public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);

        System.out.println("------------");

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(concatenacao);

        System.out.println("------------");

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        System.out.println("------------");

        numero = 5;
        // x repeticao
        // numero = numero + 1;

        System.out.println(numero--);

        System.out.println(numero);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        System.out.println("------------");

        int a, b;

        a = 6;
        b = 6;

        int resultado = a == b ? 1 : 0;

        System.out.println(resultado);

        System.out.println("------------");

        String nomeUm = "BRUNO";
        String nomeDois = new String("BRUNO");

        System.out.println(nomeUm.equals(nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        System.out.println("------------");

        boolean condicao1 = true;

        boolean condicao2 = false;

        if (condicao1 && (7 > 4)) {
            System.out.println("As duas condiçoes sao verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condiçoes é verdadeira");
        }

        System.out.println("fim");

    }
}
