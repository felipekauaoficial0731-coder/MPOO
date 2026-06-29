/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemapedidos;

/**
 *
 * @author 20251303.MTC0046
 */
public class SistemaPedidos {

    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("João Silva", "joao.silva@email.com");
       
   
        Produto produto1 = new Produto();
        produto1.setID(1);
        produto1.setNome("Mouse");
        produto1.setPrecoBase(150.0);

        Produto produto2 = new Produto();
        produto2.setID(2);
        produto2.setNome("Teclado");
        produto2.setPrecoBase(300.0);

        Produto produto3 = new Produto();
        produto3.setID(3);
        produto3.setNome("Monitor");
        produto3.setPrecoBase(1200.0);
        
        // Criando um pedido para o cliente
        Pedido pedido1 = new Pedido(cliente1.getNome());
        // Adicionando itens ao pedido
        pedido1.adicionarItem(produto1,2);
        pedido1.adicionarItem(produto2,1);
        pedido1.adicionarItem(produto3,1);
        // Exibindo o resumo do pedido
        pedido1.exibirResumo(); 
    }
}
