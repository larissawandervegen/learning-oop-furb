package Questao3;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larim
 */
public class Pessoa {
    double altura;
    double peso;
    
    double calcularImc(){
        return peso / Math.pow (altura, 2);
    }
}
