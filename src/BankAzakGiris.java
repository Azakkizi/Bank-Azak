import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BankAzakGiris extends javax.swing.JFrame {

    public BankAzakGiris() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tcLabel = new javax.swing.JLabel();
        tcField = new javax.swing.JTextField();
        parolaLabel = new javax.swing.JLabel();
        parolaField = new javax.swing.JPasswordField();
        girisButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Giriş");
        setResizable(false);

        tcLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcLabel.setText("TC Kimlik Numaranız:");

        tcField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        parolaLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        parolaLabel.setText("Parola:");

        parolaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        girisButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        girisButon.setText("Giriş Yap");
        girisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(parolaLabel)
                            .addComponent(tcLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(parolaField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(girisButon)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcLabel)
                    .addComponent(tcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parolaLabel)
                    .addComponent(parolaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(girisButon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void girisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButonActionPerformed
        String tc = tcField.getText();
        File hesap = new File(tc+".txt");
        if (!hesap.exists()) {
            JOptionPane.showMessageDialog(null, "Bu TC Kimlik Numarası ile kayıt bulunamadı.");
        }
        else {
            FileReader myFR = null;
            try {
                myFR = new FileReader(hesap);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(BankAzakGiris.class.getName()).log(Level.SEVERE, null, ex);
            }
            BufferedReader myBR = new BufferedReader(myFR);
            String parola=null;
            try {
                parola = myBR.readLine();
            } catch (IOException ex) {
                Logger.getLogger(BankAzakGiris.class.getName()).log(Level.SEVERE, null, ex);
            }
            String tip;
            if (parolaField.getText().equals(parola)) {
                try {
                    while ((tip = myBR.readLine())  != null) {
                        switch (tip) {
                            case "tip_musteri":
                                dispose();
                                BankAzakMusteriEkran bamuse = new BankAzakMusteriEkran();
                                infoOku(hesap, bamuse);
                                bamuse.setVisible(true);
                                break;
                            case "tip_mudur":
                                dispose();
                                BankAzakMudurEkran bamue = new BankAzakMudurEkran();
                                bamue.setVisible(true);
                                break;
                            case "tip_memur":
                                dispose();
                                BankAzakMemurEkran bamee = new BankAzakMemurEkran();
                                bamee.setVisible(true);
                                break;
                            default:
                                break;
                        }
                    }
                }
                catch (IOException ex) {
                    Logger.getLogger(BankAzakGiris.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
            else {
                JOptionPane.showMessageDialog(null, "Parola hatalı!");
            }
        }
    }//GEN-LAST:event_girisButonActionPerformed

    public void infoOku(File file, BankAzakMusteriEkran bamuse) throws FileNotFoundException, NumberFormatException, IOException {
        FileReader myFR = new FileReader(file);
        BufferedReader myBR = new BufferedReader(myFR);
        String info;
        String musteriId = null;
        String musteriAd = "Boş";
        String musteriSoyad = "Boş";
        String musteriMh = "Boş";
        String musteriCd = "Boş";
        String musteriSk = "Boş";
        String musteriAptDr = "Boş";
        String musteriSehir = "Boş";
        String musteriTel = "Boş";
        String musteriEmail = "Boş";
        String musteriTC = "Boş";
        String musteriDT = "Boş";
        String musteriHesapNo = "0";
        String musteriBakiye = "0";
        String musteriKKNo = "0";
        String musteriLimit = "0";
        String musteriBorc = "0";
        while ((info = myBR.readLine()) != null) {
            String[] tag = info.split(":");
            switch (tag[0]) {
                case "idsi":
                    musteriId = tag[1];
                    break;
                case "adi":
                    musteriAd = tag[1];
                    break;
                case "soyadi":
                    musteriSoyad = tag[1];
                    break;
                case "adresimh":
                    musteriMh = tag[1];
                    break;
                case "adresicd":
                    musteriCd = tag[1];
                    break;
                case "adresisk":
                    musteriSk = tag[1];
                    break;
                case "adresiaptdr":
                    musteriAptDr = tag[1];
                    break;
                case "adresisehir":
                    musteriSehir = tag[1];
                    break;
                case "teli":
                    musteriTel = tag[1];
                    break;
                case "emaili":
                    musteriEmail = tag[1];
                    break;
                case "tcsi":
                    musteriTC = tag[1];
                    break;
                case "dtsi":
                    musteriDT = tag[1];
                    break;
                case "hesapnosu":
                    musteriHesapNo = tag[1];
                    break;
                case "bakiyesi":
                    musteriBakiye = tag[1];
                    break;
                case "kknosu":
                    musteriKKNo = tag[1];
                    break;
                case "limiti":
                    musteriLimit = tag[1];
                    break;
                case "borcu":
                    musteriBorc = tag[1];
                    break;
                default:
                    break;
            } 
        }
        bamuse.idField.setText(musteriId);
        bamuse.adField.setText(musteriAd);
        bamuse.soyadField.setText(musteriSoyad);
        bamuse.adresArea.setText(musteriMh+"\n"+musteriCd+"\n"+musteriSk+"\n"+musteriAptDr+"\n"+musteriSehir);
        bamuse.telField.setText(musteriTel);
        bamuse.epostaField.setText(musteriEmail);
        bamuse.tcField.setText(musteriTC);
        bamuse.dtField.setText(musteriDT);
        bamuse.hesapNoField.setText(musteriHesapNo);
        bamuse.bakiyeField.setText(musteriBakiye+" TL");
        bamuse.kkNoField.setText(musteriKKNo);
        bamuse.tLimitField.setText(musteriLimit+" TL");
        bamuse.dBorcuField.setText(musteriBorc+" TL");
        bamuse.kLimitField.setText(String.valueOf(Integer.parseInt(musteriLimit)-Integer.parseInt(musteriBorc))+" TL");
        bamuse.asgariField.setText(String.valueOf(Integer.parseInt(musteriBorc)*IAsgariTutarOrani.ORAN)+" TL");
        bamuse.asgariOranField.setText("%"+String.valueOf(100*IAsgariTutarOrani.ORAN));
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAzakGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisButon;
    private javax.swing.JPasswordField parolaField;
    private javax.swing.JLabel parolaLabel;
    private javax.swing.JTextField tcField;
    private javax.swing.JLabel tcLabel;
    // End of variables declaration//GEN-END:variables
}
