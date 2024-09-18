/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao02;

/**
 *
 * @author larim
 */
public class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;
    
    public String getNumero(){
        return numero;
    }
    
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor inválido! O valor precisa ser maior que 0.");
        }
        saldo += valor;
    }
    
    public void sacar(double valor){
        if (valor < 0){
            throw new IllegalArgumentException("Valor inválido!");
        }else if (valor > saldo ){
            throw new IllegalArgumentException("Saldo insuficiente!");

        }
        
        saldo -= valor;
    }
    
    
/**
 * 
 * @param contaDestino
 * @param valor 
 */
    public void transferir(ContaBancaria contaDestino, double valor){
        sacar(valor);
        contaDestino.depositar(valor);
    }
}
