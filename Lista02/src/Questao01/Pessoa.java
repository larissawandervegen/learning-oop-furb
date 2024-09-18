package Questao01;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larim
 */
public class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    
    public double calcularImc(double peso, double altura){
        return peso / Math.pow (altura, 2);
    }
    
    public String getName(){
        return nome;
    }
    
    public void setName(String nomePessoa){
        nome = nomePessoa;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double alturaPessoa){
        altura = alturaPessoa;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setPeso(double pesoPessoa){
        altura = pesoPessoa;
    }
}
