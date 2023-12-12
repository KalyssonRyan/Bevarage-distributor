/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerPedidos;
import controller.ControllerProduto;
import controller.ControllerUsuario;
import dao.DaoUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pedidos;
import model.Produto;

/**
 *
 * @author Usuario
 */
public class Outros extends javax.swing.JFrame {
    //indice para percorrer a lista
    int indice=0;
    //iniciando os controllers
    ControllerUsuario controllerusu = new ControllerUsuario();
    ControllerProduto controleprod = new ControllerProduto(); 
    //carregando as listas com produtos
    List<Produto> lista = controleprod.getUpdateProduto();
    List<Produto> listaproduto = new ArrayList<Produto>();
    List<Pedidos> listaPedidos = new ArrayList<Pedidos>();
    ControllerPedidos controllerpedido = new ControllerPedidos();
    ControllerProduto controllerproduto = new ControllerProduto();
    public Outros() {
        initComponents();
        if(lista.isEmpty())
        {
            //se a lista tiver vazia o botão de primeio vai estar desabilitado
            btnPrimeiro.setEnabled(false);
            
        }
        else
        { //caso contrario vai estar tudo habilitado e vai mostrar os produtos na tela
            txtId.setEnabled(false);
            txtNome.setEnabled(false);
            txtEstoque.setEnabled(false);
            txtPreco.setEnabled(false);
            indice=0;
            mostrarProdutoTela();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        lbID = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lbEstoque = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbQuantidade = new javax.swing.JLabel();
        txtEstoque = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        lbQuantidade1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lbTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnCarrinho = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(872, 495));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lbID.setBackground(new java.awt.Color(0, 0, 0));
        lbID.setText("ID:");

        lbNome.setBackground(new java.awt.Color(0, 0, 0));
        lbNome.setText("Nome: ");

        lbEstoque.setBackground(new java.awt.Color(0, 0, 0));
        lbEstoque.setText("Estoque:");

        lbQuantidade.setBackground(new java.awt.Color(0, 0, 0));
        lbQuantidade.setText("Preco");

        lbQuantidade1.setBackground(new java.awt.Color(0, 0, 0));
        lbQuantidade1.setText("Quantidade");

        lbTotal.setBackground(new java.awt.Color(0, 0, 0));
        lbTotal.setText("Total a Pagar: ");

        txtTotal.setBackground(new java.awt.Color(0, 0, 0));
        txtTotal.setText("0");

        btnCarrinho.setText("Adicionar Ao Carrinho");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPrimeiro)
                                .addGap(18, 18, 18)
                                .addComponent(btnAnterior)
                                .addGap(18, 18, 18)
                                .addComponent(btnProximo)
                                .addGap(18, 18, 18)
                                .addComponent(btnUltimo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbQuantidade1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lbTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotal)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCarrinho)
                .addGap(71, 71, 71)
                .addComponent(btnFinalizar)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstoque)
                    .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuantidade1)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo)
                    .addComponent(btnUltimo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotal)
                    .addComponent(txtTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar)
                    .addComponent(btnCarrinho))
                .addContainerGap())
        );

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(249, 249, 249))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/iconeSair.png"))); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        //Botão para sair  
        int resposta= JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(resposta == JOptionPane.YES_OPTION){
               System.exit(0);
       }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        //Mostrar o primeiro Produto da lista
        indice =0;
        mostrarProdutoTela();
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
//Mostra o Produto Anterior        

    //se o indice for maior que zero então existe outro antes dele
        if(indice>0)
        { //diminui o indice e mostra na tela
            indice--;
            mostrarProdutoTela();
        }
        else
        {//caso contrario vai voce vai estar no primeiro item da lista já
            JOptionPane.showMessageDialog(this, "Você já está no primeiro item","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        //Vai para o Proximo Produto
        //se o tamanho da lista-1 for menor que o indice quer dizer que existe o proximo 
        if(indice<lista.size()-1){
            //então adiciona mais 1 no indice e mostra na tela
            indice++;
            mostrarProdutoTela();
        }else
        {//caso contrario voce ja está no ultimo item
            JOptionPane.showMessageDialog(this, "Você já está no último item","Atenção",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        //ir para o ultimo item da lista
        //indice vira o tamanho da lista -1
        indice = lista.size()-1;
        //mostra na tela o produto
        mostrarProdutoTela();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        //Finaliza a Compra
        //pega o total da tela
        float total = Float.parseFloat(txtTotal.getText());
        if(total!=0){
         //se o total for diferente de zero
           //salva o pedido no banco
          controllerpedido.SalvarPedidos(listaPedidos);    
    controllerproduto.alterarProdutolist(listaproduto);
        //Atualizar no Banco as alterações
        
            
        //salvando o preco total para mostrar em outra tela
        Pedidos.Total=Float.parseFloat(txtTotal.getText());
             Pagamento pag= new Pagamento();
             pag.show();
             this.dispose();
        }else{
         JOptionPane.showMessageDialog(this, "O seu carrinho está vazio");
        }
        
   
        
       
        
        
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //botao para voltar
        int resposta= JOptionPane.showConfirmDialog(null,"Tem certeza que deseja voltar?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(resposta == JOptionPane.YES_OPTION){
           new FazerPedido().show();
           this.dispose();
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
        //novo pedido
       
        Pedidos pedido= new Pedidos();
        //um try catch para caso digite alguma letra ou algo que nao seja numero
        try{
         //pega estoque,quantidade e preco do produto na tela
        int estoque=Integer.parseInt(txtEstoque.getText());
        int quantidade =Integer.parseInt(txtQuantidade.getText());
        float preco=Float.parseFloat(txtPreco.getText());
        
        //verifica se o numero digitado é maior que o estoque disponível
        if(quantidade>estoque){
            JOptionPane.showMessageDialog(this, "Não existe estoque suficiente para o sua quantidade desejada");
            txtQuantidade.setText("");
        }
        else{
            //Adiciona Item a uma Lista,para depois ser adicionado no banco
            int resultado=estoque-quantidade;
            txtEstoque.setText(String.valueOf(resultado));
            float total=Float.parseFloat(txtTotal.getText());
            //calcula o preço dos items adicionados ao carrinho e mostra na tela 
            float valor=preco*quantidade;
            total+=valor;
            txtTotal.setText(String.valueOf(total));
            pedido.nome=txtNome.getText();
            pedido.IdProduto=Integer.parseInt(txtId.getText());
            pedido.IdUsuario=controllerusu.IdUsuario();
            pedido.quantidade=String.valueOf(quantidade);
            pedido.data= new Date();
            pedido.preco=String.valueOf(preco);
            //adiciona o produto a lista de pedidos
            listaPedidos.add(pedido);
            
           
            
        }
       }catch(NumberFormatException erro){
       JOptionPane.showMessageDialog(this, "Digite Apenas números"+erro);
       txtQuantidade.setText("");
       }
        //apos escolher o que quer,pega as alterações que fez e joga em uma lista de produto para atualizar no banco depois
        int estoque=Integer.parseInt(txtEstoque.getText());
        float preco=Float.parseFloat(txtPreco.getText());
            Produto produto = new Produto();
            produto.nome=txtNome.getText();
            produto.id=Integer.parseInt(txtId.getText());
            produto.preco=String.valueOf(preco);
            produto.quantidade=String.valueOf(estoque);  
            listaproduto.add(produto);
    }//GEN-LAST:event_btnCarrinhoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Outros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Outros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Outros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Outros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Outros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbQuantidade1;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtEstoque;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

public void mostrarProdutoTela(){
        // pega da lista e mostra na tela,ID,Nome,Estoque,Preco e Quantidade
        txtId.setText(""+lista.get(indice).id);
        txtNome.setText(lista.get(indice).nome);
        txtEstoque.setText(lista.get(indice).quantidade);
        txtPreco.setText(lista.get(indice).preco);
        txtQuantidade.setText("");


}
}

