/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Faruk
 */
public class SuppliersPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplierPanel
     */
    public SuppliersPanel() {
        initComponents();
        Supplier.getAll(SuppliersPanel.suppliersTable);
        SuppliersPanel.suppliersTable.setRowSelectionInterval(0, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        suppliersPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        suppliersTable = new javax.swing.JTable();
        addSupliersNvg = new javax.swing.JButton();
        editSupliersNvg = new javax.swing.JButton();
        deleteSupplierButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel4.setText("Daftar Penyedia Bahan");

        suppliersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(suppliersTable);

        addSupliersNvg.setText("Tambah");
        addSupliersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupliersNvgActionPerformed(evt);
            }
        });

        editSupliersNvg.setText("Ubah");
        editSupliersNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSupliersNvgActionPerformed(evt);
            }
        });

        deleteSupplierButton.setText("Hapus");
        deleteSupplierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSupplierButtonActionPerformed(evt);
            }
        });

        jLabel12.setText("Info");

        jLabel13.setText("Lainnya");

        jLabel17.setText("TOTAL PENYEDIA");

        jLabel18.setText("12");

        javax.swing.GroupLayout suppliersPanelLayout = new javax.swing.GroupLayout(suppliersPanel);
        suppliersPanel.setLayout(suppliersPanelLayout);
        suppliersPanelLayout.setHorizontalGroup(
            suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(suppliersPanelLayout.createSequentialGroup()
                            .addComponent(deleteSupplierButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(editSupliersNvg)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addSupliersNvg))
                        .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(suppliersPanelLayout.createSequentialGroup()
                        .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        suppliersPanelLayout.setVerticalGroup(
            suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addSupliersNvg)
                    .addComponent(editSupliersNvg)
                    .addComponent(deleteSupplierButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(suppliersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18))
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(suppliersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(suppliersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSupliersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupliersNvgActionPerformed
//        CardLayout cl = (CardLayout) (containerPanel.getLayout());
//        cl.show(this., "addSupliersCard");
    }//GEN-LAST:event_addSupliersNvgActionPerformed

    private void editSupliersNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSupliersNvgActionPerformed
        String id = suppliersTable.getModel().getValueAt(suppliersTable.getSelectedRow(), 0).toString();
        String nameVal = suppliersTable.getModel().getValueAt(suppliersTable.getSelectedRow(), 1).toString();
        String addressVal = suppliersTable.getModel().getValueAt(suppliersTable.getSelectedRow(), 2).toString();
        String contactVal = suppliersTable.getModel().getValueAt(suppliersTable.getSelectedRow(), 3).toString();

        JTextField name = new JTextField(); 
        JTextField address = new JTextField();
        JTextField contact = new JTextField();

        name.setText(nameVal);
        address.setText(addressVal);
        contact.setText(contactVal);

        Object[] message = {
            "Nama: ", name,
            "Alamat: ", address,
            "Kontak:", contact
        };
        int option = JOptionPane.showConfirmDialog(null, message, "Ubah Pemasok", JOptionPane.OK_CANCEL_OPTION);

        if (option == 0) {
            Supplier.update(id, name.getText(), address.getText(), contact.getText());
        }

        Supplier.getAll(suppliersTable);
    }//GEN-LAST:event_editSupliersNvgActionPerformed

    private void deleteSupplierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSupplierButtonActionPerformed
        String id = suppliersTable.getModel().getValueAt(suppliersTable.getSelectedRow(), 0).toString();
        Supplier.delete(id);
        Supplier.getAll(suppliersTable);
    }//GEN-LAST:event_deleteSupplierButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSupliersNvg;
    private javax.swing.JButton deleteSupplierButton;
    private javax.swing.JButton editSupliersNvg;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel suppliersPanel;
    public static javax.swing.JTable suppliersTable;
    // End of variables declaration//GEN-END:variables
}
