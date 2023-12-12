/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedidos;
import model.Produto;
import java.util.Date;
import java.sql.Timestamp;

public class DaoPedido {
    Connection con = null;
PreparedStatement pstm = null;
//pega os pedidos e salva em uma lista     
public List<Pedidos> getPedidos()
{
    List<Pedidos> lista = new ArrayList<Pedidos>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM pedidos");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Pedidos p = new Pedidos();
             p.IdProduto = rs.getInt("idProduto");
             p.IdUsuario=rs.getInt("IdUsuario");
             p.nome = rs.getString("preco");
             p.preco = rs.getString("quantidade");
             
             
        
             lista.add(p);
            
        }while(rs.next());
    }
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    return lista;
}
//salva os pedidos de uma lista lá no banco
     public void SalvarPedidos(List<Pedidos> p) {
    con = new Conexao().getConexao();
    
    try {
       
         
         
        for (Pedidos pedido : p) {
            pstm = con.prepareStatement("INSERT INTO pedidos (IdProduto, IdUsuario, valor,quantidade,data) VALUES (?, ?, ?,?,?)");
            pstm.setInt(1, pedido.IdProduto); 
            pstm.setInt(2, pedido.IdUsuario);
            pstm.setString(3, pedido.preco);
            pstm.setString(4, pedido.quantidade);  
            Timestamp timestamp = new Timestamp(pedido.data.getTime());
            pstm.setTimestamp(5, timestamp);
            pstm.executeUpdate(); // Execute o comando de inserção para cada pedido
            pstm.close(); // fecha o PrepareStatement pra que ele nao insira o mesmo produto varias vezes
        }

        //JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        pstm.close();
    } catch (SQLException erro) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados " + erro);
    } finally {
        try {
            con.close();
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca " + err);
        }
    }
}
     //mostra os pedidos puxados do banco
     public void mostrarPedidos()
{
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
        
    pstm = con.prepareStatement("SELECT p.nome,pe.quantidade,p.preco"+ "FROM produtos p"+"INNER JOIN pedidos pe ON p.IdProduto=pe.IdProduto");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Pedidos p = new Pedidos();
             p.IdProduto = rs.getInt("IdProduto");
             p.IdUsuario=rs.getInt("IdUsuario");
             p.nome = rs.getString("preco");
             p.preco = rs.getString("quantidade");
             
             
        
             
            
        }while(rs.next());
    }
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao buscar dados no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de busca "+err);
        }
    }
    
    
}   //pega os pedidos baseado no Id do usuario usando um INNER JOIN
     public List<Pedidos> getPedidosUsuario(int idUsuario) {
    List<Pedidos> pedidosUsuario = new ArrayList<>();
    Connection con = null;
    PreparedStatement pstm = null;
    ResultSet rs = null;

    try {
        con = new Conexao().getConexao();
        String sql = "SELECT p.nome, pe.data, pe.quantidade, p.preco " +
                     "FROM produtos p " +
                     "INNER JOIN pedidos pe ON p.IdProduto = pe.IdProduto " +
                     "WHERE pe.IdUsuario = ?";
        pstm = con.prepareStatement(sql);
        pstm.setInt(1, idUsuario);
        rs = pstm.executeQuery();

        while (rs.next()) {
            Pedidos pedido = new Pedidos();
            pedido.nome=rs.getString("nome");
            pedido.preco=rs.getString("preco");
            pedido.quantidade=rs.getString("quantidade");
            pedido.data=rs.getDate("data");
           /* Timestamp timestamp = rs.getTimestamp("data");
            if (timestamp != null) {
                pedido.data=new java.util.Date(timestamp.getTime());
            }
*/
            pedidosUsuario.add(pedido);
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Trate a exceção de maneira apropriada para o seu aplicativo
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstm != null) pstm.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }

    return pedidosUsuario;
}

}

