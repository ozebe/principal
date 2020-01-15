/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Usuario;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley.santos
 */
public class MainView extends javax.swing.JFrame {

    private Usuario userLogado;

    private final String CHAVE_PRINCIPAL = "db-config";
    private final String CHAVE_LOCAL_BASE = "local";
    private final String CHAVE_USUARIO = "user";
    private final String CHAVE_SENHA = "password";

    /**
     * Creates new form MainView
     */
    public MainView(Usuario u) {
        this.userLogado = u;
        initComponents();
        userLogadoLabel.setText(this.userLogado.getUsuario());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userLogadoLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        usuariosMenu = new javax.swing.JMenuItem();
        cadastros = new javax.swing.JMenu();
        pessoaFisicaCadBtn = new javax.swing.JMenuItem();
        visualizar = new javax.swing.JMenu();
        pessoaFisicaVisualizarBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        agendaBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userLogadoLabel.setText("jLabel1");

        jMenu1.setText("Controle de acesso");

        usuariosMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        usuariosMenu.setText("Usuarios");
        usuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMenuActionPerformed(evt);
            }
        });
        jMenu1.add(usuariosMenu);

        jMenuBar1.add(jMenu1);

        cadastros.setText("Cadastros");

        pessoaFisicaCadBtn.setText("Pessoa Física");
        pessoaFisicaCadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaFisicaCadBtnActionPerformed(evt);
            }
        });
        cadastros.add(pessoaFisicaCadBtn);

        jMenuBar1.add(cadastros);

        visualizar.setText("Consultas");

        pessoaFisicaVisualizarBtn.setText("Pessoas Físicas");
        pessoaFisicaVisualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pessoaFisicaVisualizarBtnActionPerformed(evt);
            }
        });
        visualizar.add(pessoaFisicaVisualizarBtn);

        jMenuBar1.add(visualizar);

        jMenu2.setText("Utilidades");

        agendaBtn.setText("Agenda");
        agendaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agendaBtnActionPerformed(evt);
            }
        });
        jMenu2.add(agendaBtn);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userLogadoLabel)
                .addContainerGap(343, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(userLogadoLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosMenuActionPerformed

        try {
            //criar usuário logado, passar como atributo e verificar para utilização.
            final UsuariosView usuarios;
            usuarios = new UsuariosView(CHAVE_PRINCIPAL, CHAVE_LOCAL_BASE, CHAVE_USUARIO, CHAVE_SENHA);
            usuarios.setLocationRelativeTo(null);
            usuarios.setVisible(true);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoClassDefFoundError ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a seguinte biblioteca\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_usuariosMenuActionPerformed

    private void pessoaFisicaCadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaFisicaCadBtnActionPerformed
        try {
            final PessoaCadastraView pessoaFisicaCad;

            pessoaFisicaCad = new PessoaCadastraView(CHAVE_PRINCIPAL, CHAVE_LOCAL_BASE, CHAVE_USUARIO, CHAVE_SENHA);

            pessoaFisicaCad.setLocationRelativeTo(null);
            pessoaFisicaCad.setVisible(true);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
            Logger
                    .getLogger(MainView.class
                            .getName()).log(Level.SEVERE, null, ex);
        } catch (NoClassDefFoundError ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a seguinte biblioteca\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_pessoaFisicaCadBtnActionPerformed

    private void agendaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agendaBtnActionPerformed
        final AgendaView agenda;
        try {
            //criar usuário logado, passar como atributo e verificar para utilização.
            agenda = new AgendaView(CHAVE_PRINCIPAL, CHAVE_LOCAL_BASE, CHAVE_USUARIO, CHAVE_SENHA, this.userLogado);
            agenda.setVisible(true);

        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(MainView.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (NoClassDefFoundError ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a seguinte biblioteca\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agendaBtnActionPerformed

    private void pessoaFisicaVisualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pessoaFisicaVisualizarBtnActionPerformed
        final PessoasView viewPessoas;
        try {
            viewPessoas = new PessoasView(CHAVE_PRINCIPAL, CHAVE_LOCAL_BASE, CHAVE_USUARIO, CHAVE_SENHA);
            viewPessoas.setVisible(true);
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível encontrar a seguinte biblioteca\n" + ex, "Erro", JOptionPane.ERROR_MESSAGE);

            Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_pessoaFisicaVisualizarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainView().setVisible(true);
//            }
//        });
//    }
    public void setUserLogado(Usuario userLogado) {
        this.userLogado = userLogado;
    }

    public Usuario getUserLogado() {
        return userLogado;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agendaBtn;
    private javax.swing.JMenu cadastros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem pessoaFisicaCadBtn;
    private javax.swing.JMenuItem pessoaFisicaVisualizarBtn;
    private javax.swing.JLabel userLogadoLabel;
    private javax.swing.JMenuItem usuariosMenu;
    private javax.swing.JMenu visualizar;
    // End of variables declaration//GEN-END:variables
}
