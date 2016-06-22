/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mikroskil.elm_skripsi.Learning;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.TableModel;

/**
 *
 * @author Andy Wijaya
 */
public class TestingPage extends javax.swing.JDialog {

    /**
     * Creates new form TestingPage
     */
    TestingAction pageAction;
    
    public TestingPage(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pageAction = new TestingAction(this);
        this.setLocationRelativeTo(null);
        pageAction.initialize();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTahunTestAwal = new javax.swing.JComboBox();
        cmbTahunTestAkhir = new javax.swing.JComboBox();
        cmbBulanTestAwal = new javax.swing.JComboBox();
        cmbBulanTestAkhir = new javax.swing.JComboBox();
        cmbKodeSaham = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMain = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPresisiNaik = new javax.swing.JLabel();
        lblPresisiTetap = new javax.swing.JLabel();
        lblPresisiTurun = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblRecallNaik = new javax.swing.JLabel();
        lblRecallTetap = new javax.swing.JLabel();
        lblRecallTurun = new javax.swing.JLabel();
        Akurasi = new javax.swing.JLabel();
        lblAkurasi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnProcess = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblJumlahNaik = new javax.swing.JLabel();
        lblJumlahTetap = new javax.swing.JLabel();
        lblJumlahTurun = new javax.swing.JLabel();
        btnDetail = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        labelWaktu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Kode Saham");

        jLabel7.setText("Testing Set :");

        jLabel8.setText("Tahun");

        cmbTahunTestAwal.setEnabled(false);
        cmbTahunTestAwal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTahunTestAwalItemStateChanged(evt);
            }
        });

        cmbTahunTestAkhir.setEnabled(false);
        cmbTahunTestAkhir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTahunTestAkhirItemStateChanged(evt);
            }
        });

        cmbBulanTestAwal.setEnabled(false);
        cmbBulanTestAwal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBulanTestAwalItemStateChanged(evt);
            }
        });

        cmbBulanTestAkhir.setEnabled(false);
        cmbBulanTestAkhir.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBulanTestAkhirItemStateChanged(evt);
            }
        });
        cmbBulanTestAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBulanTestAkhirActionPerformed(evt);
            }
        });

        cmbKodeSaham.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbKodeSahamItemStateChanged(evt);
            }
        });

        jLabel9.setText("Bulan");

        tblMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Hasil Prediksi", "Kenyataan"
            }
        ));
        jScrollPane1.setViewportView(tblMain);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jLabel12.setText("Presisi Naik");

        jLabel13.setText("Presisi Tetap");

        jLabel14.setText("Presisi Turun");

        lblPresisiNaik.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPresisiNaik.setText("0%");

        lblPresisiTetap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPresisiTetap.setText("0%");

        lblPresisiTurun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPresisiTurun.setText("0%");

        jLabel18.setText("Recall Naik");

        jLabel19.setText("Recall Tetap");

        jLabel20.setText("Recall Turun");

        lblRecallNaik.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecallNaik.setText("0%");

        lblRecallTetap.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecallTetap.setText("0%");

        lblRecallTurun.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecallTurun.setText("0%");

        Akurasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Akurasi.setText("Akurasi     :");

        lblAkurasi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAkurasi.setText("0%");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnProcess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setText("Jumlah Naik");

        jLabel16.setText("Jumlah Tetap");

        jLabel17.setText("Jumlah Turun");

        lblJumlahNaik.setText("0");
        lblJumlahNaik.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblJumlahTetap.setText("0");
        lblJumlahTetap.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblJumlahTurun.setText("0");
        lblJumlahTurun.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnDetail.setText("Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(33, 33, 33)
                                .addComponent(lblPresisiTurun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(41, 41, 41)
                                .addComponent(lblPresisiNaik, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(33, 33, 33)
                                .addComponent(lblPresisiTetap, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRecallTurun, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(lblRecallTetap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRecallNaik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Akurasi)
                        .addGap(34, 34, 34)
                        .addComponent(lblAkurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblJumlahNaik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(lblJumlahTetap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblJumlahTurun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Akurasi)
                        .addComponent(lblAkurasi))
                    .addComponent(btnDetail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblPresisiNaik)
                    .addComponent(jLabel18)
                    .addComponent(lblRecallNaik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblPresisiTetap)
                    .addComponent(jLabel19)
                    .addComponent(lblRecallTetap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblPresisiTurun)
                    .addComponent(jLabel20)
                    .addComponent(lblRecallTurun))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lblJumlahNaik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblJumlahTetap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lblJumlahTurun))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jLabel2.setText("Dari :");

        jLabel3.setText("Sampai :");

        jLabel10.setText("Bulan");

        jLabel11.setText("Tahun");

        jLabel4.setText("Waktu :");

        labelWaktu.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(cmbKodeSaham, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel3))))
                                .addGap(85, 85, 85))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbBulanTestAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbTahunTestAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbBulanTestAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(cmbTahunTestAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelWaktu)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbKodeSaham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(labelWaktu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBulanTestAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTahunTestAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulanTestAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTahunTestAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTahunTestAwalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTahunTestAwalItemStateChanged
        pageAction.setTestSetEndMonth((String)evt.getItem());
    }//GEN-LAST:event_cmbTahunTestAwalItemStateChanged

    private void cmbTahunTestAkhirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTahunTestAkhirItemStateChanged
        pageAction.setEndYear((String)evt.getItem());
    }//GEN-LAST:event_cmbTahunTestAkhirItemStateChanged

    private void cmbBulanTestAwalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBulanTestAwalItemStateChanged
        pageAction.setTestSetBeginYear((String)evt.getItem());
    }//GEN-LAST:event_cmbBulanTestAwalItemStateChanged

    private void cmbBulanTestAkhirItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBulanTestAkhirItemStateChanged
        pageAction.setEndYearTest((String)evt.getItem());
    }//GEN-LAST:event_cmbBulanTestAkhirItemStateChanged

    private void cmbKodeSahamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbKodeSahamItemStateChanged
        pageAction.setChoosen((String)evt.getItem());
    }//GEN-LAST:event_cmbKodeSahamItemStateChanged

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        pageAction.doTesting();
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        pageAction.showDetail();
    }//GEN-LAST:event_btnDetailActionPerformed

    private void cmbBulanTestAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBulanTestAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBulanTestAkhirActionPerformed

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
            java.util.logging.Logger.getLogger(TestingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestingPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TestingPage dialog = new TestingPage(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Akurasi;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnProcess;
    private javax.swing.JComboBox cmbBulanTestAkhir;
    private javax.swing.JComboBox cmbBulanTestAwal;
    private javax.swing.JComboBox cmbKodeSaham;
    private javax.swing.JComboBox cmbTahunTestAkhir;
    private javax.swing.JComboBox cmbTahunTestAwal;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JLabel lblAkurasi;
    private javax.swing.JLabel lblJumlahNaik;
    private javax.swing.JLabel lblJumlahTetap;
    private javax.swing.JLabel lblJumlahTurun;
    private javax.swing.JLabel lblPresisiNaik;
    private javax.swing.JLabel lblPresisiTetap;
    private javax.swing.JLabel lblPresisiTurun;
    private javax.swing.JLabel lblRecallNaik;
    private javax.swing.JLabel lblRecallTetap;
    private javax.swing.JLabel lblRecallTurun;
    private javax.swing.JTable tblMain;
    // End of variables declaration//GEN-END:variables

    public JComboBox getCmbKodeSaham(){
        return cmbKodeSaham;
    }
    
    public JComboBox getCmbTahunTestAwal(){
        return cmbTahunTestAwal;
    }
    
    public JComboBox getCmbTahunTestAkhir(){
        return cmbTahunTestAkhir;
    }
    
    public JComboBox getCmbBulanTestAwal(){
        return cmbBulanTestAwal;
    }
    
    public JComboBox getCmbBulanTestAkhir(){
        return cmbBulanTestAkhir;
    }
   
    public void fillCmbKodeSaham(ComboBoxModel model){
        cmbKodeSaham.setModel(model);
    }
    
    public void fillCmbTahunTestAwal(ComboBoxModel model){
        cmbTahunTestAwal.setModel(model);
    }
    
    public void fillCmbTahunTestAkhir(ComboBoxModel model){
        cmbTahunTestAkhir.setModel(model);
    }
    
    public void fillCmbBulanTestAwal(ComboBoxModel model){
        cmbBulanTestAwal.setModel(model);
    }
    
    public void fillCmbBulanTestAkhir(ComboBoxModel model){
        cmbBulanTestAkhir.setModel(model);
    }
    
    public void fillResultTable(TableModel model){
        tblMain.setModel(model);
    }
    
    public void setAccuracy(double accuracy){
        lblAkurasi.setText(String.format("%.2f%%",accuracy));
    }
    
    public void setJumlah(int jumlahNaik, int jumlahTetap, int jumlahTurun){
        lblJumlahNaik.setText(String.format("%d",jumlahNaik));
        lblJumlahTetap.setText(String.format("%d",jumlahTetap));
        lblJumlahTurun.setText(String.format("%d",jumlahTurun));
    }
    
    public void setPresisiAndRecall(double presisiNaik, double presisiTetap, double presisiTurun, double recallNaik, double recallTetap, double recallTurun){
        lblPresisiNaik.setText(String.format("%.2f%%",presisiNaik));
        lblPresisiTetap.setText(String.format("%.2f%%",presisiTetap));
        lblPresisiTurun.setText(String.format("%.2f%%", presisiTurun));
        lblRecallNaik.setText(String.format("%.2f%%", recallNaik));
        lblRecallTetap.setText(String.format("%.2f%%",recallTetap));
        lblRecallTurun.setText(String.format("%.2f%%", recallTurun));
        
    }
    
    public void setLabelWaktu(String time){
        this.labelWaktu.setText(time);
    }
}
