/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniGame;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Arqueiro extends Personagem {
    
    public Arqueiro(String nome){
        super(nome, 90, 20);
    }
    
    public void fleshaEspecial(){
        this.atack += this.atack;
    }
}

