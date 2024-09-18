/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author larim
 */
public class FuncionarioTest {
    Funcionario funcionario;
    
    public FuncionarioTest() {
    }
    
    @Before
    public void inicializarContexto() {
        funcionario = new Funcionario("Larissa", 850.00);
    }
    //1
    @Test
    public void testIdentificarFaixaIrpf() {
        funcionario.setSalary(850.00);

        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
    }
    
    //2
    @Test
    public void testCalcularIrpf() {
        funcionario.setSalary(850.00);

        assertEquals(0,00, funcionario.calculateIrpf());
    }
    
    //3
    
    @Test
    public void testIdentificarPrimeiraFaixaIrpf() {
        funcionario.setSalary(1903.98);
        
        assertEquals(FaixaIrpf.PRIMEIRA, funcionario.identificarFaixaIrpf());
    }

    //4
    
    @Test
    public void testCalcularIrpfPrimeira() {
        funcionario.setSalary(1903.98);

        assertEquals(0,00, funcionario.calculateIrpf());
    }
    
     //5
    
    @Test
    public void testIdentificarSegundaFaixaIrpf() {
        funcionario.setSalary(1903.99);

        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }

    //6
    
    @Test
    public void testCalcularIrpfSegunda() {
        funcionario.setSalary(1903.99);

        assertEquals(0,00, funcionario.calculateIrpf());
    }
    
    
    //7
    
    @Test
    public void testIdentificarSegundaFaixaIrpf2() {
        funcionario.setSalary(2000.00);

        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }

    //8
    
    @Test
    public void testCalcularIrpfSegunda2() {
        funcionario.setSalary(2000.00);

        assertEquals(7.20, funcionario.calculateIrpf(), 0);
    }
    
    //9
    
    @Test
    public void testIdentificarSegundaFaixaIrpf3() {
        funcionario.setSalary(2826.65);

        assertEquals(FaixaIrpf.SEGUNDA, funcionario.identificarFaixaIrpf());
    }

    //10
    
    @Test
    public void testCalcularIrpfSegunda3() {
        funcionario.setSalary(2826.66);

        assertEquals(69.20, funcionario.calculateIrpf(), 0);
    }
    
    //11
    
    @Test
    public void testIdentificarTerceiraFaixaIrpf() {
        funcionario.setSalary(2826.66);

        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }

    //12
    
    @Test
    public void testCalcularIrpfTerceira() {
        funcionario.setSalary(2826.66);

        assertEquals(69.20, funcionario.calculateIrpf(), 0);
    }
    
    //13
    
    @Test
    public void testIdentificarTerceiraFaixaIrpf1() {
        funcionario.setSalary(3000.00);

        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }

    //14
    
    @Test
    public void testCalcularIrpfTerceira1() {
        funcionario.setSalary(3000.00);

        assertEquals(95.20, funcionario.calculateIrpf(), 0);
    }
    
    //15
    
    @Test
    public void testIdentificarTerceiraFaixaIrpf2() {
        funcionario.setSalary(3751.05);

        assertEquals(FaixaIrpf.TERCEIRA, funcionario.identificarFaixaIrpf());
    }

    //16
    
    @Test
    public void testCalcularIrpfTerceira2() {
        funcionario.setSalary(3751.05);

        assertEquals(207.86, funcionario.calculateIrpf(), 0);
    }
    
    //17
    
    @Test
    public void testIdentificarQuartaFaixaIrpf() {
        funcionario.setSalary(3751.06);

        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }

    //18
    
    @Test
    public void testCalcularIrpfQuarta() {
        funcionario.setSalary(3751.06);

        assertEquals(207.86, funcionario.calculateIrpf(), 0);
    }
    
    //19
    
    @Test
    public void testIdentificarQuartaFaixaIrpf1() {
        funcionario.setSalary(4000.00);

        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }

    //20
    
    @Test
    public void testCalcularIrpfQuarta1() {
        funcionario.setSalary(4000.00);

        assertEquals(263.87,funcionario.calculateIrpf(), 0);
    }
    
    //21
    
    @Test
    public void testIdentificarQuartaFaixaIrpf2() {
        funcionario.setSalary(4664.68);

        assertEquals(FaixaIrpf.QUARTA, funcionario.identificarFaixaIrpf());
    }

    //22
    
    @Test
    public void testCalcularIrpfQuarta2() {
        funcionario.setSalary(4664.68);

        assertEquals(413.43, funcionario.calculateIrpf(), 0);
    }
    
    //23
    
    @Test
    public void testIdentificarQuintaFaixaIrpf() {
        funcionario.setSalary(4664.69);

        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
    }

    //24
    
    @Test
    public void testCalcularIrpfQuinta() {
        funcionario.setSalary(4664.69);

        assertEquals(413.43, funcionario.calculateIrpf(), 0);
    }
    
    //25
    
    @Test
    public void testIdentificarQuintaFaixaIrpf1() {
        funcionario.setSalary(5000.00);

        assertEquals(FaixaIrpf.QUINTA, funcionario.identificarFaixaIrpf());
    }

    //26
    
    @Test
    public void testCalcularIrpfQuinta1() {
        funcionario.setSalary(5000.00);

        assertEquals(505.64, funcionario.calculateIrpf(), 0);
    }
    
    //27
    
    @Test(expected=IllegalArgumentException.class)
    public void testSalarioNegativo() {
        funcionario.setSalary(-100);
    }
}
