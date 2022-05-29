import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BankAzakMudurEkran extends javax.swing.JFrame {

    public BankAzakMudurEkran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        memurSilmeLabel = new javax.swing.JLabel();
        memurTCField = new javax.swing.JTextField();
        silButon = new javax.swing.JButton();
        cikisButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankAzak Yönetici Hesabı");
        setResizable(false);

        memurSilmeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memurSilmeLabel.setText("Silmek istediğiniz memurun TC Kimlik Numarasını giriniz:");

        memurTCField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        silButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        silButon.setText("Sil");
        silButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButonActionPerformed(evt);
            }
        });

        cikisButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cikisButon.setText("Çıkış");
        cikisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(silButon)
                        .addGap(86, 86, 86)
                        .addComponent(cikisButon))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(memurSilmeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memurTCField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(memurSilmeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(memurTCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(silButon)
                    .addComponent(cikisButon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed
        
        File memur = new File(memurTCField.getText()+".txt");
        if (!memur.exists()) {
            JOptionPane.showMessageDialog(null, "Girdiğiniz TC Kimlik Numarasına sahip memur bulunamadı.");
        }
        else {
            FileReader myFR = null;
            try {
                myFR = new FileReader(memur);
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(BankAzakMudurEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader myBR = new BufferedReader(myFR);
            String memurSorgu;
            try {
                while ((memurSorgu = myBR.readLine())  != null) {
                    if (memurSorgu.equals("tip_memur")) {
                        Mudur m=new Mudur(0, null, null, null, null, null, null, null, null);
                        m.cikar(memur, memurTCField.getText()+".txt");
                        break;
                    }
                }
            } 
            catch (IOException ex) {
                Logger.getLogger(BankAzakMudurEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_silButonActionPerformed

    private void cikisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisButonActionPerformed
        dispose();
        BankAzakAnaEkran ba = new BankAzakAnaEkran();
        ba.setVisible(true);
        ba.setSize(500, 350);
        ba.setResizable(false);
    }//GEN-LAST:event_cikisButonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAzakMudurEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikisButon;
    private javax.swing.JLabel memurSilmeLabel;
    private javax.swing.JTextField memurTCField;
    private javax.swing.JButton silButon;
    // End of variables declaration//GEN-END:variables
}
