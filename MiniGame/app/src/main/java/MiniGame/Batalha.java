/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniGame;

import java.util.Scanner;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Batalha {
    
    
    
    
    public void start(){
        
        
        
        
        
        
        Scanner scanner = new Scanner(System.in);;
        
        System.out.println("Fale o nome do Mago: ");
        String nomeM = scanner.nextLine();
        Mago mago = new Mago(nomeM);
    
        
        
        System.out.println("Fale o nome do Guerreiro: ");
        String nomeG = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeG);
        
        System.out.println("Fale o nome do Arqueiro: ");
        String nomeA = scanner.nextLine();
        Arqueiro arqueiro = new Arqueiro(nomeA);
        
        
        
        while(guerreiro.vida > 0 && arqueiro.vida > 0 && mago.vida >0){
            
            System.out.println("Mago: "+ mago.vida + "Guerreiro: " + guerreiro.vida + "Arqueiro: " + arqueiro.vida);
            
            System.out.println("Digite o seu personagem: "
                    + "1 - Guerreiro "
                    + "2 - Arqueiro "
                    + "3 - Mago. ");
            int guess = scanner.nextInt();
            
            System.out.println("Digite o personagem que quer atacar: "
                    + "1 - Guerreiro "
                    + "2 - Arqueiro "
                    + "3 - Mago. ");
            int guess2 = scanner.nextInt();
            
            
            switch(guess){
                
                case 1:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O guerreiro nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O guerreiro atacou o arqueiro " + arqueiro.nome);
                            arqueiro.vida -= guerreiro.atack;
                            break;
                        case 3: 
                            System.out.println("O guerreiro atacou o mago " + mago.nome);
                            mago.vida -= guerreiro.atack;
                    }
                    break;
                case 2:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O arqueiro nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O arqueiro atacou o guerreiro " + guerreiro.nome);
                            guerreiro.vida -= arqueiro.atack;
                            break;
                        case 3: 
                            System.out.println("O arqueiro atacou o mago " + mago.nome);
                            mago.vida -= arqueiro.atack;
                    }    
                case 3:
                    switch(guess2){
                        
                        case 1:
                            System.out.println("O mago nao pode atacar ele mesmo.");
                            break;
                        case 2:
                            System.out.println("O mago atacou o arqueiro " + arqueiro.nome);
                            arqueiro.vida -= mago.atack;
                            break;
                        case 3: 
                            System.out.println("O mago atacou o guerreiro " + guerreiro.nome);
                            guerreiro.vida -= mago.atack;
                }  
            }
        }
    }
}
