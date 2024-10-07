package Interfaces;

import java.awt.Color;

public class MenuDoctores extends javax.swing.JFrame {

    int xMouse, yMouse;
    DataBase db;

    public MenuDoctores() {
        initComponents();
        db = new DataBase();
        labelBienvenida.setText("Bienvenido");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        panelEquis = new javax.swing.JPanel();
        labelEquis = new javax.swing.JLabel();
        labelBienvenida = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        panelConsultar = new javax.swing.JPanel();
        labelConsultar = new javax.swing.JLabel();
        panelRealizar = new javax.swing.JPanel();
        labelRealizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("MENÚ DE DOCTORES");

        panelEquis.setBackground(new java.awt.Color(102, 153, 255));
        panelEquis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelEquis.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        labelEquis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEquis.setText("x");
        labelEquis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelEquis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelEquisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelEquisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelEquisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelEquisLayout = new javax.swing.GroupLayout(panelEquis);
        panelEquis.setLayout(panelEquisLayout);
        panelEquisLayout.setHorizontalGroup(
            panelEquisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEquis, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );
        panelEquisLayout.setVerticalGroup(
            panelEquisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquisLayout.createSequentialGroup()
                .addComponent(labelEquis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(panelEquis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(panelEquis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        labelBienvenida.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        labelBienvenida.setText("Bienvenida");
        jPanel1.add(labelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        panelConsultar.setBackground(new java.awt.Color(51, 153, 255));
        panelConsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelConsultar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelConsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultar.setText("MOSTRAR CENSO");
        labelConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelConsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelConsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelConsultarLayout = new javax.swing.GroupLayout(panelConsultar);
        panelConsultar.setLayout(panelConsultarLayout);
        panelConsultarLayout.setHorizontalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        panelConsultarLayout.setVerticalGroup(
            panelConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        panelRealizar.setBackground(new java.awt.Color(51, 153, 255));
        panelRealizar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        labelRealizar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelRealizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRealizar.setText("REALIZAR CONSULTA");
        labelRealizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelRealizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelRealizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelRealizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelRealizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelRealizarLayout = new javax.swing.GroupLayout(panelRealizar);
        panelRealizar.setLayout(panelRealizarLayout);
        panelRealizarLayout.setHorizontalGroup(
            panelRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
        );
        panelRealizarLayout.setVerticalGroup(
            panelRealizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRealizar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(panelRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 420, 220));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("¿Qué desea realizar?");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseClicked
        labelEquis.setForeground(Color.black);
        panelEquis.setBackground(new Color(102,153,255));
        dispose();
    }//GEN-LAST:event_labelEquisMouseClicked

    private void labelEquisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseEntered
        labelEquis.setForeground(Color.white);
        panelEquis.setBackground(Color.red);
    }//GEN-LAST:event_labelEquisMouseEntered

    private void labelEquisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseExited
        labelEquis.setForeground(Color.black);
        panelEquis.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_labelEquisMouseExited

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen()-xMouse, evt.getYOnScreen()-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void labelConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultarMouseClicked
        new MostrarPacientes().setVisible(true);
    }//GEN-LAST:event_labelConsultarMouseClicked

    private void labelConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultarMouseEntered
        panelConsultar.setBackground(Color.blue);
        labelConsultar.setForeground(Color.white);
    }//GEN-LAST:event_labelConsultarMouseEntered

    private void labelConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelConsultarMouseExited
        panelConsultar.setBackground(new Color(51,153,255));
        labelConsultar.setForeground(Color.black);
    }//GEN-LAST:event_labelConsultarMouseExited

    private void labelRealizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRealizarMouseClicked
        consultaexp consulta = new consultaexp();
        consulta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_labelRealizarMouseClicked

    private void labelRealizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRealizarMouseEntered
        panelRealizar.setBackground(Color.blue);
        labelRealizar.setForeground(Color.white);
    }//GEN-LAST:event_labelRealizarMouseEntered

    private void labelRealizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelRealizarMouseExited
        panelRealizar.setBackground(new Color(51,153,255));
        labelRealizar.setForeground(Color.black);
    }//GEN-LAST:event_labelRealizarMouseExited

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
            java.util.logging.Logger.getLogger(MenuDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDoctores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDoctores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelBienvenida;
    private javax.swing.JLabel labelConsultar;
    private javax.swing.JLabel labelEquis;
    private javax.swing.JLabel labelRealizar;
    private javax.swing.JPanel panelConsultar;
    private javax.swing.JPanel panelEquis;
    private javax.swing.JPanel panelRealizar;
    // End of variables declaration//GEN-END:variables
}