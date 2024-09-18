/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author rwsouza
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Funcionario[] vetFuncionarios = new Funcionario[5];
        
        for(int i = 0; i < vetFuncionarios.length;i++){
            System.out.println("Informe o Nome do Funcionario "+(i+1)+": ");
            String nome = sc.nextLine();

            System.out.println("Informe o Salario do Funcionario "+(i+1)+": ");
            double salario = Double.parseDouble(sc.nextLine());

            Funcionario func1 = new Funcionario();
            func1.setNome(nome);
            func1.setSalario(salario);
            vetFuncionarios[i] = func1;

        } 
        
        System.out.println("******** Relação de Funcionário ******");
        DecimalFormat df = new DecimalFormat("0.00");
        
        for(int i = 0; i < vetFuncionarios.length;i++){
          System.out.println("Nome: "+vetFuncionarios[i].getNome()+ 
                         " - Salário: "+df.format(vetFuncionarios[i].getSalario())+
                         " - Imposto: "+df.format(vetFuncionarios[i].calcularIrpf()));
        }
        
               
        
    }
}
