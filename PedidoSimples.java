/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedidosimples;

import java.util.Scanner;

class Roteiro {
    double distanciaKm;
    double velocidadeMediaKmH;

    double tempoHoras() {
        return distanciaKm / velocidadeMediaKmH;
    }
}

public class TempoDeViagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Roteiro r = new Roteiro();

        System.out.print("Digite a distância da viagem (km): ");
        r.distanciaKm = sc.nextDouble();

        System.out.print("Digite a velocidade média (km/h): ");
        r.velocidadeMediaKmH = sc.nextDouble();

        System.out.printf("Tempo estimado de viagem: %.2f horas.%n", r.tempoHoras());

        sc.close();
    }
}
