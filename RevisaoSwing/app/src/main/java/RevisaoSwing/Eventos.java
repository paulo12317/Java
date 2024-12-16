/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Eventos extends javax.swing.JFrame {
    
    public Eventos(){
        JFrame frame = new JFrame("Free Fire");
        frame.setSize(1000,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        
        JButton botao = new JButton("Clique");
        panel.add(botao);
        botao.setText("Clique aqui");
        System.out.println(botao.getText());
        
        JLabel texto = new JLabel("Nome:");
        panel.add(texto);
        Icon icon = new ImageIcon(getClass().getResource("Black444.PNG"));
        texto.setIcon(icon);
        
        JTextField campoT = new JTextField("Escreva aqui: ");
        campoT.setEditable(false);//define se o texto pode ser editado
        panel.add(campoT);
        
        JTextArea areaT = new JTextArea();
        
        
        
    }
    
    public static void main(String[] args){
        Eventos frame = new Eventos();
        frame.setVisible(true);
    
    }
}
