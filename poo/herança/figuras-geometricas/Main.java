import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo;
        double base, altura;

        System.out.println("Digite a base:");
        base = sc.nextDouble();
        System.out.println("Digite a altura:");
        altura = sc.nextDouble();

        retangulo = new Retangulo(base,altura);

        System.out.println("Área do retângulo: "+ retangulo.calcArea());
        System.out.println("Perímetro do retângulo: "+ retangulo.calcPerimetro());
        System.out.println(retangulo.toString());
        

        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo(5, 10);
        System.out.println("Área do triângulo retângulo: "+ trianguloRetangulo.calcArea());
        System.out.println("Perímetro do triângulo retângulo: "+ trianguloRetangulo.calcPerimetro());

    }
}