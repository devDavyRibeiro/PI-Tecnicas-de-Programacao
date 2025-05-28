/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;
import DAO.Noticia;
import DAO.connectDAO;
/**
 *
 * @author Trabalhos
 */
public class FormNoticia extends javax.swing.JFrame {
    private String operacaoGlobal;
    private String operacaoAtiva;

    public FormNoticia() {
        initComponents();
    }

    public FormNoticia(String operacao){
        initComponents();
        
        setOperacaoGlobal(operacao);
        
        setOperacaoAtiva("Inserir");
        
        if(getOperacaoAtiva().equals(getOperacaoGlobal())){
            setVisibleForm(true);
            jTextField_ID.setVisible(false);
            jLabel_ID.setVisible(false);
            jButtonSuccess.setText("Cadastrar");
        }
        
        setOperacaoAtiva("Alteração");
        if(getOperacaoAtiva().equals(getOperacaoGlobal())){
            setVisibleForm(false);
            jTextField_ID.setVisible(true);
            jLabel_ID.setVisible(true);
            jButtonSuccess.setText("Pesquisar");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_ID = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jTextField_Titulo = new javax.swing.JTextField();
        jLabel_Descricao = new javax.swing.JLabel();
        jLabel_Data = new javax.swing.JLabel();
        jTextField_Data = new javax.swing.JTextField();
        jLabel_IdAdmin = new javax.swing.JLabel();
        jTextField_IDAdmin = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonSuccess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_ID.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel_ID.setText("ID");
        jLabel_ID.setName("lbId"); // NOI18N

        jTextField_ID.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextField_ID.setToolTipText("");
        jTextField_ID.setName("txbId"); // NOI18N

        jLabel_Titulo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel_Titulo.setText("Título");
        jLabel_Titulo.setName("lbTitulo"); // NOI18N

        jTextField_Titulo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextField_Titulo.setToolTipText("");
        jTextField_Titulo.setName("txbTitulo"); // NOI18N

        jLabel_Descricao.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel_Descricao.setText("Descrição");
        jLabel_Descricao.setName("lbDescricao"); // NOI18N

        jLabel_Data.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel_Data.setText("Data Publicação");
        jLabel_Data.setName("lbData"); // NOI18N

        jTextField_Data.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextField_Data.setToolTipText("");
        jTextField_Data.setName("txbData"); // NOI18N

        jLabel_IdAdmin.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jLabel_IdAdmin.setText("ID Administrador");
        jLabel_IdAdmin.setName("lbFkAdmin"); // NOI18N

        jTextField_IDAdmin.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextField_IDAdmin.setToolTipText("");
        jTextField_IDAdmin.setName("txbFkAdmin"); // NOI18N

        jButtonCancel.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jButtonCancel.setLabel("Cancelar");
        jButtonCancel.setName("btnCancel"); // NOI18N
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonSuccess.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jButtonSuccess.setText("Cadastrar");
        jButtonSuccess.setName("btnSubmit"); // NOI18N
        jButtonSuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSuccessActionPerformed(evt);
            }
        });

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        jTextAreaDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescricao);

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jLabel6.setText("Notícias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Titulo)
                                    .addComponent(jLabel_ID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Titulo)
                                    .addComponent(jTextField_ID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel_Descricao)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_IdAdmin)
                                    .addComponent(jLabel_Data))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Data)
                                    .addComponent(jTextField_IDAdmin)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonSuccess)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonCancel)))
                        .addGap(22, 22, 22))
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID)
                    .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Titulo)
                    .addComponent(jTextField_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Descricao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Data))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_IdAdmin)
                    .addComponent(jTextField_IDAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSuccess)
                    .addComponent(jButtonCancel))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public String getOperacaoAtiva() {
        return operacaoAtiva;
    }

    public void setOperacaoAtiva(String operacaoAtiva) {
        this.operacaoAtiva = operacaoAtiva;
    }

    public String getOperacaoGlobal() {
        return operacaoGlobal;
    }

    public void setOperacaoGlobal(String operacaoGlobal) {
        this.operacaoGlobal = operacaoGlobal;
    }
    
    private void setVisibleForm(boolean visibilidade){
        jLabel_ID.setVisible(visibilidade);
        jLabel_Titulo.setVisible(visibilidade);
        jLabel_Data.setVisible(visibilidade);
        jLabel_Descricao.setVisible(visibilidade);
        jLabel_IdAdmin.setVisible(visibilidade);
        
        jTextField_ID.setVisible(visibilidade);
        jTextField_Titulo.setVisible(visibilidade);
        jTextField_Data.setVisible(visibilidade);
        jTextAreaDescricao.setVisible(visibilidade);
    }
    private void setNoticia(Noticia noticia){
        noticia.setId(Integer.parseInt(jTextField_ID.getText()));
        noticia.setTitulo(jTextField_Titulo.getText());
        noticia.setDescricao(jTextAreaDescricao.getText());
        noticia.setDataPuclicacao(jTextField_Data.getText());
        noticia.setIdAdmin(Integer.parseInt(jTextField_IDAdmin.getText()));
    }
    private void setForm(Noticia noticia){
        jTextField_ID.setText(Integer.toString(noticia.getId()));
        jTextField_Titulo.setText(noticia.getTitulo());
        jTextAreaDescricao.setText(noticia.getDescricao());
        jTextField_Data.setText(noticia.getDataPuclicacao());
        jTextField_ID.setText(Integer.toString(noticia.getIdAdmin()));
    }
    private void LimparForm(){
        jTextField_ID.setText("");
        jTextField_Titulo.setText("");
        jTextAreaDescricao.setText("");
        jTextField_Data.setText("");
        jTextField_ID.setText("");
    }
    private void PesquisarNoticia(){
        Noticia noticia;
        connectDAO con = new  connectDAO();
        
        noticia = con.pesquisaNoticia("ID = '" + jTextField_ID.getText() + "'");
        
        setForm(noticia);
        setVisibleForm(true);
    }
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSuccessActionPerformed
        setOperacaoAtiva("Inserir");   
        if(getOperacaoAtiva().equals(getOperacaoGlobal())){
            Noticia noticia = new Noticia();
            connectDAO con = new  connectDAO();
            setNoticia(noticia);
            
            con.insereRegistros("Noticias", noticia.valuesInsereNoticia() );
            
            setVisibleForm(false);
            LimparForm();
        }
        
        setOperacaoAtiva("");
        if(getOperacaoAtiva().equals(getOperacaoGlobal())){
            Noticia noticia = new Noticia();
            connectDAO con = new  connectDAO();
            
            setNoticia(noticia);
            con.alteraRegistroJFDB("Noticias", noticia.valuesAlterarNoticia(), "id='" + jTextField_ID.getText() + "'" );
            
            setVisibleForm(false);
            LimparForm();
        }
        
        setOperacaoAtiva("Alteração");
        if(getOperacaoAtiva().equals(getOperacaoGlobal())){
            PesquisarNoticia();
            jLabel_ID.setEnabled(false);
            jButtonSuccess.setText("Alterar");
            setOperacaoGlobal("Alterar");
            
        }
        
    }//GEN-LAST:event_jButtonSuccessActionPerformed

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
            java.util.logging.Logger.getLogger(FormNoticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNoticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNoticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNoticia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNoticia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSuccess;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Data;
    private javax.swing.JLabel jLabel_Descricao;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_IdAdmin;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextField_Data;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_IDAdmin;
    private javax.swing.JTextField jTextField_Titulo;
    // End of variables declaration//GEN-END:variables
}
