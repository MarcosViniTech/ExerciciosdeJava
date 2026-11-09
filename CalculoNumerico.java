/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculonumerico;

import java.util.Scanner;

public class CalculoNumerico {
    String nome;
    double peso;
    double altura;

    double calcularIMC() {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoNumerico paciente = new CalculoNumerico();

        System.out.print("Digite o nome: ");
        paciente.nome = sc.nextLine();

        System.out.print("Digite o peso (kg): ");
        paciente.peso = sc.nextDouble();

        System.out.print("Digite a altura (m): ");
        paciente.altura = sc.nextDouble();

        System.out.printf("O IMC de %s é: %.2f%n", paciente.nome, paciente.calcularIMC());

        sc.close();
    }
}

