/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrumentos;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Piano implements InstrumentoMusical {
 
    @Override
    public void tocar(){
        System.out.println("O piano esta tocando");
    }
    
    @Override
    public void afinar(){
        System.out.println("O violao esta sendo ajustado");
    }
}
