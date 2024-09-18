
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author larim
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < 3; i++) {
            Pessoa user = new Pessoa();
            System.out.print("Informe a altura da pessoa " + (i + 1) + " : ");
            user.altura = scanner.nextDouble();
            
            System.out.print("Informe o peso da pessoa " + (i + 1) + " : ");
            user.peso = scanner.nextDouble();
            
            System.out.print("IMC: " + user.calcularImc());
        }
    }
}
