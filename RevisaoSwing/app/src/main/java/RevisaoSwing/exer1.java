/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class exer1 extends JFrame {
    public exer1(){
    
        JFrame frame = new JFrame("Minha Janela");
        frame.setSize(1000,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton botao1 = new JButton("subir capa!!!");
        panel.add(botao1);
        
        JLabel label = new JLabel("Ola mundo");
        panel.add(label);
        
        JTextField text = new JTextField(20);
        panel.add(text);
        
        JTextArea textoMaior = new JTextArea(5,20);
        panel.add(textoMaior);
        
        JCheckBox box = new JCheckBox("Marque aqui:");
        panel.add(box);
        
        JRadioButton radio1 = new JRadioButton("Opcao 1: ");
        JRadioButton radio2 = new JRadioButton("Opcao 2: ");
        ButtonGroup grup = new ButtonGroup();
        grup.add(radio1);
        grup.add(radio2);
        panel.add(radio1);
        panel.add(radio2);
        
        
        
        
    }
    
    public static void main(String[] args){
        exer1 frame = new exer1();
        frame.setVisible(true);
    
    }
}
