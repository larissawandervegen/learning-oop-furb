/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author larim
 */
public class Estadia {
    private int horaEntrada;
    private int horaSaida;
    private int totalHoras;
    


    public Estadia() {
    }

    public Estadia(int horaEntrada, int horaSaida) {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSaida() {
        return horaSaida;
    }

    public void setHoraEntrada(int horaEntrada) {
        if(horaEntrada < 0  || horaEntrada >= 24){
            throw new IllegalArgumentException("Hora informada é inválida!");
        }
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(int horaSaida) {
        if(horaSaida < 0  || horaSaida >= 24){
            throw new IllegalArgumentException("Hora informada é inválida!");
        }
        this.horaSaida = horaSaida;
    }
    
    
    /**
     * Nesse método é calculado o tempo de estadia que o veículo fica no estacionmento.
     * São dadas condições para calcular, se a hora de entrada e a hora de saída forem iguais, 
     * significa que o total de horas é 24, ou seja o veículo passou um dia estacionado.
     * Se a hora de entrada for maior que a hora de saída, é feito o cálcullo onde adicionamos 24 na hora de saída
     * para depois subtrair a hora de entrada.
     * Se nenhuma das condições acima for atendida é feito a subtração de hora de saída menos hora de entrada.
     * @return o total de horas de estadia.
     */
    public int calcularTempoEstadia(){
        if (this.horaEntrada == this.horaSaida) {
            totalHoras = 24;
        }else if (this.horaEntrada > this.horaSaida) {
            this.horaSaida = this.horaSaida + 24;
            totalHoras = this.horaSaida - this.horaEntrada;
        }else {
            totalHoras = this.horaSaida - this.horaEntrada;
        }
        return totalHoras; 
    }
    
    
    /**
     * Nesse método é calculado o valor total a pagar pelo tempo de estadia que o veículo fica no estacionmento.
     * São dadas condições para calcular, se o total de horas for menor ou igual a 3, o total a pagar vair ser igual a 14.
     * Já se o total de horas for maior que 3, é subtraido 3 do total de horas e multiplicado o restante das horas por 2 e por fim adicionado 14.
     * @return o total à pagar pelas horas de estadia.
     */
    public double CalcularValorPagar(){
        int totalPagar = 0;
        
        if (totalHoras <= 3){
            totalPagar = 14;
        }else if(totalHoras > 3){
            totalPagar = 14 + ((totalHoras - 3) * 2);
        }
        
        return Math.round(totalPagar * 100.0) / 100.0;
    }
}
