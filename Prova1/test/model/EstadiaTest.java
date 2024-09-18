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
public class EstadiaTest {
    Estadia estadia;
    
    public EstadiaTest() {
    }

    @Before
    public void inicializarContexto() {
        estadia = new Estadia(14, 23);
    }
    
    @Test
    public void testCalcularValorPagar() {
        estadia.setHoraEntrada(20);
        estadia.setHoraSaida(2);
        
        assertEquals(20, estadia.CalcularValorPagar(),0);
    }
    
    @Test
    public void testCalcularValorPagar2() {
        estadia.setHoraEntrada(13);
        estadia.setHoraSaida(17);
        
        assertEquals(16, estadia.CalcularValorPagar(),0);
    }
    
    @Test
    public void testCalcularTempoEstadia() {
        estadia.setHoraEntrada(20);
        estadia.setHoraSaida(2);
        
        assertEquals(6, estadia.calcularTempoEstadia(),0);
    }
    
    
    @Test(expected=IllegalArgumentException.class)
    public void testSalarioNegativo() {
        estadia.setHoraEntrada(-100);
    }
    
}
