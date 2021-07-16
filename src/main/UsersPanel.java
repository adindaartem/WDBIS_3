/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import addPanel.AddUsersPanel;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static main.MainFrame.containerPanel;
import models.Roles;
import models.User;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Faruk
 */
public class UsersPanel extends javax.swing.JPanel {

    /**
     * Creates new form UsersPanel
     */
    public UsersPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        addUsersNvg = new javax.swing.JButton();
        changeUsersNvg = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();

        jLabel31.setText("Info");

        jLabel32.setText("Lainnya");

        addUsersNvg.setText("Tambah");
        addUsersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUsersNvgActionPerformed(evt);
            }
        });

        changeUsersNvg.setText("Ubah");
        changeUsersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUsersNvgActionPerformed(evt);
            }
        });

        jLabel30.setText("Daftar Pengguna");

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(usersTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(changeUsersNvg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUsersNvg))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel30)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addUsersNvg)
                    .addComponent(changeUsersNvg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(57, 57, 57))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUsersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUsersNvgActionPerformed
        AddUsersPanel.roleComboBox.setModel(new DefaultComboBoxModel(Roles.getRoles().toArray()));
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "addUsersCard");
    }//GEN-LAST:event_addUsersNvgActionPerformed

    private void changeUsersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeUsersNvgActionPerformed
        String id = usersTable.getModel().getValueAt(usersTable.getSelectedRow(), 0).toString();
        String nameVal = usersTable.getModel().getValueAt(usersTable.getSelectedRow(), 1).toString();
        String usernameVal = usersTable.getModel().getValueAt(usersTable.getSelectedRow(), 2).toString();
        String hashedPassword = "";

        JTextField name = new JTextField();
        JTextField username = new JTextField();
        JTextField password = new JTextField();

        name.setText(nameVal);
        username.setText(usernameVal);

        Object[] message = {
            "Nama: ", name,
            "Nama Pengguna: ", username,
            "Kata Sandi: ", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Ubah Pengguna", JOptionPane.OK_CANCEL_OPTION);

        if (!password.getText().isEmpty()) {
            hashedPassword = BCrypt.hashpw(password.getText(), BCrypt.gensalt());
        }

        if (option == 0) {
            User.update(id, name.getText(), username.getText(), hashedPassword);
            User.getAll();
        }

    }//GEN-LAST:event_changeUsersNvgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUsersNvg;
    private javax.swing.JButton changeUsersNvg;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JScrollPane jScrollPane7;
    public static javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
