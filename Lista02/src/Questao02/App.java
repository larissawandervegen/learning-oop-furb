/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author larim
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();
        
        System.out.println("Informe o número da primeira conta: ");
        conta1.setNumero(scanner.nextLine());
        
        System.out.println("Informe o titular da conta "+ conta1.getNumero() + ":");
        conta1.setTitular(scanner.nextLine());
        
        
        System.out.println("Informe o número da segunda conta: ");
        conta2.setNumero(scanner.nextLine());
        
        System.out.println("Informe o titular da conta "+ conta2.getNumero() + ":");
        conta2.setTitular(scanner.nextLine());
        
        
        conta1.depositar(1000);
        conta1.depositar(700);
        
        conta2.depositar(5000);
        
        conta2.sacar(3000);
        
        conta2.transferir(conta1, 1800);
        
        System.out.println("-------------------Relatório-------------------");
        System.out.println("Titular: " + conta1.getTitular() + " Saldo: " + conta1.getSaldo());
        System.out.println("Titular: " + conta2.getTitular() + " Saldo: " + conta2.getSaldo());

    }
}
