/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.DecimalFormat;

/**
 *
 * @author larim
 */
public class Funcionario {

    private String name;
    private double salary;

    public Funcionario(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que Zero.");
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateIrpf() {
        double imposto = 0;
        if (getSalary() > 1903.98) {
            if (getSalary() <= 2826.65) {
                imposto = (getSalary() - 1903.98) * 0.075;
            } else if (getSalary() <= 3751.05) {
                imposto = (2826.65 - 1903.98) * 0.075 + (getSalary() - 2826.65) * 0.15;
            } else if (getSalary() <= 4664.68) {
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (getSalary() - 3751.05) * 0.225;
            } else {
                imposto = (2826.65 - 1903.98) * 0.075 + (3751.05 - 2826.65) * 0.15 + (4664.68 - 3751.05) * 0.225 + (getSalary() - 4664.68) * 0.275;
            }
        }
        System.out.println("Imposto calculado: " + imposto);
        
        return Math.round(imposto * 100.0) / 100.0;
    }

    public FaixaIrpf identificarFaixaIrpf() {
        FaixaIrpf faixa;
        if (getSalary() <= 1903.98) {
            faixa = FaixaIrpf.PRIMEIRA;
        } else if (getSalary() <= 2826.65) {
            faixa = FaixaIrpf.SEGUNDA;
        } else if (getSalary() <= 3751.05) {
            faixa = FaixaIrpf.TERCEIRA;
        } else if (getSalary() <= 4664.68) {
            faixa = FaixaIrpf.QUARTA;
        } else {
            faixa = FaixaIrpf.QUINTA;
        }
        return faixa;
    }
}
