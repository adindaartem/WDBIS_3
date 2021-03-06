/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import models.Material;

/**
 *
 * @author Faruk
 */
public class MaterialsPanel extends javax.swing.JPanel {

    /**
     * Creates new form MaterialsPanel
     */
    public MaterialsPanel() {
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

        jLabel27 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        materialsTable = new javax.swing.JTable();
        editMaterialNvg = new javax.swing.JButton();

        jLabel27.setText("Stok Bahan");

        jScrollPane6.setViewportView(materialsTable);

        editMaterialNvg.setText("Ubah");
        editMaterialNvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMaterialNvgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editMaterialNvg)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel27)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editMaterialNvg)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editMaterialNvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMaterialNvgActionPerformed
        String id = materialsTable.getModel().getValueAt(materialsTable.getSelectedRow(), 0).toString();
        String stockVal = materialsTable.getModel().getValueAt(materialsTable.getSelectedRow(), 2).toString();
        String unitVal = materialsTable.getModel().getValueAt(materialsTable.getSelectedRow(), 3).toString();
        String infoVal = materialsTable.getModel().getValueAt(materialsTable.getSelectedRow(), 5).toString();

        JTextField stock = new JTextField();
        JTextField unit = new JTextField();
        JTextField info = new JTextField();

        stock.setText(stockVal);
        unit.setText(unitVal);
        info.setText(infoVal);

        Object[] message = {
            "Stok", stock,
            "Unit", unit,
            "Keterangan", info
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Ubah Material", JOptionPane.OK_CANCEL_OPTION);

        Material.update(id, info.getText(), stock.getText(), unit.getText());
        Material.getAll();

    }//GEN-LAST:event_editMaterialNvgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton editMaterialNvg;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JScrollPane jScrollPane6;
    public static javax.swing.JTable materialsTable;
    // End of variables declaration//GEN-END:variables
}
