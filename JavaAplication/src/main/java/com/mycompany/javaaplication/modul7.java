
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PC RPL - R1
 */
public class modul7 extends javax.swing.JFrame {

    /**
     * Creates new form modul7
     */
    public modul7() {
        initComponents();
        DefaultListModel ListModel = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AreaKota = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListMinuman = new javax.swing.JTextArea();
        CbMakanan = new javax.swing.JComboBox<>();
        btTambah = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btUbah = new javax.swing.JButton();
        btSisip = new javax.swing.JButton();
        eUbah = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfMakanan = new javax.swing.JTextField();
        tfMinuman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfKota = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaKota.setColumns(20);
        AreaKota.setRows(5);
        jScrollPane1.setViewportView(AreaKota);

        ListMinuman.setColumns(20);
        ListMinuman.setRows(5);
        jScrollPane2.setViewportView(ListMinuman);

        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btUbah.setText("Ubah");
        btUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUbahActionPerformed(evt);
            }
        });

        btSisip.setText("Sisip");
        btSisip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSisipActionPerformed(evt);
            }
        });

        jLabel1.setText("Kota");

        jLabel2.setText("Makanan");

        jLabel3.setText("Minuman");

        jLabel4.setText("Kota");

        jLabel5.setText("Makanan");

        jLabel6.setText("Minuman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(99, 99, 99)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btTambah)
                                            .addComponent(btHapus)
                                            .addComponent(btUbah)
                                            .addComponent(btSisip)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(eUbah)
                                    .addComponent(tfMakanan)
                                    .addComponent(tfMinuman)
                                    .addComponent(tfKota, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btTambah)
                                .addGap(18, 18, 18)
                                .addComponent(btHapus)
                                .addGap(18, 18, 18)
                                .addComponent(btUbah)
                                .addGap(28, 28, 28)
                                .addComponent(btSisip)))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfKota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMinuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(34, 34, 34)
                .addComponent(eUbah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        AreaKota.append("Gersik"+"\n");
        AreaKota.append("Malang "+"\n");
        AreaKota.append("Surabaya"+"\n");
        CbMakanan.insertItemAt("Rujak", 0);
        CbMakanan.insertItemAt("Rawon", 1);
        CbMakanan.insertItemAt("Sate", 2);


       DefaultListModel<String> ListModel = new DefaultListModel<>();
        ListModel.add(0, "Sprite"); 
        ListModel.add(1, "Fanta"); 
        ListModel.add(2, "Es Batu"); 
        ListModel.add(3, "Kopi"); 
      
    }//GEN-LAST:event_btTambahActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount()>0) {
        AreaKota.setSelectionStart(0);
        AreaKota.setSelectionEnd(12);
        int posisi = AreaKota.getSelectedText().indexOf("\n");
        AreaKota.replaceRange("", 0,posisi+1);
        if (posisi == -1)
        AreaKota.replaceRange("",0,8);
        }
        if (CbMakanan.getItemCount()>0){
        CbMakanan.removeItemAt(0);
        }
        if (ListModel.getSize()>0){
        ListModel.remove(0);
        }

       
    }//GEN-LAST:event_btHapusActionPerformed

    private void btUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUbahActionPerformed
        // TODO add your handling code here:
        if (AreaKota.getLineCount()>0) {
AreaKota.setSelectionStart(0);
AreaKota.setSelectionEnd(12);
int posisi = AreaKota.getSelectedText().indexOf("\n");
AreaKota.replaceRange(btUbah.getText()+"\n", 0,posisi+1);
if (posisi == -1)
AreaKota.replaceRange(btUbah.getText()+"\n",0,8);
}
if (CbMakanan.getItemCount()>0){
CbMakanan.removeItemAt(1);
CbMakanan.insertItemAt(btUbah.getText(),1);
}
if (ListModel.getSize()>0){
ListModel.remove(1);
ListModel.insertElementAt(btUbah.getText(),1);
}
       

    }//GEN-LAST:event_btUbahActionPerformed

    private void btSisipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSisipActionPerformed
        // TODO add your handling code here:
      String kotaInput = tfKota.getText();
      String makananInput = tfMakanan.getText();
      String minumanInput = tfMinuman.getText();
      
      //Masukkan input ke dalam JTextArea
      AreaKota.append(kotaInput + "\n");
      
      CbMakanan.addItem(makananInput);
      
      ListModel.addElement(minumanInput);
    }//GEN-LAST:event_btSisipActionPerformed

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
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modul7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modul7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaKota;
    private javax.swing.JComboBox<String> CbMakanan;
    private javax.swing.JTextArea ListMinuman;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSisip;
    private javax.swing.JButton btTambah;
    private javax.swing.JButton btUbah;
    private javax.swing.JTextField eUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfKota;
    private javax.swing.JTextField tfMakanan;
    private javax.swing.JTextField tfMinuman;
    // End of variables declaration//GEN-END:variables
    DefaultListModel ListModel; 
}
