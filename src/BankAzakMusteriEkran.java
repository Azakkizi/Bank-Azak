public class BankAzakMusteriEkran extends javax.swing.JFrame {

    public BankAzakMusteriEkran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mbLabel = new javax.swing.JLabel();
        idLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        adresLabel = new javax.swing.JLabel();
        telLabel = new javax.swing.JLabel();
        epostaLabel = new javax.swing.JLabel();
        tcLabel = new javax.swing.JLabel();
        dtLabel = new javax.swing.JLabel();
        hbLabel = new javax.swing.JLabel();
        hesapNoLabel = new javax.swing.JLabel();
        bakiyeLabel = new javax.swing.JLabel();
        kkbLabel = new javax.swing.JLabel();
        kkNoLabel = new javax.swing.JLabel();
        tLimitLabel = new javax.swing.JLabel();
        kLimitLabel = new javax.swing.JLabel();
        dBorcuLabel = new javax.swing.JLabel();
        asgariLabel = new javax.swing.JLabel();
        asgariOranLabel = new javax.swing.JLabel();
        idField = new javax.swing.JLabel();
        adField = new javax.swing.JLabel();
        soyadField = new javax.swing.JLabel();
        adresArea = new javax.swing.JTextArea();
        telField = new javax.swing.JLabel();
        epostaField = new javax.swing.JLabel();
        tcField = new javax.swing.JLabel();
        dtField = new javax.swing.JLabel();
        hesapNoField = new javax.swing.JLabel();
        bakiyeField = new javax.swing.JLabel();
        kkNoField = new javax.swing.JLabel();
        tLimitField = new javax.swing.JLabel();
        kLimitField = new javax.swing.JLabel();
        dBorcuField = new javax.swing.JLabel();
        asgariField = new javax.swing.JLabel();
        asgariOranField = new javax.swing.JLabel();
        krediButon = new javax.swing.JButton();
        havaleButon = new javax.swing.JButton();
        eftButon = new javax.swing.JButton();
        cikisButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BankAzak Müşteri Hesabı");
        setResizable(false);

        mbLabel.setText("Müşteri Bilgileri:");

        idLabel.setText("ID:");

        adLabel.setText("Ad:");

        soyadLabel.setText("Soyad:");

        adresLabel.setText("Adres:");

        telLabel.setText("Telefon:");

        epostaLabel.setText("E-Posta:");

        tcLabel.setText("TC Kimlik No:");

        dtLabel.setText("Doğum Tarihi:");

        hbLabel.setText("Hesap Bilgileri:");

        hesapNoLabel.setText("Hesap No:");

        bakiyeLabel.setText("Bakiye:");

        kkbLabel.setText("Kredi Kartı Bilgileri:");

        kkNoLabel.setText("Kredi Kartı No:");

        tLimitLabel.setText("Toplam Limit:");

        kLimitLabel.setText("Kalan Limit:");

        dBorcuLabel.setText("Dönem Borcu:");

        asgariLabel.setText("Asgari Tutar:");

        asgariOranLabel.setText("Asgari Tutar Oranı:");

        adresArea.setEditable(false);
        adresArea.setBackground(new java.awt.Color(240, 240, 240));
        adresArea.setColumns(20);
        adresArea.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        adresArea.setRows(5);

        krediButon.setText("Kredi Çek");

        havaleButon.setText("Havale");

        eftButon.setText("EFT");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(epostaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(epostaField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tcLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dtLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dtField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(soyadLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soyadField))
                    .addComponent(mbLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(adresLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adresArea, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(krediButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(havaleButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eftButon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cikisButon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hbLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bakiyeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bakiyeField))
                            .addComponent(kkbLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tLimitLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tLimitField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kLimitLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kLimitField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hesapNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hesapNoField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kkNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kkNoField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dBorcuLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dBorcuField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asgariLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asgariField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(asgariOranLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(asgariOranField)))
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idLabel)
                            .addComponent(idField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adLabel)
                            .addComponent(adField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyadLabel)
                            .addComponent(soyadField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adresLabel)
                            .addComponent(adresArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telLabel)
                            .addComponent(telField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(epostaLabel)
                            .addComponent(epostaField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tcLabel)
                            .addComponent(tcField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dtLabel)
                            .addComponent(dtField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hesapNoLabel)
                            .addComponent(hesapNoField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bakiyeLabel)
                            .addComponent(bakiyeField))
                        .addGap(18, 18, 18)
                        .addComponent(kkbLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kkNoLabel)
                            .addComponent(kkNoField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tLimitLabel)
                            .addComponent(tLimitField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kLimitLabel)
                            .addComponent(kLimitField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dBorcuLabel)
                            .addComponent(dBorcuField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asgariLabel)
                            .addComponent(asgariField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(asgariOranLabel)
                            .addComponent(asgariOranField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(krediButon)
                            .addComponent(havaleButon)
                            .addComponent(eftButon)
                            .addComponent(cikisButon))))
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankAzakMusteriEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel adField;
    private javax.swing.JLabel adLabel;
    public javax.swing.JTextArea adresArea;
    private javax.swing.JLabel adresLabel;
    public javax.swing.JLabel asgariField;
    private javax.swing.JLabel asgariLabel;
    public javax.swing.JLabel asgariOranField;
    private javax.swing.JLabel asgariOranLabel;
    public javax.swing.JLabel bakiyeField;
    private javax.swing.JLabel bakiyeLabel;
    private javax.swing.JButton cikisButon;
    public javax.swing.JLabel dBorcuField;
    private javax.swing.JLabel dBorcuLabel;
    public javax.swing.JLabel dtField;
    private javax.swing.JLabel dtLabel;
    private javax.swing.JButton eftButon;
    public javax.swing.JLabel epostaField;
    private javax.swing.JLabel epostaLabel;
    private javax.swing.JButton havaleButon;
    private javax.swing.JLabel hbLabel;
    public javax.swing.JLabel hesapNoField;
    private javax.swing.JLabel hesapNoLabel;
    public javax.swing.JLabel idField;
    private javax.swing.JLabel idLabel;
    public javax.swing.JLabel kLimitField;
    private javax.swing.JLabel kLimitLabel;
    public javax.swing.JLabel kkNoField;
    private javax.swing.JLabel kkNoLabel;
    private javax.swing.JLabel kkbLabel;
    private javax.swing.JButton krediButon;
    private javax.swing.JLabel mbLabel;
    public javax.swing.JLabel soyadField;
    private javax.swing.JLabel soyadLabel;
    public javax.swing.JLabel tLimitField;
    private javax.swing.JLabel tLimitLabel;
    public javax.swing.JLabel tcField;
    private javax.swing.JLabel tcLabel;
    public javax.swing.JLabel telField;
    private javax.swing.JLabel telLabel;
    // End of variables declaration//GEN-END:variables
}
