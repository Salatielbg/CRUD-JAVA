package VIEW;

import DAO.ClientesDAO;
import DTO.ClientesDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
/**
 *
 * @author henri
 */
public class FrmRelatorioClientes extends javax.swing.JInternalFrame {

    public FrmRelatorioClientes() {
        initComponents();
        listarCliente();
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPesqNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPesqComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPesqNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPesqRua = new javax.swing.JTextField();
        btnCarcampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtPesqData = new javax.swing.JFormattedTextField();
        txtPesqCpf = new javax.swing.JFormattedTextField();
        txtPesqTelefone = new javax.swing.JFormattedTextField();
        txtPesqCep = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setMaximizable(true);
        setMinimumSize(new java.awt.Dimension(910, 430));

        tabelaCliente.setBackground(new java.awt.Color(255, 255, 255));
        tabelaCliente.setForeground(new java.awt.Color(0, 0, 0));
        tabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Data de nascimento", "CPF", "Nº Telefone", "Rua", "Complemento", "CEP", "Numero"
            }
        ));
        jScrollPane1.setViewportView(tabelaCliente);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Lista de Clientes");

        jLabel2.setText("ID");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setForeground(new java.awt.Color(153, 153, 153));
        txtId.setEnabled(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        txtPesqNome.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqNome.setForeground(new java.awt.Color(153, 153, 153));
        txtPesqNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqNomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Data Nascimento");

        jLabel5.setText("CPF");

        jLabel6.setText("Nº telefone");

        jLabel7.setText("Rua");

        txtPesqComplemento.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqComplemento.setForeground(new java.awt.Color(153, 153, 153));
        txtPesqComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqComplementoActionPerformed(evt);
            }
        });

        jLabel8.setText("Complemento");

        jLabel9.setText("CEP");

        txtPesqNumero.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqNumero.setForeground(new java.awt.Color(153, 153, 153));
        txtPesqNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqNumeroActionPerformed(evt);
            }
        });

        jLabel10.setText("Nº casa");

        txtPesqRua.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqRua.setForeground(new java.awt.Color(153, 153, 153));
        txtPesqRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqRuaActionPerformed(evt);
            }
        });

        btnCarcampos.setText("Carregar Campos");
        btnCarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarcamposActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar Campos");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir Campos");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtPesqData.setBackground(new java.awt.Color(255, 255, 255));
        try {
            txtPesqData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtPesqData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqDataActionPerformed(evt);
            }
        });

        txtPesqCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqCpf.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtPesqCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPesqTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqTelefone.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtPesqTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPesqCep.setBackground(new java.awt.Color(255, 255, 255));
        txtPesqCep.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtPesqCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(txtPesqRua, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesqData, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesqCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesqTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPesqComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPesqCep)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel10)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtPesqNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCarcampos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(662, 662, 662)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(txtPesqNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesqData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesqCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesqTelefone))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesqRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPesqComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPesqNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(txtPesqCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarcampos)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesqNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqNomeActionPerformed

    private void txtPesqComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqComplementoActionPerformed

    private void txtPesqNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqNumeroActionPerformed

    private void txtPesqRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqRuaActionPerformed

    private void btnCarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarcamposActionPerformed
        CarregarCampos();
    }//GEN-LAST:event_btnCarcamposActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarCliente();
        JOptionPane.showMessageDialog(null, "Cadastro do cliente Modificada");

        LimparCampos();
        listarCliente();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        ExcluirCliente();
        JOptionPane.showMessageDialog(null, "Cliente Excluido");
        LimparCampos();
        listarCliente();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPesqDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCarcampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaCliente;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtPesqCep;
    private javax.swing.JTextField txtPesqComplemento;
    private javax.swing.JFormattedTextField txtPesqCpf;
    private javax.swing.JFormattedTextField txtPesqData;
    private javax.swing.JTextField txtPesqNome;
    private javax.swing.JTextField txtPesqNumero;
    private javax.swing.JTextField txtPesqRua;
    private javax.swing.JFormattedTextField txtPesqTelefone;
    // End of variables declaration//GEN-END:variables
    private void listarCliente() {
        try {
            //Cria um objeto objCadClienteDAO da classe ClientesDAO
            ClientesDAO objCadClienteDAO = new ClientesDAO();

            //Obtém o modelo da tabela tabelaCliente e limpa todas as linhas existentes
            DefaultTableModel model = (DefaultTableModel) tabelaCliente.getModel();
            model.setNumRows(0);

            //Chama o método PesquisarCliente() do objeto objCadClienteDAO para obter uma lista de clientes
            ArrayList<ClientesDTO> lista = objCadClienteDAO.PesquisarCliente();

            //Para cada cliente na lista, adiciona uma nova linha à tabela com os detalhes do cliente.
            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_cliente(),
                    lista.get(num).getNome(),
                    lista.get(num).getDataNascimento(),
                    lista.get(num).getCpf(),
                    lista.get(num).getN_telefone(),
                    lista.get(num).getRua(),
                    lista.get(num).getComplemento(),
                    lista.get(num).getCep(),
                    lista.get(num).getNumero()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listarcliente" + erro);
        }

    }

    private void CarregarCampos() {

        //Obtém o índice da linha selecionada na tabela tabelaCliente
        int setar = tabelaCliente.getSelectedRow();

        if (setar == -1) {
            JOptionPane.showMessageDialog(this, "Nenhuma linha selecionada", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            txtId.setText(tabelaCliente.getModel().getValueAt(setar, 0).toString());
            txtPesqNome.setText(tabelaCliente.getModel().getValueAt(setar, 1).toString());
            txtPesqData.setText(tabelaCliente.getModel().getValueAt(setar, 2).toString());
            txtPesqCpf.setText(tabelaCliente.getModel().getValueAt(setar, 3).toString());
            txtPesqTelefone.setText(tabelaCliente.getModel().getValueAt(setar, 4).toString());
            txtPesqRua.setText(tabelaCliente.getModel().getValueAt(setar, 5).toString());
            txtPesqComplemento.setText(tabelaCliente.getModel().getValueAt(setar, 6).toString());
            txtPesqCep.setText(tabelaCliente.getModel().getValueAt(setar, 7).toString());
            txtPesqNumero.setText(tabelaCliente.getModel().getValueAt(setar, 8).toString());
            
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }

    }

    private void AlterarCliente() {
        String nome_cliente, id_cliente, datanascimentocliente, cpfcliente, n_telefonecliente, ruacliente, complementocliente, cepcliente, numerocasa;

        id_cliente = txtId.getText();
        nome_cliente = txtPesqNome.getText();
        datanascimentocliente = txtPesqData.getText();
        cpfcliente = txtPesqCpf.getText();
        n_telefonecliente = txtPesqTelefone.getText();
        ruacliente = txtPesqRua.getText();
        complementocliente = txtPesqComplemento.getText();
        cepcliente = txtPesqCep.getText();
        numerocasa = txtPesqNumero.getText();

        ClientesDTO objCadclientedto = new ClientesDTO();

        objCadclientedto.setId_cliente(id_cliente);
        objCadclientedto.setNome(nome_cliente);
        objCadclientedto.setDataNascimento(datanascimentocliente);
        objCadclientedto.setCpf(cpfcliente);
        objCadclientedto.setN_telefone(n_telefonecliente);
        objCadclientedto.setRua(ruacliente);
        objCadclientedto.setComplemento(complementocliente);
        objCadclientedto.setCep(cepcliente);
        objCadclientedto.setNumero(numerocasa);

        ClientesDAO objcadclientedao = new ClientesDAO();

        objcadclientedao.AlterarCliente(objCadclientedto);

    }

    private void LimparCampos() {
        txtPesqCep.setText("");
        txtPesqComplemento.setText("");
        txtPesqCpf.setText("");
        txtPesqData.setText("");
        txtPesqNome.setText("");
        txtPesqNumero.setText("");
        txtPesqRua.setText("");
        txtPesqTelefone.setText("");

    }

    private void ExcluirCliente() {
        String id_cliente;

        id_cliente = txtId.getText();
        ClientesDTO objClientedto = new ClientesDTO();
        objClientedto.setId_cliente(id_cliente);

        ClientesDAO objCadClienteDao = new ClientesDAO();
        objCadClienteDao.ExcluirCliente(objClientedto);

    }
}
