package Criacao;

public class Main {
    public static void main(String[] args) {

        // Calculadora
        Calculadora.soma(3, 5);
        Calculadora.subtracao(6.3, 3.8);
        Calculadora.multiplicacao(2.5, 4);
        Calculadora.divisao(9, 4.5);

        // Mensagem
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        // Empréstimo
        Emprestimo.calcularParcelas(1000, 2);
        Emprestimo.calcularParcelas(1000, 6);
        Emprestimo.calcularParcelas(1000, 12);
    }
}
