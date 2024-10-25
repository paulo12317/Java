/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class CartaoCredito implements Pagamento {
    String numeroCartao;
    int codigoSeguranca;
    
    public void cartaoCredito(){
     numeroCartao = "8723032";
    }
    
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$" + valor + " valor processado via Cartão de Crédito");
    }
  @Override
   public String obterDetalhes(){
   return numeroCartao.substring(numeroCartao.length() - 4);
   }
}
