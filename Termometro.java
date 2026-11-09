/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package termometro;

/**
 *
 * @author POS
 */
import java.util.Scanner;

// Classe normal, sem public
class TermometroClasse {
    double celsius;

    public TermometroClasse(double celsius) {
        this.celsius = celsius;
    }

    public double paraFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double paraKelvin() {
        return celsius + 273.15;
    }
}

// Classe pública com main
public class Termometro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        TermometroClasse t = new TermometroClasse(celsius);

        System.out.println("Temperatura em Celsius: " + t.celsius + " °C");
        System.out.println("Temperatura em Fahrenheit: " + t.paraFahrenheit() + " °F");
        System.out.println("Temperatura em Kelvin: " + t.paraKelvin() + " K");

        scanner.close();
    }
}
