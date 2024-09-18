/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author larim
 */
public class Funcionario {
    private String name;
    private double salary;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public double calculateIrpf(){
        double imposto = 0;
        if (getSalary() > 1903.98) {
            if (getSalary() <= 2826.65) {
                imposto = (getSalary() - 1903.98) * 0.075;
            } else if (getSalary() <= 3751.05) {
                imposto = (2826.65 - 1903.98) * 0.075 + (getSalary() - 2826.65) * 0.15;
            } else if (getSalary() <= 4664.68) {
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (getSalary() - 3751.05) * 0.225;
            }else {
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (getSalary() - 4664.68) * 0.275;
            }
        }
        System.out.println("Imposto calculado: " + imposto);

        return imposto;
    }
}
