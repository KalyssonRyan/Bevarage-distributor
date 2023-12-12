/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoProduto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
/**
 *
 * @author Usuario
 */
public class ControllerProduto {
    DaoProduto dao = new DaoProduto();
    //carrega as listas para os produtos e para o combobox
    List<Produto> lista= new ArrayList<Produto>();
    List<String> outros= new ArrayList<String>();
    //atualiza a lista com produtos
    public List<Produto> getUpdateProduto()
    {
        lista.clear();
        lista = dao.getProdutos();
        return lista;
    }
    //atualiza para o combobox os produtos
    public List<String> carregaCombo()
    {
        outros.clear();
        outros = dao.carregaComboBox();
        return outros;
    }
    public void alterarProduto(Produto p){
        //se nao estiver vazio chama o Dao
    if(p.id!=0 && !p.nome.equals("") && !p.preco.equals("") && !p.quantidade.equals(""))
        {
            dao.alterarProduto(p);
           // JOptionPane.showMessageDialog(null,"Produto salvo com sucesso!!!");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
     public void alterarProdutolist(List<Produto> p) {
    if (p != null && !p.isEmpty()) {
        // Verificar se todos os pedidos têm informações válidas (exemplo: IdUsuario, nome, preco)
        for (Produto produto : p) {
            //se estiver vazio avisa
            if (produto.id== 0 || produto.nome.equals("") || produto.preco.equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
                return; 
            }
        }

        // Se todos os pedidos são válidos, chama o dao
        dao.alterarProdutolist(p);
       // JOptionPane.showMessageDialog(null, "Pedidos salvos com sucesso!");
    } else {
        JOptionPane.showMessageDialog(null, "A lista de pedidos está vazia ou nula");
    }
}   //chama o dao para consultas
     public Produto consultaMaisCaro(){
         Produto produto =dao.consultaMaisCaro();
         return produto;
     }
      public Produto consultaMaisEstoque(){
        Produto produto = dao.consultaMaisEstoque();
        return produto;
          
                 
     }
      public Produto consultaMaisVendido(){
        Produto produto = dao.consultaMaisVendido();
          
         return produto;
     }
     public Produto consultaMaisBarato(){
         Produto produto =dao.consultaMaisBarato();
         return produto;
     }
     //chama o dao para cadastrar produto
     public void CadastrarProduto(Produto p)
    {   //se nao estiver vazio chama o dao
        if(!p.nome.equals("") && !p.preco.equals(""))
        {
            dao.CadastrarProduto(p);
            //JOptionPane.showMessageDialog(null,"Marca alterada com sucesso!!!");
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
     public void alterarPreco(Produto p)
    {
        if(!p.nome.equals("") && !p.preco.equals(""))
        {   //se nao estiver vazio chama o dao
            dao.alterarPreco(p);
            //JOptionPane.showMessageDialog(null,"Marca alterada com sucesso!!!");
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
     public void alterarEstoque(Produto p)
    {
        if(!p.nome.equals("") && !p.quantidade.equals(""))
        {   // se nao estiver vazio chama o dao
            dao.alterarEstoque(p);
            //JOptionPane.showMessageDialog(null,"Marca alterada com sucesso!!!");
        }
        else
        {
            //JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
     public void delProduto(int id,String nome)
    {   
        int op = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o produto "+nome,"Certeza?",JOptionPane.YES_NO_OPTION);
       switch(op)
       {
           case 0://caso queria excluir chama o dao
               dao.excluirProduto(id);
               JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");
                            
               break;
           case 1:
               //caso nao,sai
               JOptionPane.showMessageDialog(null, "Exclusão cancelada");
               break;
       }
    } //carrega o id do produto
     public int getIdProduto(String nome){
         dao.getIdProduto(nome);
         //JOptionPane.showMessageDialog(null, "Aqui é o ID "+DaoProduto.idProdutoExcluir);
         return DaoProduto.idProdutoExcluir;
          
     }
}
