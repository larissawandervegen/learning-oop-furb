/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradesafio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener {
    // Componentes da calculadora
    private JTextField campoTexto;
    private double valorAnterior;
    private String operadorAtual;
    private boolean novoValor;

    public Calculadora() {
        // Configurações básicas da janela
        setTitle("Calculadora");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Campo de texto onde o resultado aparecerá
        campoTexto = new JTextField();
        campoTexto.setEditable(false);
        campoTexto.setHorizontalAlignment(SwingConstants.RIGHT);
        campoTexto.setFont(new Font("Arial", Font.PLAIN, 36));
        add(campoTexto, BorderLayout.NORTH);

        // Painel para os botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(5, 4, 10, 10));

        // Botões de números e operações
        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "CE", "C", "", ""
        };

        // Adiciona os botões ao painel
        for (String textoBotao : botoes) {
            JButton botao = new JButton(textoBotao);
            botao.setFont(new Font("Arial", Font.PLAIN, 28));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        // Adiciona o painel de botões à janela
        add(painelBotoes, BorderLayout.CENTER);

        // Inicializa variáveis de controle
        valorAnterior = 0;
        operadorAtual = "";
        novoValor = true;

        // Exibe a janela
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.matches("[0-9]") || comando.equals(".")) {
            // Se for um número ou ponto, adiciona ao campo de texto
            if (novoValor) {
                campoTexto.setText(comando);
                novoValor = false;
            } else {
                campoTexto.setText(campoTexto.getText() + comando);
            }
        } else if (comando.equals("C")) {
            // Limpa tudo
            campoTexto.setText("");
            valorAnterior = 0;
            operadorAtual = "";
            novoValor = true;
        } else if (comando.equals("CE")) {
            // Apaga o último número inserido
            campoTexto.setText("");
            novoValor = true;
        } else if (comando.equals("=")) {
            // Executa a operação
            calcularResultado();
            operadorAtual = "";
        } else {
            // Operações (soma, subtração, multiplicação, divisão)
            calcularResultado();
            operadorAtual = comando;
            novoValor = true;
        }
    }

    private void calcularResultado() {
        double valorAtual = Double.parseDouble(campoTexto.getText());

        switch (operadorAtual) {
            case "+":
                valorAnterior += valorAtual;
                break;
            case "-":
                valorAnterior -= valorAtual;
                break;
            case "*":
                valorAnterior *= valorAtual;
                break;
            case "/":
                valorAnterior /= valorAtual;
                break;
            default:
                valorAnterior = valorAtual;
        }

        campoTexto.setText(Double.toString(valorAnterior));
    }

    public static void main(String[] args) {
        // Cria e exibe a calculadora
        new Calculadora();
    }
}
