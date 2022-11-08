package Retornos;

public class Main {
    public static void main(String[] args) {
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(3, 4);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(3, 5, 2);
        System.out.println("Area do trapézio: " + areaTrapezio);
    }

}
