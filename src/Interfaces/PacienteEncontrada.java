/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Poncho
 */
public class PacienteEncontrada extends javax.swing.JFrame {

    int xMouse, yMouse, medico;
    String nombreP,edadP,clues,expediente,nombreM;
    DataBase bd;
    int id;
    /**
     * Creates new form PacienteEncontrada
     */
    public PacienteEncontrada() {
        initComponents();
        bd = new DataBase();
        String[] doctores = bd.doctores();
        for (int i=0; i<doctores.length; i++){
            jcbmedicos.addItem(doctores[i]);
        }
        bd.desconectar();
    }

    public PacienteEncontrada(String nombreP, String edadP, int id) {
        initComponents(); 
        this.id = id;
        bd = new DataBase();
        this.nombreP = nombreP;
        this.edadP = edadP;
        jlbnombre.setText(nombreP);
        jlbedad.setText(edadP + " años de edad.");
        String[] doctores = bd.doctores();
        for (int i=0; i<doctores.length; i++){
            jcbmedicos.addItem(doctores[i]);
        }
        bd.desconectar();
    }

    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        equis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpconsultar = new javax.swing.JPanel();
        jlbconsultar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlbnombre = new javax.swing.JLabel();
        jlbedad = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jcbmedicos = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 3));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 255));
        jPanel2.setForeground(new java.awt.Color(0, 51, 255));
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

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        equis.setBackground(new java.awt.Color(102, 153, 255));
        equis.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        equis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equis.setText("x");
        equis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equis.setPreferredSize(new java.awt.Dimension(34, 34));
        equis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                equisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                equisMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(equis, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel1.setText("Seleccionar Doctor");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Edad");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, 30));

        jpconsultar.setBackground(new java.awt.Color(51, 153, 255));
        jpconsultar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbconsultar.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jlbconsultar.setForeground(new java.awt.Color(255, 255, 255));
        jlbconsultar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbconsultar.setText("Ingresar informacion");
        jlbconsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbconsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbconsultarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbconsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbconsultarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpconsultarLayout = new javax.swing.GroupLayout(jpconsultar);
        jpconsultar.setLayout(jpconsultarLayout);
        jpconsultarLayout.setHorizontalGroup(
            jpconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpconsultarLayout.createSequentialGroup()
                .addComponent(jlbconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpconsultarLayout.setVerticalGroup(
            jpconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpconsultarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlbconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(jpconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 230, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Medico que la trato");
        background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nombre del paciente");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jlbnombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        background.add(jlbnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 20));

        jlbedad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        background.add(jlbedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 80, 20));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 230, 10));

        background.add(jcbmedicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 240, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseClicked
        System.exit(0);
    }//GEN-LAST:event_equisMouseClicked

    private void equisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseEntered
        jPanel3.setBackground(Color.red);
        equis.setForeground(Color.white);
    }//GEN-LAST:event_equisMouseEntered

    private void equisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equisMouseExited
        jPanel3.setBackground(new Color(153, 153, 255));
        equis.setForeground(Color.black);
    }//GEN-LAST:event_equisMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        this.setLocation(evt.getXOnScreen() - xMouse, evt.getYOnScreen() - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jlbconsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbconsultarMouseClicked
        String medicoTratante = String.valueOf(jcbmedicos.getSelectedItem()).trim();
        System.out.println(medicoTratante);
        Diagnostico d = new Diagnostico(id, medicoTratante, nombreP);
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlbconsultarMouseClicked

    private void jlbconsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbconsultarMouseEntered
        jpconsultar.setBackground(Color.blue);
        jlbconsultar.setForeground(Color.black);
    }//GEN-LAST:event_jlbconsultarMouseEntered

    private void jlbconsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbconsultarMouseExited
        jpconsultar.setBackground(new Color(53,153,255));
        jlbconsultar.setForeground(Color.white);
    }//GEN-LAST:event_jlbconsultarMouseExited

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
            java.util.logging.Logger.getLogger(PacienteEncontrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacienteEncontrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacienteEncontrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacienteEncontrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacienteEncontrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel equis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcbmedicos;
    private javax.swing.JLabel jlbconsultar;
    private javax.swing.JLabel jlbedad;
    private javax.swing.JLabel jlbnombre;
    private javax.swing.JPanel jpconsultar;
    // End of variables declaration//GEN-END:variables
}
