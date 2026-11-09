/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descontofixo;

/**
 *
 * @author POS
 */
import java.util.Scanner;

class Produto {
    String nome;
    double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método que calcula o preço com desconto
    public double precoComDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }
}

public class DescontoFixo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler nome e preço do produto
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        // Criar objeto Produto
        Produto produto = new Produto(nome, preco);

        // Ler percentual de desconto
        System.out.print("Digite o percentual de desconto: ");
        double desconto = scanner.nextDouble();

        // Calcular e exibir o preço com desconto
        double precoFinal = produto.precoComDesconto(desconto);
        System.out.println("Preço com desconto: R$ " + precoFinal);

        scanner.close();
    }
}
