/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author larim
 */
public class CalculadoraTest {
    Calculadora calc;

    public CalculadoraTest() {
    }

    @Before
    public void inicializarContexto(){
        calc = new Calculadora();
    }
    
    @Test
    public void testValidaSomaNumerosInteiros() {
        int retorno = calc.somar(10, 75);
        assertEquals(85, retorno);
    }
    
    @Test
    public void testValidaSubtrairNumerosInteiros() {
        int retorno = calc.subtrair(100,35);
        assertEquals(65, retorno);
    }
    
    @Test
    public void testValidaMultiplicarNumerosInteiros() {
        int retorno = calc.multiplicar(5,8);
        assertEquals(40, retorno);
    }
    
    @Test
    public void testValidaDividirNumerosInteiros() {
        int retorno = calc.dividir(10,2);
        assertEquals(5, retorno);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testValidaDividirPorZero() {
        int retorno = calc.dividir(10,0);
        
    }
    
}
