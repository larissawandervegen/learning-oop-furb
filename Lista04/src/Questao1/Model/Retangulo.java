/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Questao1.Model;

/**
 *
 * @author sunse
 */
public class Retangulo {

    private int altura;
    private int comprimento;
    
    public Retangulo(){
        this.altura = 0;
        this.comprimento = 0;        
    }

    public Retangulo(int altura, int comprimento) {
       this.altura = altura;
       this.comprimento = comprimento;
    }
    
    public int calcularPerimetro(){
        int calculoPeri = 2*(getAltura() + getComprimento());
        return calculoPeri ;
}
   public int calcularArea(){    
            
    int calculoArea = getAltura() * getComprimento();
    
    return calculoArea;
    }
    public void setAltura(int altura) {
        this.altura = altura;

        if (altura <= 0) {
            throw new IllegalArgumentException("“Valor incorreto para comprimento: " + altura);

        }
    }

    public int getAltura() {
        return altura;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
          if (altura <= 0) {
            throw new IllegalArgumentException("“Valor incorreto para comprimento: " + altura);
          }
    }

    public int getComprimento() {
        return comprimento;
    }
}
