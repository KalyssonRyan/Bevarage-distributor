package distribuidorafanta;
import view.Login;
import conexao.Conexao;
import view.Cadastro;
import view.FazerPedido;
import view.Pagamento;
import view.TelaAdm;
import view.TelaCliente;
import view.VerPedidos;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DistribuidoraFanta {


    public static void main(String[] args) {
        //Chamando a tela de Login e Habilitando
        Login login = new Login();
        login.setVisible(true);
          //Um Try Catch para mudar o Tema do sistema,para deixar de ter aqueles botões feios
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DistribuidoraFanta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(DistribuidoraFanta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DistribuidoraFanta.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(DistribuidoraFanta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
