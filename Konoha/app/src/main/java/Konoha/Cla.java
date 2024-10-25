/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
abstract class Cla {
    String nomeCla;
    String lider;
    
    public Cla(String nome,String liderCla){
        this.nomeCla = nome;
        this.lider = liderCla;
    }
    
    public abstract void habilidadeEspecial();
    
    public void obterDetalhes(){
        System.out.println("Nome: "+nomeCla+ " Lider: "+lider);
    }
}
