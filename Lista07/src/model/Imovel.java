/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author larim
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    public String getEndereco() {
        return endereco;
    }

    public int getArea() {
        return area;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setArea(int area) {
        if(area < 0){
            throw new IllegalArgumentException("Área informada não pode ser negativa.");
        }
        this.area = area;
    }
    
    public Bairro getBairro(){
        return bairro;
    }
    
    public void setBairro (Bairro bairro){
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    public double calcularIptu(){
        if (getBairro() == null){
            throw new IllegalArgumentException("Bairro não definido.");
        }
        
        if (getBairro().getCoeficienteIptu() < 0){
            throw new IllegalArgumentException("Coeficiente negativo.");
        }
        
        if (getFinalidade() == null){
            throw new IllegalArgumentException("Finalidade não definida.");
        }
        
        
        double totalIptu;
        switch (getFinalidade()) {
            case Finalidade.RESIDENCIAL -> {
                return totalIptu = getArea() * bairro.getCoeficienteIptu();
                
            }
            case Finalidade.COMERCIAL -> {
                if (getArea() <= 100) {
                       return totalIptu = 500 * bairro.getCoeficienteIptu();
                }else if(getArea() > 100 && getArea() < 400){
                    return totalIptu = 1000 * bairro.getCoeficienteIptu();
                }else{
                    return totalIptu = (getArea() * 2.55) * bairro.getCoeficienteIptu();
                }
            }
            case Finalidade.INDUSTRIAL -> {
                if (getArea() <= 2000) {
                    return totalIptu = 1000 * bairro.getCoeficienteIptu();
                }else{
                    return totalIptu = (getArea() * 0.55) * bairro.getCoeficienteIptu();
                }
            }
        }
        return 0;
    }
    
}
