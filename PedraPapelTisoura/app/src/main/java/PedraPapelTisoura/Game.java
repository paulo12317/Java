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
public class Game {
    public int escolha;
    private Player player;
    private Verificador verificador;
    public Scanner scanner;
    
    public void Game(){
        this.player = new Player();
        this.verificador = new Verificador();
        this.scanner = new Scanner(System.in);
        
    }
    
    public void start(){
        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura," + player.getNome());
        
        boolean hasWon = false;
        
        while(!hasWon){
            this.escolha = (int) (Math.random() * 3) + 1;
            
            System.out.println("Digite seu palpite: "
                    + "1 - pedra "
                    + "2 - papel "
                    + "3 - tesoura ");
            int guess = scanner.nextInt();
            hasWon = verificador.Verificar(guess, escolha);
        }
        
        System.out.println("Voce ganhou!!");
        
    }
}
