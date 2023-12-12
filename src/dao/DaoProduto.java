/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import model.Usuario;
import view.FazerPedido;
public class DaoProduto {
    public static int idProdutoExcluir;
    Connection con = null;
PreparedStatement pstm = null;
//pega do banco uma lista de produtos    
public List<Produto> getProdutos()
{
    List<Produto> lista = new ArrayList<Produto>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM produtos");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Produto p = new Produto();
             p.id = rs.getInt("idProduto");
             p.nome=rs.getString("nome");
             p.preco = rs.getString("preco");
             p.quantidade = rs.getString("estoque");
             
             
        
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
//cadastra um produto no banco
    public void CadastrarProduto(Produto p)
{
    con = new Conexao().getConexao();
    
    try{
        pstm = con.prepareStatement("INSERT INTO produtos (nome,preco,estoque) VALUES (?,?,?)");
        pstm.setString(1,p.nome);
        pstm.setString(2,p.preco);
        pstm.setString(3,p.quantidade);
        this.pstm.execute();
        JOptionPane.showMessageDialog(null,"salvo com sucesso");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao salvar no banco de dados"+erro);
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
    
 
}
    //carrega as combobox com o nome do produto
    public List<String> carregaComboBox()
{
    List<String> lista = new ArrayList<String>();
    
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM produtos ORDER BY nome ASC ");
    rs =  this.pstm.executeQuery();
    while(rs.next()){
        lista.add(rs.getString("nome"));
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
//salva no banco as alterações feitas
    public void alterarProduto(Produto p)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("UPDATE produtos SET IdProduto =?, nome=?, preco = ?, estoque=? WHERE IdProduto =?");
    pstm.setInt(1,p.id );
    pstm.setString(2,p.nome);
    pstm.setString(3, p.preco);
    pstm.setString(4, p.quantidade);
    pstm.setInt(5,p.id );
    this.pstm.execute();
    //JOptionPane.showMessageDialog(null,"Produto alterado com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar produto no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de alteração "+err);
        }
    }
    

} //salva no banco a alteração do estoque
public void alterarEstoque(Produto p)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("UPDATE produtos SET estoque=? WHERE nome =?");
    pstm.setString(1,p.quantidade );
    pstm.setString(2,p.nome);
    
    this.pstm.execute();
    JOptionPane.showMessageDialog(null,"Estoque alterado com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar produto no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de alteração "+err);
        }
    }
    

} //salva no banco a alteração do preco
public void alterarPreco(Produto p)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("UPDATE produtos SET preco=? WHERE nome =?");
    pstm.setString(1,p.preco );
    pstm.setString(2,p.nome);
    
    this.pstm.execute();
    JOptionPane.showMessageDialog(null,"Estoque alterado com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar produto no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de alteração "+err);
        }
    }
    

} //salva no banco a lista de produtos que pediu
 public void alterarProdutolist(List<Produto> p)
{
    con = new Conexao().getConexao();
    
    try{
        for (Produto produto : p) {
            pstm = con.prepareStatement("UPDATE produtos SET IdProduto =?, nome=?, preco = ?, estoque=? WHERE IdProduto =?");
            pstm.setInt(1,produto.id );
            pstm.setString(2,produto.nome);
            pstm.setString(3, produto.preco);
            pstm.setString(4, produto.quantidade);
            pstm.setInt(5,produto.id );
            this.pstm.execute();
        }
  //  JOptionPane.showMessageDialog(null,"Produto alterado com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao alterar produto no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de alteração "+err);
        }
    }
    

} //pega do banco o produto com mais estoque
 public Produto consultaMaisEstoque()
{
    Produto lista = new Produto();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM produtos ORDER BY estoque DESC LIMIT 1");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
             
             lista.nome=rs.getString("nome");

        
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
 //pega do banco o produto com menos estoque
 public Produto consultaMaisVendido()
{
    Produto lista = new Produto();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM produtos ORDER BY estoque LIMIT 1");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
             
             lista.nome=rs.getString("nome");

        
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
} // pega do estoque o produto com preco mais caro
 public Produto consultaMaisCaro()
{
    Produto lista = new Produto();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM produtos ORDER BY preco DESC LIMIT 1");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
             
             lista.nome=rs.getString("nome");

        
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
}//pega do banco o produto com preco mais barato
 public Produto consultaMaisBarato()
{
    Produto lista = new Produto();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT nome FROM produtos ORDER BY preco LIMIT 1");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
             
             lista.nome=rs.getString("nome");

        
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
}// exclui o produto baseado no ID 
 public void excluirProduto(int id)
{
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("DELETE FROM pedidos WHERE IdProduto=?");
    pstm.setInt(1, id);
    this.pstm.execute();
    pstm = con.prepareStatement("DELETE FROM produtos WHERE IdProduto=?");
    pstm.setInt(1, id);
    this.pstm.execute();
    
    JOptionPane.showMessageDialog(null,"Produto excluído com sucesso!!!");
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao excluir Produto no BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de exclusão "+err);
        }
    }
    

} //pega o Id do produto para excluir ele depois
 public void getIdProduto(String nome)
{
    con = new Conexao().getConexao();
    ResultSet rs = null;
    try{
    pstm = con.prepareStatement("SELECT IdProduto FROM produtos WHERE nome=?");
    pstm.setString(1, nome);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            
             idProdutoExcluir = rs.getInt("IdProduto");
         
             
        
             
            
        }while(rs.next());
    }
    
    pstm.close();
    }
    catch(SQLException erro)
    {
        JOptionPane.showMessageDialog(null, "Erro ao pegar id do produtono BD "+erro);
    }
    finally{
        try{
        con.close();
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão de exclusão "+err);
        }
    }
    

}
}
