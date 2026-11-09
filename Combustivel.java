/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package combustivel;

import java.util.Scanner;

class Carro {
    String modelo;
    double consumoKmPorLitro;
}

class Viagem {
    double distanciaKm;

    double litrosNecessarios(Carro c) {
        return distanciaKm / c.consumoKmPorLitro;
    }
}

public class Combustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro();
        System.out.print("Digite o modelo do carro: ");
        carro.modelo = sc.nextLine();

        System.out.print("Digite o consumo (km por litro): ");
        carro.consumoKmPorLitro = sc.nextDouble();

        Viagem viagem = new Viagem();
        System.out.print("Digite a distância da viagem (km): ");
        viagem.distanciaKm = sc.nextDouble();

        System.out.printf("O carro %s precisará de %.2f litros.%n",
                carro.modelo, viagem.litrosNecessarios(carro));

        sc.close();
    }
}

