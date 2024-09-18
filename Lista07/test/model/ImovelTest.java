/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author larim
 */
public class ImovelTest {
    Imovel imovel;
    Bairro bairro;
    public ImovelTest() {
    }

    /**
     * Certificar-se que seja recusada
     * área negativa
     */
    @Test(expected=IllegalArgumentException.class)
    public void testAreaNegativa() {
        imovel = new Imovel();
        imovel.setArea(-5);
    }
    
    /**
     * Certificar-se que seja recusado
     * calcular o IPTU de imóvel sem
     * que seja especificada a área
     */
    @Test(expected=IllegalArgumentException.class)
    public void testCalcularIptuSemArea() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(0);
        imovel.calcularIptu();
    }
    
    
    /**
     * Certificar-se que seja recusado
     * calcular o IPTU de imóvel sem
     * que seja especificada a finalidade
     * do imóvel 

     */
    @Test(expected=IllegalArgumentException.class)
    public void testCalcularIptuSeFinalidade() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setEndereco("blabla");
        imovel.setArea(250);
        imovel.calcularIptu();
    }
    
    /**
     * Certificar-se que seja recusado
     * calcular o IPTU de imóvel sem
     * que seja especificado o bairro 

     */
    @Test(expected=IllegalArgumentException.class)
    public void testCalcularIptuSemBairro() {
        imovel = new Imovel();
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(400);
        imovel.calcularIptu();
    }
    
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelResidencial() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setArea(400);
        assertEquals(400.00, imovel.calcularIptu(),0);
    }
    
    /**
     * Calcular o imposto para imóveis
     * comerciais de até 100 m2
     */
    @Test
    public void testCalcularIptuImovelComercial() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(80);
        assertEquals(500.00, imovel.calcularIptu(),0);
    }
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelComercial100a400() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(250);
        assertEquals(1000.00, imovel.calcularIptu(),0);
    }
    
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelComercialAcima400() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.COMERCIAL);
        imovel.setArea(500);
        assertEquals(1275.00, imovel.calcularIptu(),0);
    }
    
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelIndustrial2000() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setArea(2000);
        assertEquals(1000.00, imovel.calcularIptu(),0);
    }
    
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelIndustrialAcima2000() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(1);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.INDUSTRIAL);
        imovel.setArea(3000);
        assertEquals(1650.00, imovel.calcularIptu(),0.02);
    }
    
    /**
     * Calcular o imposto para imóveis
     * residenciais 
     */
    @Test
    public void testCalcularIptuImovelCoeficienteMaiorQue1() {
        imovel = new Imovel();
        bairro = new Bairro();
        bairro.setNome("Centro");
        bairro.setCoeficienteIptu(2.5);
        imovel.setBairro(bairro);
        imovel.setEndereco("blabla");
        imovel.setFinalidade(Finalidade.RESIDENCIAL);
        imovel.setArea(500000);
        assertEquals(1250000.00, imovel.calcularIptu(),0);
    }
    
}
