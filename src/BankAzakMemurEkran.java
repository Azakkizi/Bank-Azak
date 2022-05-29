import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BankAzakMemurEkran extends javax.swing.JFrame {

    public BankAzakMemurEkran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        musteriSilmeLabel = new javax.swing.JLabel();
        musteriTCField = new javax.swing.JTextField();
        silButon = new javax.swing.JButton();
        cikisButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankAzak Memur Hesabı");
        setResizable(false);

        musteriSilmeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        musteriSilmeLabel.setText("Silmek istediğiniz müşterinin TC Kimlik Numarasını giriniz:");

        musteriTCField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(musteriSilmeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(musteriTCField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(silButon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cikisButon)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(musteriSilmeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musteriTCField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(silButon)
                    .addComponent(cikisButon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cikisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisButonActionPerformed
        dispose();
        BankAzakAnaEkran ba = new BankAzakAnaEkran();
        ba.setVisible(true);
        ba.setSize(500, 350);
        ba.setResizable(false);
    }//GEN-LAST:event_cikisButonActionPerformed

    private void silButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButonActionPerformed
        File musteri = new File(musteriTCField.getText()+".txt");
        if (!musteri.exists()) {
            JOptionPane.showMessageDialog(null, "Girdiğiniz TC Kimlik Numarasına sahip müşteri bulunamadı.");
        }
        else {
            FileReader myFR = null;
            try {
                myFR = new FileReader(musteri);
            }
            catch (FileNotFoundException ex) {
                Logger.getLogger(BankAzakMemurEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader myBR = new BufferedReader(myFR);
            String musteriSorgu;
            try {
                while ((musteriSorgu = myBR.readLine())  != null) {
                    if (musteriSorgu.equals("tip_musteri")) {
                        Memur m=new Memur(0, null, null, null, null, null, null, null, null);
                        m.cikar(musteri, musteriTCField.getText()+".txt");
                        break;
                    }
                }
            } 
            catch (IOException ex) {
                Logger.getLogger(BankAzakMemurEkran.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_silButonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAzakMemurEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cikisButon;
    private javax.swing.JLabel musteriSilmeLabel;
    private javax.swing.JTextField musteriTCField;
    private javax.swing.JButton silButon;
    // End of variables declaration//GEN-END:variables
}
