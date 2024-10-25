/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Instrumentos;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Index {
    
    public static void main(String[]args){
        Piano meuPiano = new Piano ();
        Violao meuViolao = new Violao();
        
        meuViolao.tocar();
        meuViolao.afinar();
        
        meuPiano.tocar();
        meuPiano.afinar();
    }
}
