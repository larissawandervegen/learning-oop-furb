package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sunse
 */
public class Ponto {

    private int x;
    private int y;

    public Ponto() {
        this.x = 0;
        this.y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Quadrante identificarQuadrante() {
        Quadrante quad;

        if (x > 0 && y > 0) {
            quad = Quadrante.PRIMEIRO;
        }
        else if (x < 0 && y > 0) {
            quad = Quadrante.SEGUNDO;
        }
        else if (x < 0 && y < 0) {
            quad = Quadrante.TERCEIRO;
        }
        else if (x > 0 && y < 0) {
            quad = Quadrante.QUARTO;
        } else {
            quad = Quadrante.NENHUM;
        }
        return quad;
    }

    public boolean estaIncidindoSobreX() {
       boolean veriX = false;
        if (y == 0) {
            veriX = true;
        }
        return veriX;
    }

    public boolean estaIncidindoSobreY() {
        boolean veriY = false;
        if (x == 0) {
            veriY = true;
        }
        return veriY;
    }
    
    public double calcularDistancia(Ponto outro) {
        double dx = this.x - outro.getX();
        double dy = this.y - outro.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public static double calcularDistancia(Ponto p1, Ponto p2) {
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;

    }

    public int getY() {
        return y;
    }
}
