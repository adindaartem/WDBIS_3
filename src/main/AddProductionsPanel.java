/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import static main.MainFrame.containerPanel;
import models.Material;
import models.Production;

/**
 *
 * @author Faruk
 */
public class AddProductionsPanel extends javax.swing.JPanel {

    private int bekatul;
    private int arangSekam;
    private int kohe;
    private int obatPengurai;
    private int total;

    public static int bekatulStockVal;
    public static int arangStockVal;
    public static int koheStockVal;
    public static int obatStockVal;

    private final DatePickerSettings dateSettings1 = new DatePickerSettings();
    private final DatePickerSettings dateSettings2 = new DatePickerSettings();

    /**
     * Creates new form AddProductionPanel
     */
    public AddProductionsPanel() {
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        initComponents();
        checkItems();
    }

    private void checkItems() {
        int production = Integer.parseInt(productionTotalSpin.getValue().toString());

        bekatul = (production / 100) * 330;
        arangSekam = (int) Math.round((production / 100) * 37.5);
        kohe = (int) Math.round((production / 100) * 37.5);
        obatPengurai = production / 100;

        bekatulLabel.setText(bekatul + " Karung");
        arangLabel.setText(arangSekam + " Karung");
        koheLabel.setText(kohe + " Karung");
        obatLabel.setText(obatPengurai + " Botol");

    }

    private void calculateCost() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datePickerStart = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel3 = new javax.swing.JLabel();
        datePickerEnd = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jLabel4 = new javax.swing.JLabel();
        productionTotalSpin = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        bekatulLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        koheLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        arangLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        obatLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        bekatulStock = new javax.swing.JLabel();
        koheStock = new javax.swing.JLabel();
        arangStock = new javax.swing.JLabel();
        obatStock = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bekatulSpinner = new javax.swing.JSpinner();
        koheSpinner = new javax.swing.JSpinner();
        arangSpinner = new javax.swing.JSpinner();
        obatSpinner = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        supplierBox1 = new javax.swing.JComboBox<>();
        supplierBox2 = new javax.swing.JComboBox<>();
        supplierBox3 = new javax.swing.JComboBox<>();
        supplierBox4 = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        bekatulCost = new javax.swing.JTextField();
        koheCost = new javax.swing.JTextField();
        arangCost = new javax.swing.JTextField();
        obatCost = new javax.swing.JTextField();
        pekerjaSpinner = new javax.swing.JSpinner();
        cancelButton = new javax.swing.JButton();
        addProductionButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pekerjaCost = new javax.swing.JTextField();

        jLabel1.setText("Tambah Produksi Pupuk");

        jLabel2.setText("Tgl Mulai");

        jLabel3.setText("Tgl Selesai");

        jLabel4.setText("Target Produksi");

        productionTotalSpin.setModel(new javax.swing.SpinnerNumberModel(100, 100, 1000, 100));
        productionTotalSpin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                productionTotalSpinStateChanged(evt);
            }
        });

        jLabel5.setText("Karung (33kg)");

        jLabel6.setText("Bekatul");

        bekatulLabel.setText("30 Karung");

        jLabel8.setText("Kohe");

        koheLabel.setText("50 Karung");

        jLabel10.setText("Arang Sekam");

        arangLabel.setText("50 Karung");

        jLabel12.setText("Obat Pengurai");

        obatLabel.setText("4 Botol");

        jLabel14.setText("Pekerja");

        jLabel15.setText("Stok");

        jLabel16.setText("Stok");

        jLabel17.setText("Stok");

        jLabel18.setText("Stok");

        bekatulStock.setText("1");

        koheStock.setText("4");

        arangStock.setText("20");

        obatStock.setText("1");

        jLabel23.setText("Beli (kg)");

        jLabel24.setText("Beli (Karung)");

        jLabel25.setText("Beli (Karung)");

        jLabel26.setText("Beli (Botol)");

        bekatulSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bekatulSpinnerStateChanged(evt);
            }
        });

        koheSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                koheSpinnerStateChanged(evt);
            }
        });

        arangSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                arangSpinnerStateChanged(evt);
            }
        });

        obatSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                obatSpinnerStateChanged(evt);
            }
        });

        jLabel27.setText("Pemasok");

        jLabel28.setText("Pemasok");

        jLabel29.setText("Pemasok");

        jLabel30.setText("Pemasok");

        jLabel31.setText("Biaya");

        jLabel32.setText("Biaya");

        jLabel33.setText("Biaya");

        jLabel34.setText("Biaya");

        bekatulCost.setText("0");

        koheCost.setText("0");

        arangCost.setText("0");

        obatCost.setText("0");

        cancelButton.setText("Batal");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addProductionButton.setText("Tambah");
        addProductionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductionButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Karung");

        jLabel9.setText("Karung");

        jLabel11.setText("Karung");

        jLabel13.setText("Botol");

        jLabel19.setText("Biaya");

        pekerjaCost.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(datePickerStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datePickerEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(productionTotalSpin, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(koheLabel)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel12)
                                    .addComponent(bekatulLabel)
                                    .addComponent(arangLabel)
                                    .addComponent(obatLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pekerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(pekerjaCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(addProductionButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancelButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bekatulStock)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(obatStock)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(koheStock)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(arangStock)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11)))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel23)
                                            .addComponent(bekatulSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(koheSpinner)
                                            .addComponent(arangSpinner)
                                            .addComponent(obatSpinner))
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel30)
                                            .addComponent(supplierBox1, 0, 87, Short.MAX_VALUE)
                                            .addComponent(supplierBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(supplierBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(supplierBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bekatulCost, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                            .addComponent(koheCost)
                                            .addComponent(arangCost)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel31)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel33)
                                                    .addComponent(jLabel34))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(obatCost))))))
                        .addGap(50, 50, 50)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePickerEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productionTotalSpin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23)
                    .addComponent(jLabel27)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bekatulLabel)
                    .addComponent(bekatulStock)
                    .addComponent(bekatulSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bekatulCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel16)
                    .addComponent(jLabel24)
                    .addComponent(jLabel28)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(koheLabel)
                    .addComponent(koheStock)
                    .addComponent(koheSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koheCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel17)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arangLabel)
                    .addComponent(arangStock)
                    .addComponent(arangSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arangCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel18)
                    .addComponent(jLabel26)
                    .addComponent(jLabel30)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(obatLabel)
                    .addComponent(obatStock)
                    .addComponent(obatSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supplierBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(obatCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pekerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton)
                    .addComponent(addProductionButton)
                    .addComponent(pekerjaCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "productionsCard");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void productionTotalSpinStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_productionTotalSpinStateChanged
        checkItems();
    }//GEN-LAST:event_productionTotalSpinStateChanged

    private void bekatulSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bekatulSpinnerStateChanged
        int val = bekatulStockVal + Integer.valueOf(bekatulSpinner.getValue().toString());
        bekatulStock.setText(String.valueOf(val));
    }//GEN-LAST:event_bekatulSpinnerStateChanged

    private void koheSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_koheSpinnerStateChanged
        int val = koheStockVal + Integer.valueOf(koheSpinner.getValue().toString());
        koheStock.setText(String.valueOf(val));
    }//GEN-LAST:event_koheSpinnerStateChanged

    private void arangSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_arangSpinnerStateChanged
        int val = arangStockVal + Integer.valueOf(arangSpinner.getValue().toString());
        arangStock.setText(String.valueOf(val));
    }//GEN-LAST:event_arangSpinnerStateChanged

    private void obatSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_obatSpinnerStateChanged
        int val = obatStockVal + Integer.valueOf(obatSpinner.getValue().toString());
        obatStock.setText(String.valueOf(val));
    }//GEN-LAST:event_obatSpinnerStateChanged

    private void addProductionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductionButtonActionPerformed
        int bekatulFee = Integer.valueOf(bekatulCost.getText());
        int obatFee = Integer.valueOf(obatCost.getText());
        int koheFee = Integer.valueOf(koheCost.getText());
        int arangFee = Integer.valueOf(arangCost.getText());
        int pekerjaFee = Integer.valueOf(pekerjaCost.getText());

        total = bekatulFee + obatFee + koheFee + arangFee + pekerjaFee;
        int target = Integer.valueOf(productionTotalSpin.getValue().toString());

        int arangAmount = Integer.valueOf(arangSpinner.getValue().toString());
        int koheAmount = Integer.valueOf(koheSpinner.getValue().toString());
        int bekatulAmount = Integer.valueOf(bekatulSpinner.getValue().toString());
        int obatAmount = Integer.valueOf(obatSpinner.getValue().toString());
        int pekerjaAmount = Integer.valueOf(pekerjaSpinner.getValue().toString());

        String arangSupplier = supplierBox1.getSelectedItem().toString().split("[)]")[0];
        String koheSupplier = supplierBox2.getSelectedItem().toString().split("[)]")[0];
        String bekatulSupplier = supplierBox3.getSelectedItem().toString().split("[)]")[0];
        String obatSupplier = supplierBox4.getSelectedItem().toString().split("[)]")[0];

        String dateStart = datePickerStart.getText();
        String dateEnd = datePickerEnd.getText();

        if (!checkStock()) {
            JOptionPane.showMessageDialog(this, "Stok bahan tidak memenuhi persyaratan atau pekerja belum diisi");
        } else {
            int id = Production.create(dateStart, dateEnd, String.valueOf(total), String.valueOf(target));

            if (arangAmount > 0) {
                int leftover = Integer.valueOf(arangStock.getText()) - arangSekam;
                Production.createPurchases(id, 2, Integer.valueOf(arangSupplier), arangAmount, arangFee);
                Material.updateStock(2, leftover);
            }
            if (koheAmount > 0) {
                int leftover = Integer.valueOf(koheStock.getText()) - kohe;
                Production.createPurchases(id, 1, Integer.valueOf(koheSupplier), koheAmount, koheFee);
                Material.updateStock(1, leftover);
            }
            if (bekatulAmount > 0) {
                int leftover = Integer.valueOf(bekatulStock.getText()) - bekatul;
                Production.createPurchases(id, 5, Integer.valueOf(bekatulSupplier), bekatulAmount, bekatulFee);
                Material.updateStock(5, leftover);
            }
            
            if (obatAmount > 0) {
                int leftover = Integer.valueOf(obatStock.getText()) - obatPengurai;
                Production.createPurchases(id, 3, Integer.valueOf(obatSupplier), obatAmount, obatFee);
                Material.updateStock(3, leftover);
            }
        }
        
        
    }//GEN-LAST:event_addProductionButtonActionPerformed

    private boolean checkStock() {
        boolean isEnough = true;
        if (Integer.valueOf(arangStock.getText()) < arangSekam) {
            isEnough = false;
        } else if (Integer.valueOf(bekatulStock.getText()) < bekatul) {
            isEnough = false;
        } else if (Integer.valueOf(obatStock.getText()) < obatPengurai) {
            isEnough = false;
        } else if (Integer.valueOf(koheStock.getText()) < kohe) {
            isEnough = false;
        } else if (Integer.valueOf(pekerjaSpinner.getValue().toString()) == 0) {
            isEnough = false;
        }
        return isEnough;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductionButton;
    private javax.swing.JTextField arangCost;
    private javax.swing.JLabel arangLabel;
    private javax.swing.JSpinner arangSpinner;
    public static javax.swing.JLabel arangStock;
    private javax.swing.JTextField bekatulCost;
    private javax.swing.JLabel bekatulLabel;
    private javax.swing.JSpinner bekatulSpinner;
    public static javax.swing.JLabel bekatulStock;
    private javax.swing.JButton cancelButton;
    private com.github.lgooddatepicker.components.DatePicker datePickerEnd;
    private com.github.lgooddatepicker.components.DatePicker datePickerStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField koheCost;
    private javax.swing.JLabel koheLabel;
    private javax.swing.JSpinner koheSpinner;
    public static javax.swing.JLabel koheStock;
    private javax.swing.JTextField obatCost;
    private javax.swing.JLabel obatLabel;
    private javax.swing.JSpinner obatSpinner;
    public static javax.swing.JLabel obatStock;
    private javax.swing.JTextField pekerjaCost;
    private javax.swing.JSpinner pekerjaSpinner;
    private javax.swing.JSpinner productionTotalSpin;
    public static javax.swing.JComboBox<String> supplierBox1;
    public static javax.swing.JComboBox<String> supplierBox2;
    public static javax.swing.JComboBox<String> supplierBox3;
    public static javax.swing.JComboBox<String> supplierBox4;
    // End of variables declaration//GEN-END:variables
}