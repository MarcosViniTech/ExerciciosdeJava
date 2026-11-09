/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retangulomedidas;

/**
 *
 * @author POS
 */
import java.util.Scanner;

public class RetanguloMedidas {
    double largura;
    double altura;

    // Método para calcular a área
    public double area() {
        return largura * altura;
    }

    // Método para calcular o perímetro
    public double perimetro() {
        return 2 * (largura + altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RetanguloMedidas r = new RetanguloMedidas();

        System.out.print("Digite a largura: ");
        r.largura = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        r.altura = scanner.nextDouble();

        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());

        scanner.close();
    }
}


