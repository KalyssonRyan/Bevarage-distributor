
package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;


public class DaoUsuario {
    Connection con = null;
    PreparedStatement pstm = null;
    // variavel statica para poder pegar o id em outras telas
    public static int UserId;
 //carrega uma lista com todos os usuarios   
public List<Usuario> getUsuarios()
{
    List<Usuario> lista = new ArrayList<Usuario>();
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM usuario");
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            Usuario n = new Usuario();
             n.id = rs.getInt("id");
             n.nome=rs.getString("nome");
             n.CPF = rs.getString("CPF");
             n.telefone =rs.getString("telefone");
             n.senha = rs.getString("senha");
             
        
             lista.add(n);
            
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
//valida o Login com nome e Senha para ver se tem no banco,se tiver faz login
public Boolean validarLogin(String n,String s)
{   
    boolean resp=false;
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM usuario WHERE nome=? and senha=?");
    pstm.setString(1, n);
    pstm.setString(2, s);
        
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        resp=true;
        
            
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
    
    return resp;
}// valida da mesma forma que o Usuario porem produrando o tipo como Administrador
public Boolean validarAdmin(String n,String s)
{
    boolean resp=false;
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT * FROM usuario WHERE tipo_usuario='Administrador' and nome=? and senha=?;");
    pstm.setString(1, n);
    pstm.setString(2, s);
        
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        resp=true;
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
    
    return resp;
} // cadastra um novo usuario no banco
public void CadastrarUsuario(Usuario user)
{
    con = new Conexao().getConexao();
    
    try{
        pstm = con.prepareStatement("INSERT INTO usuario (nome,cpf,telefone,senha,tipo_usuario) VALUES (?,?,?,?,?)");
        pstm.setString(1,user.nome);
        pstm.setString(2,user.CPF);
        pstm.setString(3,user.telefone);
        pstm.setString(4,user.senha);
        pstm.setString(5,"Cliente");
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
//Pega o ID do usuario e salva em uma variavel static,para que seja possível usar em outras telas
public int getIdUser(String n,String s)
{
    
    ResultSet rs = null;
    con = new Conexao().getConexao();
    
    try{
    pstm = con.prepareStatement("SELECT IdUsuario FROM usuario WHERE nome=? and senha=?");
     pstm.setString(1, n);
     pstm.setString(2,s);
    rs =  this.pstm.executeQuery();
    if(rs.first())
    {
        do{
            
             UserId = rs.getInt("IdUsuario");
         
             
        
             
            
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
    
    return UserId;
}
}
