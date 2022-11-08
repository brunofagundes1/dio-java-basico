package Criacao;
public class Emprestimo {
    public static void calcularParcelas(double valor, int parcelas) {

        switch (parcelas) {
            case 1:
            case 2:
            case 3:
                taxaZero(valor);
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                taxa(valor, parcelas);
                break;
            default:
                System.out.println("Numero de parcelas inválido.");
        }
    }

    public static void taxaZero(double valor) {
        System.out.println("Valor final: " + valor);
    }

    public static void taxa(double valor, double parcelas) {
        double taxa = parcelas / 10;
        double valorFinal = valor + (valor * taxa);
        System.err.println("Valor final: " + valorFinal);
    }
}
