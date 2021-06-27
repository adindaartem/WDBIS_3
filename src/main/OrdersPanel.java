/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import models.Order;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Faruk
 */
public class OrdersPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderPanel
     */
    public OrdersPanel() {
        initComponents();
//        ordersTable.setRowSelectionInterval(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addOrdersNvg = new javax.swing.JButton();
        editOrdersNvg = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        printButton = new javax.swing.JButton();

        addOrdersNvg.setText("Tambah");
        addOrdersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrdersNvgActionPerformed(evt);
            }
        });

        editOrdersNvg.setText("Ubah");
        editOrdersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrdersNvgActionPerformed(evt);
            }
        });

        deleteButton.setText("Hapus");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel19.setText("Info");

        jLabel20.setText("Lainnya");

        jLabel21.setText("TOTAL PESANAN");

        jLabel22.setText("12/04/2021");

        jLabel1.setText("Daftar Pesanan Pupuk");

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(ordersTable);

        printButton.setText("Print");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editOrdersNvg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addOrdersNvg))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(86, 86, 86)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel21)
                                .addComponent(jLabel22)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrdersNvg)
                    .addComponent(editOrdersNvg)
                    .addComponent(deleteButton)
                    .addComponent(printButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)))
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addOrdersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrdersNvgActionPerformed
        CardLayout cl = (CardLayout) (MainFrame.containerPanel.getLayout());
        cl.show(MainFrame.containerPanel, "addOrdersCard");
    }//GEN-LAST:event_addOrdersNvgActionPerformed

    private void editOrdersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrdersNvgActionPerformed
        String id = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 0).toString();
        String dateVal = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 2).toString();
        String nameVal = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 3).toString();
        String contactVal = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 4).toString();
        String weightVal = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 5).toString();
        
        
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy-MM-dd");
        JTextField name = new JTextField();
        JTextField weight = new JTextField();
        JTextField contact = new JTextField();
        DatePicker datePick = new DatePicker(dateSettings);
        
        name.setText(nameVal);
        datePick.setText(dateVal);
        contact.setText(contactVal);
        weight.setText(weightVal);
        
        Object[] message = {
            "Nama", name,
            "Kontak", contact,
            "Berat (kg)", weight,
            "Tanggal", datePick
        };
        
        int option = JOptionPane.showConfirmDialog(null, message, "Ubah Pesanan", JOptionPane.OK_CANCEL_OPTION);
        
        Order.update(id, name.getText(), datePick.getText(), contact.getText(), weight.getText());
        Order.getAll();
    }//GEN-LAST:event_editOrdersNvgActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String id = ordersTable.getModel().getValueAt(ordersTable.getSelectedRow(), 0).toString();
        Order.delete(id);
        Order.getAll();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        Order.print();
    }//GEN-LAST:event_printButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrdersNvg;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editOrdersNvg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable ordersTable;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
}
