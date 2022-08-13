/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.reto5_2.vista;

import com.mycompany.reto5_2.controller.RequerimientoController;
import com.mycompany.reto5_2.model.vo.AsesorPorCiudadVo;
import com.mycompany.reto5_2.model.vo.CompraPorProveedorVo;
import com.mycompany.reto5_2.model.vo.ProyectoCasaCampestreVo;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class FrmRequerimientos extends javax.swing.JFrame {

    /**
     * Creates new form FrmRequerimientos
     */
    public FrmRequerimientos() {
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

        btnRequerimiento1 = new javax.swing.JButton();
        btnRequerimiento2 = new javax.swing.JButton();
        btnRequerimiento3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRequerimiento1.setText("Informe 1");
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });

        btnRequerimiento2.setText("Informe 2");
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });

        btnRequerimiento3.setText("Informe 3");
        btnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento3ActionPerformed(evt);
            }
        });

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRequerimiento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequerimiento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequerimiento3)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequerimiento1)
                    .addComponent(btnRequerimiento2)
                    .addComponent(btnRequerimiento3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed
        // TODO add your handling code here:
        String[] columnNombre = {"Id Lider", "Nombre", "Primer Apellido", "Residencia"};
        RequerimientoController controlador = new RequerimientoController();
        ArrayList<AsesorPorCiudadVo> listaA;
        
        try{
            listaA = controlador.consultarAsesorPorCiudad();
            Object [][] datos = new Object [listaA.size()][4];
            int index = 0;
            
            for(AsesorPorCiudadVo lista:listaA){
                datos[index][0] = lista.getIdLider();
                datos[index][1] = lista.getNombre();
                datos[index][2] = lista.getPrimerApellido();
                datos[index][3] = lista.getCiudadResidencia();
                index++;
            }    
            DefaultTableModel model = new DefaultTableModel(datos,columnNombre);
            miTabla.setModel(model);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        // TODO add your handling code here:
       String[] columnNombre1 = {"Id Proyecto", "Constructora", "Numero Habitaciones", "Ciudad"};
        RequerimientoController controlador = new RequerimientoController();
        ArrayList<ProyectoCasaCampestreVo> listaB;
        
        try{
            listaB = controlador.consultarProyectoCasaCampestre();
            Object [][] datos2 = new Object [listaB.size()][4];
            int index = 0;
            
            for(ProyectoCasaCampestreVo lista:listaB){
                datos2[index][0] = lista.getIdProyecto();
                datos2[index][1] = lista.getConstructora();
                datos2[index][2] = lista.getNumeroHabitaciones();
                datos2[index][3] = lista.getCiudad();
                index++;
            }    
            DefaultTableModel model = new DefaultTableModel(datos2,columnNombre1);
            miTabla.setModel(model);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        } 
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void btnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento3ActionPerformed
        // TODO add your handling code here:
        String[] columnNombre2 = {"Id Compra", "Constructora", "Banco Vinculado"};
        RequerimientoController controlador = new RequerimientoController();
        ArrayList<CompraPorProveedorVo> listaB;
        
        try{
            listaB = controlador.consultarCompraPorProveedor();
            Object [][] datos3 = new Object [listaB.size()][3];
            int index = 0;
            
            for(CompraPorProveedorVo lista:listaB){
                datos3[index][0] = lista.getIdCompra();
                datos3[index][1] = lista.getConstructora();
                datos3[index][2] = lista.getBancoVinculado();
                index++;
            }    
            DefaultTableModel model = new DefaultTableModel(datos3,columnNombre2);
            miTabla.setModel(model);
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRequerimiento3ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JButton btnRequerimiento3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
