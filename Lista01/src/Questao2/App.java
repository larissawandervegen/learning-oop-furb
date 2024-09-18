package Questao2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larim
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Pessoa user = new Pessoa();
            
            System.out.print("Por favor informe sua altura em metros: ");
            user.altura = scan.nextDouble();
            
            System.out.print("Por favor informe seu peso em kg: ");
            user.peso = scan.nextDouble();
            
            System.out.println("IMC é igual a: " + user.calcularImc());
        }
    }
}
