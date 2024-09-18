/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questa01;

/**
 *
 * @author larim
 */
public class App {
    public static void main (String[] args){
        Pessoa marta;
        
        marta = new Pessoa();
        
        marta.altura = 1.50;
        marta.peso = 80.0;
        
        System.out.println("Imc = " + marta.calcularImc());
    }
}
