/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

/**
 *
 * @author larim
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        Pessoa[] pessoas = new Pessoa[3];
        
        for (int i = 0; i < 3; i++) {
            Pessoa pessoa = new Pessoa();
            
            System.out.print("Informe o nome da pessoa " + (i + 1) + " : ");
            pessoa.nome = scanner.next();
            
            System.out.print("Informe a altura da pessoa " + (i + 1) + " : ");
            pessoa.altura = scanner.nextDouble();
            
            System.out.print("Informe o peso da pessoa " + (i + 1) + " : ");
            pessoa.peso = scanner.nextDouble();
            
            pessoas[i]= pessoa;
        }
        for (int i = pessoas.length-1; i >= 0; i--) {
            System.out.println("Nome: " + pessoas[i].nome + 
                    "Altura: " + pessoas[i].altura + 
                    "Peso: " + pessoas[i].peso + 
                    "IMC: " + pessoas[i].calcularImc());
            
        }
    }
    
        
}
