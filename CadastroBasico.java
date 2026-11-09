/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadastrobasico;

import java.util.Scanner;

public class CadastroBasico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Digite o nome: ");
        p.setNome(sc.nextLine());

        System.out.print("Digite a idade: ");
        p.setIdade(sc.nextInt());

        System.out.println("\nDados da pessoa:");
        System.out.println(p);

        sc.close();
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}