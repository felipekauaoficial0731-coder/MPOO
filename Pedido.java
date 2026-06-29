/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemapedidos;

/**
 *
 * @author 20251303.MTC0046
 */
public class Pedido {
   private String data;
   private String cliente;
   private ItemPedido[] itens;
   private int contadorItem;
    public Pedido(String cliente) {
        this.cliente = cliente;
        this.itens = new ItemPedido[10];
        this.contadorItem = 0;
    }
    
   
   public void adicionarItem (Produto produto,int quantidade){
       if (contadorItem < itens.length) {
           ItemPedido p1 = new ItemPedido(quantidade,produto);
           this.itens[contadorItem] = p1;
           contadorItem++;
       } else {
           System.out.println("Erro: O carrinho de compras lotado");
       }
   }
    public double calcularTotal(){
           double total = 0.0;
           for (int i = 0; i<contadorItem;i++){
               total += itens[i].calcularSubTotal();
           }
           return total;
       }
    
    public void exibirResumo(){
        System.out.println("---------- Resumo do Pedido ----------");
        System.out.println("Cliente: " + cliente);
        System.out.println("Data: " + data);
        System.out.println("Itens do Pedido:");
        for (int i = 0; i < contadorItem; i++) {
            System.out.println("- ");
            System.out.println("Produto: " + itens[i].getProduto().getNome());
            System.out.println("Quantidade: " + itens[i].getQuantidade());
            System.out.println("Preço Unitário: R$ " + itens[i].getProduto().getPrecoBase());
            System.out.println("Subtotal: R$ " + itens[i].calcularSubTotal()); 
        }
        System.out.println("Total: R$ " + calcularTotal());
        
    }
    
}
