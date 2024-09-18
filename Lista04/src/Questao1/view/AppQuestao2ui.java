package Questao1.view;

import Questao1.Model.Retangulo;
import javax.swing.JOptionPane;

public class AppQuestao2ui {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura"));
        retangulo.setAltura(altura);
        
          int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento"));
        retangulo.setComprimento(comprimento);

        JOptionPane.showMessageDialog(null,"O perimetro do retângulo é: " + retangulo.calcularPerimetro() 
                + " A area do retângulo é: " + retangulo.calcularArea());

    }

}
