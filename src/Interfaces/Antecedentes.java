/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author mike
 */
public class Antecedentes extends javax.swing.JFrame {

    String[] datos;
    int[] index;
    int item, itemindex;

    /**
     * Creates new form Antecedentes
     */
    public Antecedentes() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public Antecedentes(String[] datos, int[] index) {
        initComponents();
        setLocationRelativeTo(null);
        item = datos.length;
        itemindex = index.length;
        this.datos = new String[datos.length+2];
        for (int i=0; i<datos.length; i++){
            this.datos[i] = datos[i];
        }
        this.index = new int[index.length+5];
        for (int i=0; i<index.length; i++){
            this.index[i] = index[i];
        }
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
        panelEquis = new javax.swing.JPanel();
        labelEquis = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        diaReglaTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        mesReglaTF = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        añoReglaTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        diaPosibleTF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        mesPosibleTF = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        añoPosibleTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        partosTF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        abortosTF = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        cesareasTF = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        gestasTF = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        eventoCB = new javax.swing.JComboBox<>();
        panelSiguiente = new javax.swing.JPanel();
        labelSiguiente = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GINECO-OBSTÉTRICOS");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ANTECEDENTES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(panelEquis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addComponent(panelEquis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 20, -1));

        diaReglaTF.setBorder(null);
        diaReglaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaReglaTFActionPerformed(evt);
            }
        });
        jPanel1.add(diaReglaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 20, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Fecha última regla:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 20, -1));

        mesReglaTF.setBorder(null);
        mesReglaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesReglaTFActionPerformed(evt);
            }
        });
        jPanel1.add(mesReglaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 20, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 40, -1));

        añoReglaTF.setBorder(null);
        añoReglaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoReglaTFActionPerformed(evt);
            }
        });
        jPanel1.add(añoReglaTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 40, -1));

        jLabel3.setText("/");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 10, -1));

        jLabel4.setText("/");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 10, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 20, -1));

        diaPosibleTF.setBorder(null);
        diaPosibleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaPosibleTFActionPerformed(evt);
            }
        });
        jPanel1.add(diaPosibleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 20, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setText("Fecha posible de parto:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 20));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 20, -1));

        mesPosibleTF.setBorder(null);
        mesPosibleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesPosibleTFActionPerformed(evt);
            }
        });
        jPanel1.add(mesPosibleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 20, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 40, -1));

        añoPosibleTF.setBorder(null);
        añoPosibleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añoPosibleTFActionPerformed(evt);
            }
        });
        jPanel1.add(añoPosibleTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 40, -1));

        jLabel5.setText("/");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 10, -1));

        jLabel6.setText("/");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 10, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Formato de fecha \"DD/MM/AAAA\"");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 20, -1));

        partosTF.setBorder(null);
        partosTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partosTFActionPerformed(evt);
            }
        });
        jPanel1.add(partosTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 20, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("No. Partos:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        abortosTF.setBorder(null);
        abortosTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abortosTFActionPerformed(evt);
            }
        });
        jPanel1.add(abortosTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 20, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 20, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("No. Abortos:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        cesareasTF.setBorder(null);
        cesareasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cesareasTFActionPerformed(evt);
            }
        });
        jPanel1.add(cesareasTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 20, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 20, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("No. Cesareas:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 20));

        gestasTF.setBorder(null);
        gestasTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestasTFActionPerformed(evt);
            }
        });
        jPanel1.add(gestasTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 20, -1));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 20, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("último evento obstétrico:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("No. Gestas:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, 20));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setText("Tipo de Resolución del");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        eventoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNO", "PARTO VAGINAL", "CESÁREA", "ABORTO", "ECTÓPICO" }));
        jPanel1.add(eventoCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        panelSiguiente.setBackground(new java.awt.Color(51, 153, 255));

        labelSiguiente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelSiguiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSiguiente.setText("SIGUIENTE");
        labelSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelSiguienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelSiguienteMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSiguienteLayout = new javax.swing.GroupLayout(panelSiguiente);
        panelSiguiente.setLayout(panelSiguienteLayout);
        panelSiguienteLayout.setHorizontalGroup(
            panelSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSiguienteLayout.setVerticalGroup(
            panelSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(panelSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelEquisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseClicked
        System.exit(0);
    }//GEN-LAST:event_labelEquisMouseClicked

    private void labelEquisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseEntered
        labelEquis.setForeground(Color.white);
        panelEquis.setBackground(Color.red);
    }//GEN-LAST:event_labelEquisMouseEntered

    private void labelEquisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelEquisMouseExited
        labelEquis.setForeground(Color.black);
        panelEquis.setBackground(new Color(102,153,255));
    }//GEN-LAST:event_labelEquisMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

    }//GEN-LAST:event_jPanel2MousePressed

    private void diaReglaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaReglaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaReglaTFActionPerformed

    private void mesReglaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesReglaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesReglaTFActionPerformed

    private void añoReglaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoReglaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoReglaTFActionPerformed

    private void diaPosibleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaPosibleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaPosibleTFActionPerformed

    private void mesPosibleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesPosibleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesPosibleTFActionPerformed

    private void añoPosibleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añoPosibleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_añoPosibleTFActionPerformed

    private void partosTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partosTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partosTFActionPerformed

    private void abortosTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abortosTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abortosTFActionPerformed

    private void cesareasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cesareasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cesareasTFActionPerformed

    private void gestasTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestasTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestasTFActionPerformed

    private void labelSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSiguienteMouseClicked
        String diaRegla = diaReglaTF.getText();
        String mesRegla = mesReglaTF.getText();
        String añoRegla = añoReglaTF.getText();
        String diaParto = diaPosibleTF.getText();
        String mesParto = mesPosibleTF.getText();
        String añoParto = añoPosibleTF.getText();
        String fechaUltimaRegla = añoRegla + "-" + mesRegla + "-" + diaRegla;
        String fechaPosibleParto = añoParto + "-" + mesParto + "-" + diaParto;
        int noPartos = Integer.parseInt(partosTF.getText());
        int noCesareas = Integer.parseInt(cesareasTF.getText());
        int noAbortos = Integer.parseInt(abortosTF.getText());
        int noGestas = Integer.parseInt(gestasTF.getText());
        int ultimoEvento = eventoCB.getSelectedIndex();
        if (!diaRegla.equals("") && !mesRegla.equals("") && !añoRegla.equals("") && !diaParto.equals("") && !mesParto.equals("") && !añoParto.equals("")){
            datos[item] = fechaUltimaRegla;
            item++;
            datos[item] = fechaPosibleParto;
            item++;
            index[itemindex] = noPartos;
            itemindex++;
            index[itemindex] = noCesareas;
            itemindex++;
            index[itemindex] = noAbortos;
            itemindex++;
            index[itemindex] = noGestas;
            itemindex++;
            index[itemindex] = ultimoEvento;
            itemindex++;
            Diagnostico diag = new Diagnostico(datos, index);
            diag.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, llene todos los campos.");
        }
    }//GEN-LAST:event_labelSiguienteMouseClicked

    private void labelSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSiguienteMouseEntered
        panelSiguiente.setBackground(Color.blue);
        labelSiguiente.setForeground(Color.white);
    }//GEN-LAST:event_labelSiguienteMouseEntered

    private void labelSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelSiguienteMouseExited
        panelSiguiente.setBackground(new Color(51,153,255));
        labelSiguiente.setForeground(Color.black);
    }//GEN-LAST:event_labelSiguienteMouseExited

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
            java.util.logging.Logger.getLogger(Antecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Antecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Antecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Antecedentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Antecedentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abortosTF;
    private javax.swing.JTextField añoPosibleTF;
    private javax.swing.JTextField añoReglaTF;
    private javax.swing.JTextField cesareasTF;
    private javax.swing.JTextField diaPosibleTF;
    private javax.swing.JTextField diaReglaTF;
    private javax.swing.JComboBox<String> eventoCB;
    private javax.swing.JTextField gestasTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelEquis;
    private javax.swing.JLabel labelSiguiente;
    private javax.swing.JTextField mesPosibleTF;
    private javax.swing.JTextField mesReglaTF;
    private javax.swing.JPanel panelEquis;
    private javax.swing.JPanel panelSiguiente;
    private javax.swing.JTextField partosTF;
    // End of variables declaration//GEN-END:variables
}