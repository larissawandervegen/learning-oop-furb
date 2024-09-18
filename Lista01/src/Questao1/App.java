/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author larim
 */
public class App {
    public static void main(String[] args) {
        Pessoa larissa;
        
        larissa = new Pessoa();
        larissa.altura = 1.70;
        larissa.peso = 80.0;
        
        System.out.println("IMC: " + larissa.calcularImc());
        
    }   
}
