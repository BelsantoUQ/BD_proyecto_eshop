/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

/**
 *
 * @author EQUIPO
 */
public class Menu_FRM extends javax.swing.JFrame {

    /**
     * Creates new form Menu_FRM
     */
    public Menu_FRM() {
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

        buttonAction1 = new org.edisoncor.gui.button.ButtonAction();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        labelTask1 = new org.edisoncor.gui.label.LabelTask();
        labelCustom2 = new org.edisoncor.gui.label.LabelCustom();
        labelRound1 = new org.edisoncor.gui.label.LabelRound();
        labelRect1 = new org.edisoncor.gui.label.LabelRect();
        labelTask2 = new org.edisoncor.gui.label.LabelTask();
        clockDigital1 = new org.edisoncor.gui.varios.ClockDigital();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();
        textField1 = new org.edisoncor.gui.textField.TextField();
        textFieldRectIcon1 = new org.edisoncor.gui.textField.TextFieldRectIcon();
        textFieldRectImage1 = new org.edisoncor.gui.textField.TextFieldRectImage();
        titleBar1 = new org.edisoncor.gui.varios.TitleBar();
        titleBar3 = new org.edisoncor.gui.varios.TitleBar();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelRectTranslucidoComplete1 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        bt_misCompras = new org.edisoncor.gui.button.ButtonRound();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        bt_rastrearPedido = new org.edisoncor.gui.button.ButtonRound();
        panelRectTranslucidoComplete2 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        bt_missubastas = new org.edisoncor.gui.button.ButtonRound();
        labelMetric2 = new org.edisoncor.gui.label.LabelMetric();
        bt_misParticipaciones = new org.edisoncor.gui.button.ButtonRound();
        panelRectTranslucidoComplete3 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        labelMetric3 = new org.edisoncor.gui.label.LabelMetric();
        bt_historialCanjes = new org.edisoncor.gui.button.ButtonRound();
        bt_productoCanje = new org.edisoncor.gui.button.ButtonRound();
        panelRectTranslucidoComplete4 = new org.edisoncor.gui.panel.PanelRectTranslucidoComplete();
        bt_misVentas = new org.edisoncor.gui.button.ButtonRound();
        labelMetric4 = new org.edisoncor.gui.label.LabelMetric();
        labelCustom1 = new org.edisoncor.gui.label.LabelCustom();
        labelMetric5 = new org.edisoncor.gui.label.LabelMetric();
        clockDigital2 = new org.edisoncor.gui.varios.ClockDigital();
        titleBar2 = new org.edisoncor.gui.varios.TitleBar();
        labelMetric6 = new org.edisoncor.gui.label.LabelMetric();

        buttonAction1.setText("buttonAction1");

        labelCustom2.setText("labelCustom2");

        labelRound1.setText("labelRound1");

        labelRect1.setText("labelRect1");

        textField1.setText("textField1");

        textFieldRectIcon1.setText("textFieldRectIcon1");

        textFieldRectImage1.setText("textFieldRectImage1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setForeground(new java.awt.Color(204, 255, 204));
        panel1.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2022-05-11 at 11.46.16 PM.jpeg"))); // NOI18N

        panelRectTranslucidoComplete1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        panelRectTranslucidoComplete1.setForeground(new java.awt.Color(204, 255, 204));

        bt_misCompras.setForeground(new java.awt.Color(0, 0, 0));
        bt_misCompras.setText("Mis Compras");
        bt_misCompras.setColorDeSombra(new java.awt.Color(153, 153, 153));

        labelMetric1.setText("Compras");

        bt_rastrearPedido.setForeground(new java.awt.Color(0, 0, 0));
        bt_rastrearPedido.setText("Rastrear Pedido");
        bt_rastrearPedido.setColorDeSombra(new java.awt.Color(153, 153, 153));
        bt_rastrearPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rastrearPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucidoComplete1Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete1);
        panelRectTranslucidoComplete1.setLayout(panelRectTranslucidoComplete1Layout);
        panelRectTranslucidoComplete1Layout.setHorizontalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bt_misCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_rastrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        panelRectTranslucidoComplete1Layout.setVerticalGroup(
            panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete1Layout.createSequentialGroup()
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucidoComplete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_misCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_rastrearPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelRectTranslucidoComplete2.setBackground(new java.awt.Color(204, 255, 204));
        panelRectTranslucidoComplete2.setForeground(new java.awt.Color(204, 255, 204));

        bt_missubastas.setForeground(new java.awt.Color(0, 0, 0));
        bt_missubastas.setText("Mis Subastas");
        bt_missubastas.setColorDeSombra(new java.awt.Color(153, 153, 153));

        labelMetric2.setText("Subastas");

        bt_misParticipaciones.setForeground(new java.awt.Color(0, 0, 0));
        bt_misParticipaciones.setText("Mis Participaciones");
        bt_misParticipaciones.setBorderPainted(true);
        bt_misParticipaciones.setColorDeSombra(new java.awt.Color(102, 102, 102));
        bt_misParticipaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_misParticipacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRectTranslucidoComplete2Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete2);
        panelRectTranslucidoComplete2.setLayout(panelRectTranslucidoComplete2Layout);
        panelRectTranslucidoComplete2Layout.setHorizontalGroup(
            panelRectTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(bt_missubastas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_misParticipaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRectTranslucidoComplete2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );
        panelRectTranslucidoComplete2Layout.setVerticalGroup(
            panelRectTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelRectTranslucidoComplete2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_missubastas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_misParticipaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panelRectTranslucidoComplete3.setBackground(new java.awt.Color(204, 255, 204));

        labelMetric3.setText("Canjes");

        bt_historialCanjes.setForeground(new java.awt.Color(0, 0, 0));
        bt_historialCanjes.setText("Historial de Canjes");
        bt_historialCanjes.setColorDeSombra(new java.awt.Color(153, 153, 153));

        bt_productoCanje.setForeground(new java.awt.Color(0, 0, 0));
        bt_productoCanje.setText("Producto en Canje");
        bt_productoCanje.setColorDeSombra(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout panelRectTranslucidoComplete3Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete3);
        panelRectTranslucidoComplete3.setLayout(panelRectTranslucidoComplete3Layout);
        panelRectTranslucidoComplete3Layout.setHorizontalGroup(
            panelRectTranslucidoComplete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete3Layout.createSequentialGroup()
                .addGroup(panelRectTranslucidoComplete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucidoComplete3Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucidoComplete3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(bt_historialCanjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_productoCanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panelRectTranslucidoComplete3Layout.setVerticalGroup(
            panelRectTranslucidoComplete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelMetric3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelRectTranslucidoComplete3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_historialCanjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_productoCanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelRectTranslucidoComplete4.setBackground(new java.awt.Color(204, 255, 204));
        panelRectTranslucidoComplete4.setForeground(new java.awt.Color(204, 255, 204));

        bt_misVentas.setForeground(new java.awt.Color(0, 0, 0));
        bt_misVentas.setText("Mis Ventas");
        bt_misVentas.setColorDeSombra(new java.awt.Color(153, 153, 153));
        bt_misVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_misVentasActionPerformed(evt);
            }
        });

        labelMetric4.setText("Ventas");

        javax.swing.GroupLayout panelRectTranslucidoComplete4Layout = new javax.swing.GroupLayout(panelRectTranslucidoComplete4);
        panelRectTranslucidoComplete4.setLayout(panelRectTranslucidoComplete4Layout);
        panelRectTranslucidoComplete4Layout.setHorizontalGroup(
            panelRectTranslucidoComplete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete4Layout.createSequentialGroup()
                .addGroup(panelRectTranslucidoComplete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRectTranslucidoComplete4Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRectTranslucidoComplete4Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(bt_misVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRectTranslucidoComplete4Layout.setVerticalGroup(
            panelRectTranslucidoComplete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRectTranslucidoComplete4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelMetric4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_misVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        labelCustom1.setBackground(new java.awt.Color(32, 39, 55));
        labelCustom1.setText("USUARIO");

        labelMetric5.setText("Bienvenid@:");
        labelMetric5.setColorDeSombra(new java.awt.Color(51, 51, 51));

        clockDigital2.setForeground(new java.awt.Color(255, 255, 255));

        labelMetric6.setText("e-Shop");
        labelMetric6.setColorDeSombra(new java.awt.Color(102, 102, 102));
        labelMetric6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRectTranslucidoComplete1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRectTranslucidoComplete3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelRectTranslucidoComplete4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(titleBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clockDigital2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addComponent(clockDigital2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(titleBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelMetric6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMetric5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelRectTranslucidoComplete1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucidoComplete2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucidoComplete3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRectTranslucidoComplete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_misVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_misVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_misVentasActionPerformed

    private void bt_misParticipacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_misParticipacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_misParticipacionesActionPerformed

    private void bt_rastrearPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rastrearPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_rastrearPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_FRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonRound bt_historialCanjes;
    private org.edisoncor.gui.button.ButtonRound bt_misCompras;
    private org.edisoncor.gui.button.ButtonRound bt_misParticipaciones;
    private org.edisoncor.gui.button.ButtonRound bt_misVentas;
    private org.edisoncor.gui.button.ButtonRound bt_missubastas;
    private org.edisoncor.gui.button.ButtonRound bt_productoCanje;
    private org.edisoncor.gui.button.ButtonRound bt_rastrearPedido;
    private org.edisoncor.gui.button.ButtonAction buttonAction1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital1;
    private org.edisoncor.gui.varios.ClockDigital clockDigital2;
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private org.edisoncor.gui.label.LabelCustom labelCustom1;
    private org.edisoncor.gui.label.LabelCustom labelCustom2;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.label.LabelMetric labelMetric2;
    private org.edisoncor.gui.label.LabelMetric labelMetric3;
    private org.edisoncor.gui.label.LabelMetric labelMetric4;
    private org.edisoncor.gui.label.LabelMetric labelMetric5;
    private org.edisoncor.gui.label.LabelMetric labelMetric6;
    private org.edisoncor.gui.label.LabelRect labelRect1;
    private org.edisoncor.gui.label.LabelRound labelRound1;
    private org.edisoncor.gui.label.LabelTask labelTask1;
    private org.edisoncor.gui.label.LabelTask labelTask2;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete1;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete2;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete3;
    private org.edisoncor.gui.panel.PanelRectTranslucidoComplete panelRectTranslucidoComplete4;
    private org.edisoncor.gui.textField.TextField textField1;
    private org.edisoncor.gui.textField.TextFieldRectIcon textFieldRectIcon1;
    private org.edisoncor.gui.textField.TextFieldRectImage textFieldRectImage1;
    private org.edisoncor.gui.varios.TitleBar titleBar1;
    private org.edisoncor.gui.varios.TitleBar titleBar2;
    private org.edisoncor.gui.varios.TitleBar titleBar3;
    // End of variables declaration//GEN-END:variables
}
