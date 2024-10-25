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
public class Verificador {
    
    public boolean Verificar(int escolhaP, int escolhaC){
        if(escolhaP == 1 && escolhaC == 1){
            System.out.println("Os dois escolheram pedra e empataram.");
            return false;
            
        }else if(escolhaP == 2 && escolhaC == 2){
            System.out.println("Os dois escolheram papel e empataram.");
            return false;
            
        }else if(escolhaP == 3 && escolhaC == 3){
            System.out.println("Os dois escolheram tesoura e empataram.");
            return false;
            
        }else if(escolhaP == 1 && escolhaC == 2){
            System.out.println("Voce escolheu pedra e perdeu para o papel.");
            return false;
            
        }else if(escolhaP == 1 && escolhaC == 3){
            System.out.println("Voce escolheu pedra e ganhou da tesoura.");
            return true;
            
        }else if(escolhaP == 2 && escolhaC == 1){
            System.out.println("Voce escolheu papel e ganhou da pedra.");
            return true;
            
        }else if(escolhaP == 2 && escolhaC == 3){
            System.out.println("Voce escolheu papel e perdeu para tesoura.");
            return false;
            
        }else if(escolhaP == 3 && escolhaC == 1){
            System.out.println("Voce escolheu tesoura e perdeu para pedra.");
            return false;
            
        }else if(escolhaP == 3 && escolhaC == 2){
            System.out.println("Voce escolheu tesoura e ganhou do papel.");
            return true;
            
        }else{
            System.out.println("Opcao invalida!!");
            return false;
        }
    }
}
