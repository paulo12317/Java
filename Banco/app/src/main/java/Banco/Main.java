/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito();
        PayPal payPal = new PayPal();
        
        cartao.processarPagamento(20);
        System.out.println(cartao.obterDetalhes());
        
        payPal.processarPagamento(40);
        System.out.println(payPal.obterDetalhes());
    }
}
