/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadeluz;

/**
 *
 * @author POS
 */
import java.util.Scanner;

public class ContaDeLuz {
    double consumoKWh;
    double tarifa;

    // Método que calcula o valor total
    public double valorTotal() {
        return consumoKWh * tarifa;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaDeLuz conta = new ContaDeLuz();

        System.out.print("Digite o consumo em KWh: ");
        conta.consumoKWh = scanner.nextDouble();

        System.out.print("Digite a tarifa (R$ por KWh): ");
        conta.tarifa = scanner.nextDouble();

        System.out.println("Valor total da conta: R$ " + conta.valorTotal());

        scanner.close();
    }
}
