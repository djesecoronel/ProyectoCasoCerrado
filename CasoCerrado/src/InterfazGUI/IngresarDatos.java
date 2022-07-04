
package InterfazGUI;

import Listas.ListaCaso;
import Modelo.Caso;
import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;



public class IngresarDatos extends javax.swing.JFrame {
    
    public static ListaCaso modelo;
    
    public static Caso caso;
    FileWriter guardar;
    
    public IngresarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Ventana1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombreclavetxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Codigotxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Siguiente1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Casotxt = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Descripciontxt = new javax.swing.JTextField();
        Siguiente2 = new javax.swing.JButton();
        Ventana3 = new javax.swing.JInternalFrame();
        Ventana2 = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        VentanaSospechoso = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jTextField16 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ventana1.setVisible(true);
        Ventana1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(810, 150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("NOMBRE CLAVE:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        Nombreclavetxt.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Nombreclavetxt.setForeground(new java.awt.Color(204, 204, 204));
        Nombreclavetxt.setBorder(null);
        Nombreclavetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NombreclavetxtMousePressed(evt);
            }
        });
        Nombreclavetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreclavetxtActionPerformed(evt);
            }
        });
        jPanel2.add(Nombreclavetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 250, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("CODIGO DE PRIORIDAD:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        Codigotxt.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Codigotxt.setForeground(new java.awt.Color(204, 204, 204));
        Codigotxt.setBorder(null);
        Codigotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CodigotxtMousePressed(evt);
            }
        });
        Codigotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigotxtActionPerformed(evt);
            }
        });
        jPanel2.add(Codigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 250, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 250, 10));

        Siguiente1.setBackground(new java.awt.Color(255, 0, 0));
        Siguiente1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Siguiente1.setText("ATRÁS");
        Siguiente1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Siguiente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Siguiente1MouseClicked(evt);
            }
        });
        jPanel2.add(Siguiente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 90, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, 10));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel5.setText("ID DEL CASO: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Casotxt.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Casotxt.setForeground(new java.awt.Color(204, 204, 204));
        Casotxt.setBorder(null);
        Casotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CasotxtMousePressed(evt);
            }
        });
        Casotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasotxtActionPerformed(evt);
            }
        });
        jPanel2.add(Casotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 30));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 250, 10));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 204, 255));
        jLabel9.setText("DATOS DEL CASO:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel10.setText("DESCRIPCION:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 250, 10));

        Descripciontxt.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        Descripciontxt.setForeground(new java.awt.Color(204, 204, 204));
        Descripciontxt.setBorder(null);
        Descripciontxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DescripciontxtMousePressed(evt);
            }
        });
        Descripciontxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescripciontxtActionPerformed(evt);
            }
        });
        jPanel2.add(Descripciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 250, 30));

        Siguiente2.setBackground(new java.awt.Color(102, 153, 255));
        Siguiente2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        Siguiente2.setText("SIGUIENTE");
        Siguiente2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Siguiente2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Siguiente2MouseClicked(evt);
            }
        });
        jPanel2.add(Siguiente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 140, -1));

        Ventana1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 360));

        Ventana3.setVisible(true);
        Ventana3.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Ventana1.getContentPane().add(Ventana3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 880, 380));

        jPanel1.add(Ventana1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 390));

        Ventana2.setBackground(new java.awt.Color(255, 255, 255));
        Ventana2.setVisible(false);
        Ventana2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("ID: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 250, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 250, 10));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel6.setText("AÑOS DE EXPERIENCIA:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jTextField5.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(204, 204, 204));
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 250, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 250, 10));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel7.setText("DETECTIVE:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jTextField6.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(204, 204, 204));
        jTextField6.setBorder(null);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 250, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 250, 10));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("SIGUIENTE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 153, 255));
        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setText("ATRÁS");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 204, 255));
        jLabel8.setText("DATOS DEL DETECTIVE:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        Ventana2.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 290));

        jPanel1.add(Ventana2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 890, 370));

        VentanaSospechoso.setVisible(false);
        VentanaSospechoso.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("DATOS SOSPECHOSO:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel17.setText("EDAD:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jTextField12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(204, 204, 204));
        jTextField12.setBorder(null);
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 210, 10));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel18.setText("DESCRIPCION:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, -1, -1));

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 260, 10));

        jTextField13.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(204, 204, 204));
        jTextField13.setBorder(null);
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 250, -1));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel19.setText("NOMBRE: ");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 133, 210, 10));

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 240, 10));

        jTextField14.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(204, 204, 204));
        jTextField14.setBorder(null);
        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 200, -1));

        jTextField15.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(204, 204, 204));
        jTextField15.setBorder(null);
        jPanel5.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 230, -1));

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel20.setText("DIRECCION:");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel21.setText("ALIAS:");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 210, 10));

        jTextField16.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextField16.setForeground(new java.awt.Color(204, 204, 204));
        jTextField16.setBorder(null);
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 200, -1));

        jButton2.setBackground(new java.awt.Color(102, 153, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("GUARDAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton4.setText("ATRÁS");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, -1));

        VentanaSospechoso.getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 320));

        jPanel1.add(VentanaSospechoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 910, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreclavetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreclavetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreclavetxtActionPerformed

    private void CodigotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigotxtActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void Siguiente1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siguiente1MouseClicked
        Opcion op = new Opcion();
        op.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_Siguiente1MouseClicked

    private void CasotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CasotxtActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        Ventana1.setVisible(true);
        Ventana2.setVisible(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void DescripciontxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescripciontxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripciontxtActionPerformed

    private void Siguiente2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Siguiente2MouseClicked
        Ventana2.setVisible(true);
        Ventana1.setVisible(false);
    }//GEN-LAST:event_Siguiente2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        VentanaSospechoso.setVisible(false);
        Ventana2.setVisible(true);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Ventana2.setVisible(false);
        VentanaSospechoso.setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Caso guardado correctamente.");
        Opcion op = new Opcion();
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void CasotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CasotxtMousePressed
        
    }//GEN-LAST:event_CasotxtMousePressed

    private void CodigotxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigotxtMousePressed
        
    }//GEN-LAST:event_CodigotxtMousePressed

    private void DescripciontxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripciontxtMousePressed
        
    }//GEN-LAST:event_DescripciontxtMousePressed

    private void NombreclavetxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreclavetxtMousePressed
        
    }//GEN-LAST:event_NombreclavetxtMousePressed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Casotxt;
    private javax.swing.JTextField Codigotxt;
    private javax.swing.JTextField Descripciontxt;
    private javax.swing.JTextField Nombreclavetxt;
    private javax.swing.JButton Siguiente1;
    private javax.swing.JButton Siguiente2;
    private javax.swing.JInternalFrame Ventana1;
    private javax.swing.JInternalFrame Ventana2;
    private javax.swing.JInternalFrame Ventana3;
    private javax.swing.JInternalFrame VentanaSospechoso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
