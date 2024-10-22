/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniGame;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Personagem {
    String nome;
    int vida;
    int atack;
    
    public Personagem(String nome, int vida, int atack){
        this.nome = nome;
        this.vida = vida;
        this.atack = atack;
    }
    
    public void atacar(Personagem outroP){
        outroP.vida -= this.atack;
    }
    
    public boolean estaVivo(){
        return vida > 0;
    }
}
