/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerProduto;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author ruanrochaeuok
 */
public class TelaAdm extends javax.swing.JFrame {
   //inicia o controller
    ControllerProduto controllerproduto = new ControllerProduto();
    //carrega os produtos para uma lista
   List<Produto> lista = controllerproduto.getUpdateProduto();
   //carrega os produtos para a combobox
   List<String> outroscombo = controllerproduto.carregaCombo();
    public TelaAdm() {
        initComponents();
        //preenche a combobox com os produtos
        preenchercombobox();
        if(lista.isEmpty())
        {//se a lista tiver vazia nao pode alterar nada
            cmBoxAlterarValorProduto.setEnabled(false);
            txtNovoValorProduto.setEnabled(false);
            jBAlterar.setEnabled(false);
            
        }
        else
        {
           //mostra os estoques na tela
            mostrarEstoqueTela();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmBoxAlterarValorProduto = new javax.swing.JComboBox<>();
        jBAlterar = new javax.swing.JButton();
        txtNovoValorProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmBoxAdicionarEstoqueProduto = new javax.swing.JComboBox<>();
        txtNovoValorProduto1 = new javax.swing.JTextField();
        jBAdicionar1 = new javax.swing.JButton();
        cmBoxExcluirEstoqueProduto = new javax.swing.JComboBox<>();
        jBAdicionar2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAdicionarProdutoNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdicionarProdutoQuantidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdicionarProdutoPreco = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        MaiorEstoque = new javax.swing.JLabel();
        jLSegundoMaisVendido = new javax.swing.JLabel();
        jLQuartoMaisVendido = new javax.swing.JLabel();
        jLTerceiroMaisVendido = new javax.swing.JLabel();
        setarMaisVendido = new javax.swing.JLabel();
        setarMaiorEstoque = new javax.swing.JLabel();
        setarProdutoMaisCaro = new javax.swing.JLabel();
        setarProdutoMaisBarato = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLEstoqueLaranja = new javax.swing.JLabel();
        jLEstoqueMorango = new javax.swing.JLabel();
        jLEstoqueBerry = new javax.swing.JLabel();
        jLEstoqueUva = new javax.swing.JLabel();
        setarEstoqueLaranja = new javax.swing.JLabel();
        setarEstoqueMorango = new javax.swing.JLabel();
        setarEstoqueBerry = new javax.swing.JLabel();
        setarEstoqueUva = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel1.setText("Alterar Valor");

        cmBoxAlterarValorProduto.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        cmBoxAlterarValorProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--" }));

        jBAlterar.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        txtNovoValorProduto.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel7.setText("Alterar Estoque");

        cmBoxAdicionarEstoqueProduto.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        cmBoxAdicionarEstoqueProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--" }));

        txtNovoValorProduto1.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        jBAdicionar1.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jBAdicionar1.setText("Adicionar");
        jBAdicionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionar1ActionPerformed(evt);
            }
        });

        cmBoxExcluirEstoqueProduto.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        cmBoxExcluirEstoqueProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecione--" }));

        jBAdicionar2.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jBAdicionar2.setText("Excluir");
        jBAdicionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionar2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel8.setText("Excluir Item");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmBoxExcluirEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBAdicionar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cmBoxAdicionarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNovoValorProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel8)))))
                        .addGap(18, 18, 18)
                        .addComponent(jBAdicionar1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmBoxAlterarValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNovoValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmBoxAlterarValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovoValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAlterar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmBoxAdicionarEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNovoValorProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar1))
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmBoxExcluirEstoqueProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar2))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        jLabel2.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel2.setText("Adicionar Produto");

        jLabel3.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        txtAdicionarProdutoNome.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade");

        txtAdicionarProdutoQuantidade.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel5.setText("Preço");

        txtAdicionarProdutoPreco.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAdicionarProdutoQuantidade)
                            .addComponent(txtAdicionarProdutoNome)
                            .addComponent(txtAdicionarProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAdicionarProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdicionarProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdicionarProdutoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 51, 102));

        jLabel6.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel6.setText("Consulta");

        MaiorEstoque.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        MaiorEstoque.setText("Maior Estoque: ");

        jLSegundoMaisVendido.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLSegundoMaisVendido.setText("Mais Vendido:");

        jLQuartoMaisVendido.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLQuartoMaisVendido.setText("Produto mais Barato:");

        jLTerceiroMaisVendido.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLTerceiroMaisVendido.setText("Produto Mais Caro :");

        setarMaisVendido.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        setarMaisVendido.setText("Laranja");

        setarMaiorEstoque.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        setarMaiorEstoque.setText("Uva");

        setarProdutoMaisCaro.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        setarProdutoMaisCaro.setText("Berry");

        setarProdutoMaisBarato.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        setarProdutoMaisBarato.setText("Morango");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(MaiorEstoque)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(setarMaiorEstoque))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLSegundoMaisVendido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(setarMaisVendido))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLTerceiroMaisVendido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(setarProdutoMaisCaro))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLQuartoMaisVendido)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(setarProdutoMaisBarato))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaiorEstoque)
                    .addComponent(setarMaiorEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLSegundoMaisVendido)
                    .addComponent(setarMaisVendido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTerceiroMaisVendido)
                    .addComponent(setarProdutoMaisCaro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLQuartoMaisVendido)
                    .addComponent(setarProdutoMaisBarato))
                .addGap(32, 32, 32))
        );

        jPanel5.setBackground(new java.awt.Color(102, 204, 255));

        jLabel11.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLabel11.setText("Estoque");

        jLEstoqueLaranja.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLEstoqueLaranja.setText("Fanta Laranja:");

        jLEstoqueMorango.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLEstoqueMorango.setText("Fanta Morango:");

        jLEstoqueBerry.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLEstoqueBerry.setText("Fanta Berry:");

        jLEstoqueUva.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N
        jLEstoqueUva.setText("Fanta Uva:");

        setarEstoqueLaranja.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        setarEstoqueMorango.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        setarEstoqueBerry.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        setarEstoqueUva.setFont(new java.awt.Font("Google Sans Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLEstoqueLaranja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setarEstoqueLaranja))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLEstoqueMorango)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setarEstoqueMorango))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLEstoqueBerry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setarEstoqueBerry))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLEstoqueUva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setarEstoqueUva)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstoqueLaranja)
                    .addComponent(setarEstoqueLaranja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstoqueMorango)
                    .addComponent(setarEstoqueMorango))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstoqueBerry)
                    .addComponent(setarEstoqueBerry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEstoqueUva)
                    .addComponent(setarEstoqueUva))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        jLogout.setText("Fazer Log out");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addGap(208, 208, 208))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jLogout)
                .addGap(14, 14, 14))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
    //botão para sair
        int resposta= JOptionPane.showConfirmDialog(null,"Tem certeza que deseja sair?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(resposta == JOptionPane.YES_OPTION){
               System.exit(0);
       }
    }//GEN-LAST:event_jMenu2MouseClicked

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
       //Adicionar novo produto
        Produto produto = new Produto();
        //pega da tela as informações e salva em uma Produto
       produto.nome=txtAdicionarProdutoNome.getText();
       produto.preco=txtAdicionarProdutoPreco.getText();
       produto.quantidade=txtAdicionarProdutoQuantidade.getText();
       //chama o controler para cadastrar esse produto
       controllerproduto.CadastrarProduto(produto);
       //////dao.CadastrarProduto(produto);
       //atualiza a lista e o combobox com os produtos
       lista = controllerproduto.getUpdateProduto();
       outroscombo = controllerproduto.carregaCombo();
       //exclui todos os items do combobox para não sobreescrever e ter 2 de cada item
       cmBoxAlterarValorProduto.removeAllItems();
       cmBoxAdicionarEstoqueProduto.removeAllItems();
       cmBoxExcluirEstoqueProduto.removeAllItems();
       //adiciona o primeiro texto e depois preenche denovo
       cmBoxAlterarValorProduto.addItem("---Selecione--");
       cmBoxAdicionarEstoqueProduto.addItem("---Selecione--");
       cmBoxExcluirEstoqueProduto.addItem("---Selecione--");
       preenchercombobox();
       LimparTela();
       
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        //Botão para voltar para a tela de Login
        int resposta= JOptionPane.showConfirmDialog(null,"Tem certeza que deseja fazer Log out?","Confirmação",JOptionPane.YES_NO_OPTION);
       if(resposta == JOptionPane.YES_OPTION){
            new Login().show();
            this.dispose();
       }
        
       
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
       //um try catch para caso digite alguma letra ou algo que nao seja numero
        try{
           Produto prod = new Produto();
           //pega nome e preco do produto na tela
           prod.nome=cmBoxAlterarValorProduto.getSelectedItem().toString();
           prod.preco=txtNovoValorProduto.getText();
           //Chama o controler para alterar o preco no Dao
           controllerproduto.alterarPreco(prod);
           ////////dao.alterarPreco(prod);
           //carrega de novo pra lista o produto atualizado
           lista = controllerproduto.getUpdateProduto();
           //e mostra na tela
        mostrarEstoqueTela();
       }catch(NumberFormatException erro){
            JOptionPane.showMessageDialog(this, "Digite Apenas números "+erro);
       }//limpa a caixa de texto para digitar de novo
        txtNovoValorProduto.setText("");
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBAdicionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionar1ActionPerformed
        //um try catch para caso digite alguma letra ou algo que nao seja numero
        try{
            //cria um novo produto
            Produto prod = new Produto();
            //pega estoque,quantidade,nome e preco do produto na tela
        int quantidade =Integer.parseInt(txtNovoValorProduto1.getText());
        prod.nome=cmBoxAdicionarEstoqueProduto.getSelectedItem().toString();
        prod.quantidade=txtNovoValorProduto1.getText();
        //verifica se o numero digitado é maior que o estoque disponível
        if(quantidade<=0){
            JOptionPane.showMessageDialog(this, "Não é possivel inserir essa quantidade");
        }
        else{
            //chama o controller para alterar o estoque do produto
            controllerproduto.alterarEstoque(prod);
            ////////dao.alterarEstoque(prod);
            //carrega a lista de produto atualizada
            lista = controllerproduto.getUpdateProduto();
            //mostra o produto na tela
            mostrarEstoqueTela();
            
        }
        }catch(NumberFormatException erro){
           JOptionPane.showMessageDialog(this, "Digite Apenas números "+erro);
        }
        //limpa a caixa de texto para digitar de novo
        txtNovoValorProduto1.setText("");
    }//GEN-LAST:event_jBAdicionar1ActionPerformed

    private void jBAdicionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionar2ActionPerformed
        //Exclui item do banco
        //pega o nome do produto que deseja excluir
        
        String nome=(String) cmBoxExcluirEstoqueProduto.getSelectedItem();
        //se for algum dos produtos padroes nao deixa excluir
        
        if(nome.equals("Fanta Uva") || nome.equals("Fanta Berry")|| nome.equals("Fanta Laranja")|| nome.equals("Fanta Morango")|| nome.equals("--Selecione--")){
            JOptionPane.showMessageDialog(this, "Não é possivel excluir os produtos padrões entre em contato com o Desenvolvedor");
        }
        

        else{
        
        //atravez do nome descubra o id do produto e salve
        int id=controllerproduto.getIdProduto(nome);
        //chama o controller para deletar o produto
        controllerproduto.delProduto(id,nome);
        //atualiza a lista e outroscombo
        lista = controllerproduto.getUpdateProduto();
        outroscombo = controllerproduto.carregaCombo();
        //exclui tudo dos combobox para não haver copias e coloca de novo o texto do inicio
        cmBoxExcluirEstoqueProduto.removeAllItems();
        cmBoxExcluirEstoqueProduto.addItem("---Selecione--");
        //preenche o combobox novamente e mostra na tela
        preenchercombobox();
        mostrarEstoqueTela();
        LimparTela();
        }
    }//GEN-LAST:event_jBAdicionar2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MaiorEstoque;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JComboBox<String> cmBoxAdicionarEstoqueProduto;
    private javax.swing.JComboBox<String> cmBoxAlterarValorProduto;
    private javax.swing.JComboBox<String> cmBoxExcluirEstoqueProduto;
    private javax.swing.JButton jBAdicionar1;
    private javax.swing.JButton jBAdicionar2;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JLabel jLEstoqueBerry;
    private javax.swing.JLabel jLEstoqueLaranja;
    private javax.swing.JLabel jLEstoqueMorango;
    private javax.swing.JLabel jLEstoqueUva;
    private javax.swing.JLabel jLQuartoMaisVendido;
    private javax.swing.JLabel jLSegundoMaisVendido;
    private javax.swing.JLabel jLTerceiroMaisVendido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLogout;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel setarEstoqueBerry;
    private javax.swing.JLabel setarEstoqueLaranja;
    private javax.swing.JLabel setarEstoqueMorango;
    private javax.swing.JLabel setarEstoqueUva;
    private javax.swing.JLabel setarMaiorEstoque;
    private javax.swing.JLabel setarMaisVendido;
    private javax.swing.JLabel setarProdutoMaisBarato;
    private javax.swing.JLabel setarProdutoMaisCaro;
    private javax.swing.JTextField txtAdicionarProdutoNome;
    private javax.swing.JTextField txtAdicionarProdutoPreco;
    private javax.swing.JTextField txtAdicionarProdutoQuantidade;
    private javax.swing.JTextField txtNovoValorProduto;
    private javax.swing.JTextField txtNovoValorProduto1;
    // End of variables declaration//GEN-END:variables
void LimparTela(){
    //limpa a tela,onde tiver nome,preco e quantidade
        txtAdicionarProdutoNome.setText("");
       txtAdicionarProdutoPreco.setText("");
       txtAdicionarProdutoQuantidade.setText("");

}
public void mostrarEstoqueTela(){
        //pega o estoque da lista de produtos e mostra na tela de Estoque
        setarEstoqueUva.setText(""+lista.get(0).quantidade);
        setarEstoqueBerry.setText(lista.get(1).quantidade);
        setarEstoqueMorango.setText(lista.get(2).quantidade);
        setarEstoqueLaranja.setText(lista.get(3).quantidade);
        //controller que pega o item com maior estoque e mostra na parte de Consulta
        Produto maiorestoque =controllerproduto.consultaMaisEstoque();
        setarMaiorEstoque.setText(maiorestoque.nome);
        //controller que pega o item mais vendidoestoque e mostra na parte de Consulta
        Produto maisvendido =controllerproduto.consultaMaisVendido();
        setarMaisVendido.setText(maisvendido.nome);
        //controller que pega o item mais caro e mostra na parte de Consulta
        Produto maiscaro=controllerproduto.consultaMaisCaro();
        setarProdutoMaisCaro.setText(maiscaro.nome);
        //controller que pega o item mais barato e mostra na parte de Consulta
        Produto maisbarato = controllerproduto.consultaMaisBarato();
        setarProdutoMaisBarato.setText(maisbarato.nome);
        
}
public void preenchercombobox(){
    for(String dado :outroscombo){
            //um for para pegar todos os items e preencher a combobox
           cmBoxAlterarValorProduto.addItem(dado);
           cmBoxAdicionarEstoqueProduto.addItem(dado);
           cmBoxExcluirEstoqueProduto.addItem(dado);
       }
}
}

