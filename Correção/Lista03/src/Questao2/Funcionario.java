/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao2;



/**
 *
 * @author rwsouza
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public void setNome(String nome){
      this.nome = nome;  
    }
    
    public String getNome(){
      return nome;  
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
       return salario;
    }
    
    public double calcularIrpf(){
       double imposto = 0, diferenca = 0;
       
       if (getSalario() > 1903.98){           
           if (getSalario() <= 2826.65){ //FAIXA 2
               diferenca = getSalario() - 1903.98;
               imposto = diferenca * (7.5/100);
           }else if (getSalario() <= 3751.05){ //FAIXA 3
               /*Imposto a pagar na faixa 2*/
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               /*Imposto a pagar na faixa 3*/
               diferenca = getSalario() - 2826.65;
               imposto += diferenca * (15.0/100);               
           }else if (getSalario() <= 4664.68){ //FAIXA 4
               /*Imposto a pagar na faixa 2*/
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               /*Imposto a pagar na faixa 3*/
               diferenca = 3751.05 - 2826.65;
               imposto += diferenca * (15.0/100);
               
               /*Imposto a pagar na faixa 4*/
               diferenca = getSalario() - 3751.05;
               imposto += diferenca * (22.5/100);
                              
           }else{ //FAIXA FINAL 
              /*Imposto a pagar na faixa 2*/
               diferenca = 2826.65 - 1903.98;
               imposto = diferenca * (7.5/100);
               
               /*Imposto a pagar na faixa 3*/
               diferenca = 3751.05 - 2826.65;
               imposto += diferenca * (15.0/100);
               
               /*Imposto a pagar na faixa 4*/
               diferenca = 4664.68 - 3751.05;
               imposto += diferenca * (22.5/100); 
               
               /*Imposto a pagar a faixa final*/
               diferenca = getSalario() - 4664.68;
               imposto += diferenca * (27.5/100);               
           }
           
       }
               
       return imposto;
    }
}
