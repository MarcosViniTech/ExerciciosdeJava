/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

class Item {
    String descricao;
    int quantidade;
    double precoUnitario;

    double subtotal() {
        return quantidade * precoUnitario;
    }
}

class Pedido {
    double impostoPercentual;

    double total(Item i) {
        return i.subtotal() + (i.subtotal() * impostoPercentual / 100);
    }
}

public class PedidoImpostoFixo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Item item = new Item();
        System.out.print("Descrição do item: ");
        item.descricao = sc.nextLine();

        System.out.print("Quantidade: ");
        item.quantidade = sc.nextInt();

        System.out.print("Preço unitário: ");
        item.precoUnitario = sc.nextDouble();

        Pedido pedido = new Pedido();
        System.out.print("Imposto (%): ");
        pedido.impostoPercentual = sc.nextDouble();

        double subtotal = item.subtotal();
        double imposto = subtotal * pedido.impostoPercentual / 100;
        double total = pedido.total(item);

        System.out.printf("Subtotal: R$ %.2f%n", subtotal);
        System.out.printf("Imposto: R$ %.2f%n", imposto);
        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}

