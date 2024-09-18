/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o Nome do Funcionario: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe o Salario do Funcionario: ");
        double salario = Double.parseDouble(sc.nextLine());
        
        Funcionario func1 = new Funcionario();
        func1.setNome(nome);
        func1.setSalario(salario);
        
        double valorImposto = func1.calcularIrpf();
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("O Imposto a Pagar é : "+
                              df.format(valorImposto) );         
        
    }
}
