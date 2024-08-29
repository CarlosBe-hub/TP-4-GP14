/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Jframe;

import Data.AlumnoData;
import javax.swing.JOptionPane;
import tp.pkg4.gp14.Alumno;

/**
 *
 * @author carlo
 */
public class menuAlumnos extends javax.swing.JInternalFrame {
       
    private AlumnoData ad;
    /**
     * Creates new form Alumnos
     */
    public menuAlumnos() {
        initComponents();
         
        ad = new AlumnoData();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTlegajo = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBnewfile = new javax.swing.JButton();
        jBexit = new javax.swing.JButton();

        escritorio2.setBackground(new java.awt.Color(0, 153, 255));
        escritorio2.setForeground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formulario de Alumnos");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LEGAJO:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APELLIDO:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE:");

        jButton1.setForeground(new java.awt.Color(255, 0, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBnewfile.setForeground(new java.awt.Color(255, 0, 51));
        jBnewfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/newarchive.png"))); // NOI18N
        jBnewfile.setText("Nuevo");
        jBnewfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnewfileActionPerformed(evt);
            }
        });

        jBexit.setForeground(new java.awt.Color(255, 0, 51));
        jBexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        jBexit.setText("Salir");
        jBexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexitActionPerformed(evt);
            }
        });

        escritorio2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jTlegajo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jTapellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jTnombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jBnewfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio2.setLayer(jBexit, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorio2Layout = new javax.swing.GroupLayout(escritorio2);
        escritorio2.setLayout(escritorio2Layout);
        escritorio2Layout.setHorizontalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTnombre))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTapellido))
                            .addGroup(escritorio2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTlegajo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(escritorio2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jBnewfile)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jBexit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        escritorio2Layout.setVerticalGroup(
            escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorio2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTlegajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(escritorio2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBexit)
                    .addComponent(jBnewfile)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBnewfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnewfileActionPerformed
        jTapellido.setText("");
        jTnombre.setText("");
        jTlegajo.setText("");
    }//GEN-LAST:event_jBnewfileActionPerformed

    private void jBexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexitActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBexitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        int legajo = Integer.parseInt(jTlegajo.getText());
        String apellido = jTapellido.getText();
        String nombre = jTnombre.getText();
        
        Alumno A = new Alumno(legajo, apellido, nombre);
        AlumnoData ad = new AlumnoData();
        ad.guardarA(A);
        
        
        JOptionPane.showMessageDialog(null, "estudiantre agregado: "+jTapellido.getText()+" "+jTnombre.getText());
        } catch(NumberFormatException e){
            
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de legajo"," Error de formato", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio2;
    private javax.swing.JButton jBexit;
    private javax.swing.JButton jBnewfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTlegajo;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
