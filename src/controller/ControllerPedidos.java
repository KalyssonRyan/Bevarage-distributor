/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoPedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedidos;

/**
 *
 * @author Usuario
 */
public class ControllerPedidos {
     DaoPedido dao = new DaoPedido();
    List<Pedidos> lista= new ArrayList<Pedidos>();
    
   public void SalvarPedidos(List<Pedidos> p) {
    if (p != null && !p.isEmpty()) {
        // Verificar se todos os pedidos têm informações válidas (exemplo: IdUsuario, nome, preco)
        for (Pedidos pedido : p) {
            if (pedido.IdUsuario== 0 || pedido.nome.equals("") || pedido.preco.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
                return; 
            }
        }

        // Se todos os pedidos são válidos, chama o dao
        dao.SalvarPedidos(p);
       // JOptionPane.showMessageDialog(null, "Pedidos salvos com sucesso!");
    } else {
       // JOptionPane.showMessageDialog(null, "A lista de pedidos está vazia ou nula");
    }
}   // pega o id do pedido
     public List<Pedidos> getPedidosUsuario(int idUsuario) {
        return dao.getPedidosUsuario(idUsuario);
    }
}

