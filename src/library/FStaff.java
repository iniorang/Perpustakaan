/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faqih
 */
public class FStaff extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.koneksiDb();
    FLogin login = new FLogin();
    String status = login.login;
    
    public void tab(){
        Object[] tab = {
           "ID","Nama","Alamat","Nomor HP","Username",
        };
        tabModel = new DefaultTableModel(null,tab);
        TableStaff.setModel(tabModel);
    }
    
    public void reset(){
            FieldID.setText("");
            FieldNama.setText("");
            FieldAlamat.setText("");
            FieldTele.setText("");
            FieldUser.setText("");
            FieldPass.setText("");
            TambahBtn.setEnabled(true);
            UbahBtn.setEnabled(false);
            HapusBtn.setEnabled(false);
    }
    
    public void ShowData(String where){
        try{
            st = cn.createStatement();
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM `tbl_staff` ORDER BY `tbl_staff`.`id_user` ASC" + where);
            
            while (rs.next()){
                Object[] data = {
                    rs.getString("id_user"),
                    rs.getString("nama"),
                    rs.getString("alamat"),
                    rs.getString("nope"),
                    rs.getString("username"),
                };
                tabModel.addRow(data);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * Creates new form FStaff
     */
    public FStaff() {
        initComponents();
        tab();
        ShowData("");
        /*if("kepala".equals(status)){
            TabStaff.setEnabled(true);
        }else{
            TabStaff.setEnabled(false);
        }*/
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
        jLabel2 = new javax.swing.JLabel();
        FieldID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableStaff = new javax.swing.JTable();
        TambahBtn = new javax.swing.JButton();
        UbahBtn = new javax.swing.JButton();
        HapusBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FieldNama = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        FieldAlamat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        FieldTele = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        FieldUser = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        FieldPass = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        TabBuku = new javax.swing.JMenu();
        TabAnggota = new javax.swing.JMenu();
        TabStaff = new javax.swing.JMenu();
        TabTransaksi = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Management Staff");

        jLabel2.setText("ID");

        FieldID.setEditable(false);

        TableStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableStaffMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableStaff);

        TambahBtn.setText("Tambah");
        TambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahBtnActionPerformed(evt);
            }
        });

        UbahBtn.setText("Ubah");
        UbahBtn.setEnabled(false);
        UbahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UbahBtnActionPerformed(evt);
            }
        });

        HapusBtn.setText("Hapus");
        HapusBtn.setEnabled(false);
        HapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Reset");

        jLabel8.setText("Nama");

        jLabel9.setText("Alamat");

        jLabel10.setText("No.Telepon");

        jLabel11.setText("Username");

        jLabel12.setText("Password");

        FieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPassActionPerformed(evt);
            }
        });

        jMenu1.setText("Logout");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        TabBuku.setText("Buku");
        TabBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabBukuMouseClicked(evt);
            }
        });
        jMenuBar1.add(TabBuku);

        TabAnggota.setText("Anggota");
        TabAnggota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabAnggotaMouseClicked(evt);
            }
        });
        jMenuBar1.add(TabAnggota);

        TabStaff.setText("Staff");
        TabStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabStaffMouseClicked(evt);
            }
        });
        jMenuBar1.add(TabStaff);

        TabTransaksi.setText("Transaksi");
        TabTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabTransaksiMouseClicked(evt);
            }
        });
        jMenuBar1.add(TabTransaksi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldUser, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ResetBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(UbahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldNama))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldAlamat))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FieldTele)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FieldPass)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(FieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(FieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(FieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(FieldTele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(FieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TambahBtn)
                            .addComponent(UbahBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HapusBtn)
                            .addComponent(ResetBtn)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahBtnActionPerformed
        // TODO add your handling code here:
        if(FieldNama.getText().equals("")&&FieldAlamat.getText().equals("")&&FieldTele.getText().equals("")&&FieldUser.getText().equals("")&&FieldPass.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Salah satu atau lebih data masih kosong, mohon cek kembail");
        }else{
            try{
            st = cn.createStatement();
            st.executeUpdate("INSERT INTO `tbl_staff` (`nama`, `alamat`, `nope`, `username`, `password`, `level`) VALUES ('"+FieldNama.getText()+"','"+FieldAlamat.getText()+"','"+FieldTele.getText()+"','"+FieldUser.getText()+"','"+FieldPass.getText()+"','"+"pustakawan"+"')");
            ShowData("");
            JOptionPane.showMessageDialog(null,"Tamabah Staff Berhasil");
            FieldNama.setText("");
            FieldAlamat.setText("");
            FieldTele.setText("");
            FieldUser.setText("");
            FieldPass.setText("");
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_TambahBtnActionPerformed

    private void FieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPassActionPerformed

    private void TableStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableStaffMouseClicked
        // TODO add your handling code here
        FieldID.setText(TableStaff.getValueAt(TableStaff.getSelectedRow(), 0).toString());
        FieldNama.setText(TableStaff.getValueAt(TableStaff.getSelectedRow(), 1).toString());
        FieldAlamat.setText(TableStaff.getValueAt(TableStaff.getSelectedRow(), 2).toString());
        FieldTele.setText(TableStaff.getValueAt(TableStaff.getSelectedRow(), 3).toString());
        FieldUser.setText(TableStaff.getValueAt(TableStaff.getSelectedRow(), 4).toString());

        TambahBtn.setEnabled(false);
        UbahBtn.setEnabled(true);
        HapusBtn.setEnabled(true);
    }//GEN-LAST:event_TableStaffMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         int keluar;
        keluar = JOptionPane.showOptionDialog(this,
                "Keluar dari Kelola Data Anggota?",
                "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,null,null);
        if(keluar==JOptionPane.YES_NO_OPTION)
        {
            new FLogin().show();
            this.dispose();
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void UbahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UbahBtnActionPerformed
        // TODO add your handling code here:
        if(FieldNama.getText().equals("")&&FieldAlamat.getText().equals("")&&FieldTele.getText().equals("")&&FieldUser.getText().equals("")&&FieldPass.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Salah satu atau lebih data masih kosong, mohon cek kembail");
        }else{
                    try{
            st = cn.createStatement();
            st.executeUpdate("UPDATE `tbl_staff` SET "
                    +"nama='"+FieldNama.getText()+"',"
                    +"alamat='"+FieldAlamat.getText()+"',"
                    +"nope='"+FieldTele.getText()+"',"
                    +"username='"+FieldUser.getText()+"',"
                    +"password='"+FieldPass.getText()+""
                    +"'WHERE id_user='"+FieldID.getText()+"'");
            ShowData("");
            JOptionPane.showMessageDialog(null,"Ubah Staff Berhasil");
            FieldNama.setText("");
            FieldAlamat.setText("");
            FieldTele.setText("");
            FieldUser.setText("");
            FieldPass.setText("");
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_UbahBtnActionPerformed

    private void HapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBtnActionPerformed
        // TODO add your handling code here:
        try{
            int confirm;
            if((confirm = JOptionPane.showConfirmDialog(null,"Apakah anda mau menghapus staff ini?","Konfirmasi",JOptionPane.YES_NO_OPTION))==0){
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM `tbl_staff` WHERE id_user='"+FieldID.getText()+"'");
                ShowData("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_HapusBtnActionPerformed

    private void TabBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabBukuMouseClicked
        // TODO add your handling code here:
         new FBuku().show();
         this.dispose();
    }//GEN-LAST:event_TabBukuMouseClicked

    private void TabAnggotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabAnggotaMouseClicked
        // TODO add your handling code here:
         new FDataAnggota().show();
         this.dispose();
    }//GEN-LAST:event_TabAnggotaMouseClicked

    private void TabStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabStaffMouseClicked
        // TODO add your handling code here:
         new FStaff().show();
         this.dispose();
    }//GEN-LAST:event_TabStaffMouseClicked

    private void TabTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabTransaksiMouseClicked
        // TODO add your handling code here:
         new FTransaksi().show();
         this.dispose();
    }//GEN-LAST:event_TabTransaksiMouseClicked

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
            java.util.logging.Logger.getLogger(FStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FieldAlamat;
    private javax.swing.JTextField FieldID;
    private javax.swing.JTextField FieldNama;
    private javax.swing.JPasswordField FieldPass;
    private javax.swing.JTextField FieldTele;
    private javax.swing.JTextField FieldUser;
    private javax.swing.JButton HapusBtn;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JMenu TabAnggota;
    private javax.swing.JMenu TabBuku;
    private javax.swing.JMenu TabStaff;
    private javax.swing.JMenu TabTransaksi;
    private javax.swing.JTable TableStaff;
    private javax.swing.JButton TambahBtn;
    private javax.swing.JButton UbahBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
