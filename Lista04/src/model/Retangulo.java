/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author larim
 */
public class Retangulo {
    private int altura;
    private int comprimento;
    
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }

    public Retangulo(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }
    
    public void setAltura(int altura){
        if (altura < 0) {
            throw new IllegalArgumentException("Valor incorreto para o altura: " + altura);
        }
        this.altura = altura;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setComprimento(int comprimento){
        if (comprimento < 0) {
            throw new IllegalArgumentException("Valor incorreto para o comprimento: " + comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public int getComprimento(){
        return comprimento;
    }
    
    public int calcularPerimetro(){
        int perimetro = 2 * (comprimento + altura);
        return perimetro;
    }
    
    public int calcularArea(){
        int area = comprimento * altura;
        return area;
    }
    
    
}
