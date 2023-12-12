/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DaoUsuario;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Usuario
 */
public class ControllerUsuario {
    DaoUsuario daoUser = new DaoUsuario();
    //valida o Login do usuario
    public boolean validarLogin(Usuario user){
       
        if(!user.nome.equals("") && !user.senha.equals("")){
            //se nao estiver vazio chama o dao
           return  daoUser.validarLogin(user.nome,user.senha);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            return false;
        }
    
    }
    //valida se o usuario é admin
    public boolean validarAdmin(Usuario user){
       
        if(!user.nome.equals("") && !user.senha.equals("")){
            //se nao estiver vazio chama o dao
           return  daoUser.validarAdmin(user.nome,user.senha);
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            return false;
        }
    
    }
    //pega o ID do usuario
    public int getIdUser(Usuario user){
       if(!user.nome.equals("") && !user.senha.equals("")){
           //se nao estiver vazio chama o dao
           return  daoUser.getIdUser(user.nome,user.senha);
            
        }
       else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            return 0;
        }
        
       
    }
    public void CadastrarUsuario(Usuario user){
        //chama o dao para cadastrar o usuario
       if(!user.nome.equals("") && !user.senha.equals("") && !user.CPF.equals("") && !user.telefone.equals("")){
           //se nao estiver vazio chama o dao para cadastrar
        daoUser.CadastrarUsuario(user);
        }
       else
        {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
        }
    }
    public static int IdUsuario(){
        //pega o Id do usuario
        int resultado =DaoUsuario.UserId;
        return resultado;
    }
}
