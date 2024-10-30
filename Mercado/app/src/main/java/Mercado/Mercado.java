/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercado;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author PAULOHENRIQUEVICENTE
 */
public class Mercado {
    public void start(){
        
        ArrayList<Produto>carrinho = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        
        boolean index = false;
        
        while(!index){
            System.out.println("1 - Adicionar Item\n 2 - Remover Item\n 3 - Ver Carrinho\n 4 - Pagar\n 5 - Desligar");
            String escolha = scanner.nextLine();
            
            switch(escolha){
                case "1":
                    System.out.println("Escolha um corredor\n1 - Comida\n 2 - Eletronico\n 3 - Brinquedo\n 4 - Roupa\n 5 - Limpeza");
                    String corredor = scanner.nextLine();
                    
                    switch(corredor){
                        case "1":
                            System.out.println("Digite o nome do produto:");
                            String produtoC = scanner.nextLine();
                            double precoC = Math.random()* 100; 
                            Produto newComida = new Comida(produtoC,precoC);
                            carrinho.add(newComida);
                            break;
                        case "2":
                            
                            System.out.println("Digite o nome do produto:");
                            String produtoE = scanner.nextLine();
                            double precoE = (Math.random()* 1000)+ 100; 
                            Produto newEletronico = new Eletronico(produtoE,precoE);
                            carrinho.add(newEletronico);
                            break;
                            
                        case "3":
                            System.out.println("Digite o nome do produto:");
                            String produtoB = scanner.nextLine();
                            double precoB = (Math.random()* 300)+20; 
                            Produto newBrinquedo = new Brinquedo(produtoB,precoB);
                            carrinho.add(newBrinquedo);   
                            break;
                            
                        case "4":
                            System.out.println("Digite o nome do produto:");
                            String produtoR = scanner.nextLine();
                            double precoR = (Math.random()* 300)+ 30; 
                            Produto newRoupa = new Roupa(produtoR,precoR);
                            carrinho.add(newRoupa);
                            break;
                        case "5":
                            System.out.println("Digite o nome do produto:");
                            String produtoL = scanner.nextLine();
                            double precoL = Math.random()* 100; 
                            Produto newLimpeza = new Limpeza(produtoL,precoL);
                            carrinho.add(newLimpeza);
                                                        
                        default:
                            System.out.println("Opcao invalida");
                            break;
                    }
                    break;
                case "2":
                    for(int i = 0; i < carrinho.size();i++){
                        System.out.println(i + " - "+ carrinho.get(i).nome);
                    }
                    System.out.println("Digite o numero do produto que quer remover: ");
                    int remove = scanner.nextInt();
                    carrinho.remove(remove);
                    break;
                
                case "3":
                    
                    System.out.println("Produtos no Carrinho");
                    
                    for(int i = 0; i < carrinho.size();i++){
                        System.out.print(carrinho.get(i).nome + " ");
                        System.out.println("R$"+ df.format(carrinho.get(i).preco));
                    }
                    break;
                case "4":
                    
                    System.out.println("Voce pagou a conta.");
                    carrinho.clear();
                    break;
                case "5":
                    System.out.println("Fechando programa...");
                    index = true;
                    
                default:
                    System.out.println("Opcao invalida.");
            }
        }
    }
}
