package main;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Faruk
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        menuPanel = new javax.swing.JPanel();
        productionsButton = new javax.swing.JButton();
        suppliersButton = new javax.swing.JButton();
        stockButton = new javax.swing.JButton();
        ordersButton = new javax.swing.JButton();
        materialsButton = new javax.swing.JButton();
        salesButton = new javax.swing.JButton();
        containerPanel = new javax.swing.JPanel();
        productions = new javax.swing.JPanel();
        productionsPanel = new main.ProductionsPanel();
        suppliers = new javax.swing.JPanel();
        suppliersPanel = new main.SuppliersPanel();
        stock = new javax.swing.JPanel();
        stockPanel = new main.StockPanel();
        orders = new javax.swing.JPanel();
        orderPanel = new main.OrdersPanel();
        sales = new javax.swing.JPanel();
        salesPanel = new main.SalesPanel();
        materials = new javax.swing.JPanel();
        materialsPanel = new main.MaterialsPanel();
        addSuppliers = new javax.swing.JPanel();
        addSupliersPanel = new main.AddSupliersPanel();
        addOrders = new javax.swing.JPanel();
        addOrdersPanel = new main.AddOrdersPanel();
        addSales = new javax.swing.JPanel();
        addSalesPanel = new main.AddSalesPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productionsButton.setText("Pembuatan Pupuk");
        productionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productionsButtonActionPerformed(evt);
            }
        });

        suppliersButton.setText("Pemasok");
        suppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersButtonActionPerformed(evt);
            }
        });

        stockButton.setText("Stok Pupuk");
        stockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockButtonActionPerformed(evt);
            }
        });

        ordersButton.setText("Pemesanan Pupuk");
        ordersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersButtonActionPerformed(evt);
            }
        });

        materialsButton.setText("Stok Bahan");
        materialsButton.setPreferredSize(new java.awt.Dimension(125, 22));
        materialsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialsButtonActionPerformed(evt);
            }
        });

        salesButton.setText("Penjualan Pupuk");
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(productionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addComponent(ordersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(suppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(stockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(materialsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(salesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(productionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(suppliersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(stockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ordersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(materialsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(salesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 214, Short.MAX_VALUE))
        );

        containerPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout productionsLayout = new javax.swing.GroupLayout(productions);
        productions.setLayout(productionsLayout);
        productionsLayout.setHorizontalGroup(
            productionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        productionsLayout.setVerticalGroup(
            productionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productionsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.add(productions, "productionsCard");

        javax.swing.GroupLayout suppliersLayout = new javax.swing.GroupLayout(suppliers);
        suppliers.setLayout(suppliersLayout);
        suppliersLayout.setHorizontalGroup(
            suppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(suppliersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        suppliersLayout.setVerticalGroup(
            suppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suppliersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(suppliersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        containerPanel.add(suppliers, "suppliersCard");

        javax.swing.GroupLayout stockLayout = new javax.swing.GroupLayout(stock);
        stock.setLayout(stockLayout);
        stockLayout.setHorizontalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(stockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        stockLayout.setVerticalGroup(
            stockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stockLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(stockPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        containerPanel.add(stock, "stockCard");

        javax.swing.GroupLayout ordersLayout = new javax.swing.GroupLayout(orders);
        orders.setLayout(ordersLayout);
        ordersLayout.setHorizontalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        ordersLayout.setVerticalGroup(
            ordersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ordersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(orderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(orders, "ordersCard");

        javax.swing.GroupLayout salesLayout = new javax.swing.GroupLayout(sales);
        sales.setLayout(salesLayout);
        salesLayout.setHorizontalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        salesLayout.setVerticalGroup(
            salesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(sales, "salesCard");

        javax.swing.GroupLayout materialsLayout = new javax.swing.GroupLayout(materials);
        materials.setLayout(materialsLayout);
        materialsLayout.setHorizontalGroup(
            materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(materialsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(materialsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        materialsLayout.setVerticalGroup(
            materialsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, materialsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(materialsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(materials, "materialsCard");

        javax.swing.GroupLayout addSuppliersLayout = new javax.swing.GroupLayout(addSuppliers);
        addSuppliers.setLayout(addSuppliersLayout);
        addSuppliersLayout.setHorizontalGroup(
            addSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSuppliersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addSupliersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        addSuppliersLayout.setVerticalGroup(
            addSuppliersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSuppliersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addSupliersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(addSuppliers, "addSupliersCard");

        javax.swing.GroupLayout addOrdersLayout = new javax.swing.GroupLayout(addOrders);
        addOrders.setLayout(addOrdersLayout);
        addOrdersLayout.setHorizontalGroup(
            addOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOrdersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addOrdersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        addOrdersLayout.setVerticalGroup(
            addOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addOrdersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addOrdersPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        containerPanel.add(addOrders, "addOrdersCard");

        javax.swing.GroupLayout addSalesLayout = new javax.swing.GroupLayout(addSales);
        addSales.setLayout(addSalesLayout);
        addSalesLayout.setHorizontalGroup(
            addSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSalesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        addSalesLayout.setVerticalGroup(
            addSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addSalesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(addSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        containerPanel.add(addSales, "addSalesCard");

        jMenu1.setText("About");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productionsButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "productionsCard");
    }//GEN-LAST:event_productionsButtonActionPerformed

    private void suppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "suppliersCard");
    }//GEN-LAST:event_suppliersButtonActionPerformed

    private void stockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "stockCard");
    }//GEN-LAST:event_stockButtonActionPerformed

    private void ordersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "ordersCard");
    }//GEN-LAST:event_ordersButtonActionPerformed

    private void materialsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialsButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "materialsCard");
    }//GEN-LAST:event_materialsButtonActionPerformed

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
        CardLayout cl = (CardLayout) (containerPanel.getLayout());
        cl.show(containerPanel, "salesCard");
    }//GEN-LAST:event_salesButtonActionPerformed

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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
           
        } 
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JDialog.setDefaultLookAndFeelDecorated(true);
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addOrders;
    private main.AddOrdersPanel addOrdersPanel;
    private javax.swing.JPanel addSales;
    private main.AddSalesPanel addSalesPanel;
    private main.AddSupliersPanel addSupliersPanel;
    private javax.swing.JPanel addSuppliers;
    public static javax.swing.JPanel containerPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel materials;
    private javax.swing.JButton materialsButton;
    private main.MaterialsPanel materialsPanel;
    private javax.swing.JPanel menuPanel;
    private main.OrdersPanel orderPanel;
    private javax.swing.JPanel orders;
    private javax.swing.JButton ordersButton;
    private javax.swing.JPanel productions;
    private javax.swing.JButton productionsButton;
    private main.ProductionsPanel productionsPanel;
    private javax.swing.JPanel sales;
    private javax.swing.JButton salesButton;
    private main.SalesPanel salesPanel;
    private javax.swing.JPanel stock;
    private javax.swing.JButton stockButton;
    private main.StockPanel stockPanel;
    private javax.swing.JPanel suppliers;
    private javax.swing.JButton suppliersButton;
    private main.SuppliersPanel suppliersPanel;
    // End of variables declaration//GEN-END:variables
}
