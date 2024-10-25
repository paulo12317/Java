/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PedraPapelTisoura;

import java.util.Scanner;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */


public class Player {
    public String nome;
    
    public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.nome = scanner.nextLine();
    }
    
    public String getNome(){
        return nome;
    }
}
