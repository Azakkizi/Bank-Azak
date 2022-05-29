import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class BankAzakKayit extends JFrame {
    
    private JLabel aaLabel;
    private JLabel adLabel;
    private JLabel adresLabel;
    private JLabel aptLabel;
    private JLabel cdLabel;
    private JLabel daireLabel;
    private JLabel dtLabel;
    private JLabel epostaLabel;
    private JLabel ggLabel;
    private JLabel ilLabel;
    private JLabel ilceLabel;
    private JLabel mhLabel;
    private JLabel skLabel;
    private JLabel soyadLabel;
    private JLabel tcLabel;
    private JLabel telLabel;
    private JLabel uyariLabel;
    private JLabel yyLabel;
    private JLabel parolaLabel1;
    private JLabel parolaLabel2;
    private JTextField aaField;
    private JTextField adField;
    private JTextField aptField;
    private JTextField daireField;
    private JTextField cdField;
    private JTextField epostaField;
    private JTextField ggField;
    private JTextField ilField;
    private JTextField ilceField;
    private JTextField mhField;
    private JTextField skField;
    private JTextField soyadField;
    private JTextField tcField;
    private JTextField telField;
    private JTextField yyField;
    private JPasswordField parolaField1;
    private JPasswordField parolaField2;    
    private JButton kayitButon;
    private JComboBox<String> kullaniciTipBox;
    
    public BankAzakKayit() {
        
        setPreferredSize(new Dimension(500, 600));
        setTitle("Kayıt");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        uyariLabel = new JLabel();
        adLabel = new JLabel();
        soyadLabel = new JLabel();
        tcLabel = new JLabel();
        dtLabel = new JLabel();
        ggLabel = new JLabel();
        aaLabel = new JLabel();
        yyLabel = new JLabel();
        telLabel = new JLabel();
        epostaLabel = new JLabel();
        adresLabel = new JLabel();
        ilLabel = new JLabel();
        ilceLabel = new JLabel();
        mhLabel = new JLabel();
        cdLabel = new JLabel();
        skLabel = new JLabel();
        aptLabel = new JLabel();
        daireLabel = new JLabel();
        parolaLabel1 = new JLabel();
        parolaLabel2 = new JLabel();
        adField = new JTextField();
        soyadField = new JTextField();
        tcField = new JTextField();
        ggField = new JTextField();
        aaField = new JTextField();
        yyField = new JTextField();
        telField = new JTextField();
        epostaField = new JTextField();
        ilField = new JTextField();
        ilceField = new JTextField();
        mhField = new JTextField();
        cdField = new JTextField();
        skField = new JTextField();
        aptField = new JTextField();
        daireField = new JTextField();
        parolaField1 = new JPasswordField();
        parolaField2 = new JPasswordField();
        kayitButon = new JButton();
        kullaniciTipBox = new JComboBox<>();

        adLabel.setFont(new Font("Tahoma", 0, 14));
        adLabel.setText("Adınız:");

        soyadLabel.setFont(new Font("Tahoma", 0, 14));
        soyadLabel.setText("Soyadınız:");

        tcLabel.setFont(new Font("Tahoma", 0, 14));
        tcLabel.setText("T.C. Kimlik No:");

        dtLabel.setFont(new Font("Tahoma", 0, 14));
        dtLabel.setText("Doğum Tarihiniz:");

        ggLabel.setText("GG");

        aaLabel.setText("AA");

        yyLabel.setText("YYYY");

        telLabel.setFont(new Font("Tahoma", 0, 14));
        telLabel.setText("Telefon:");

        epostaLabel.setFont(new Font("Tahoma", 0, 14));
        epostaLabel.setText("E-posta:");

        adresLabel.setText("Adres Bilgileriniz");

        ilLabel.setFont(new Font("Tahoma", 0, 14));
        ilLabel.setText("İl:");

        ilceLabel.setFont(new Font("Tahoma", 0, 14));
        ilceLabel.setText("İlçe:");

        mhLabel.setFont(new Font("Tahoma", 0, 14));
        mhLabel.setText("Mahalle:");

        cdLabel.setFont(new Font("Tahoma", 0, 14));
        cdLabel.setText("Cadde:");
        cdLabel.setToolTipText("Yoksa boş bırakabilirsiniz.");

        skLabel.setFont(new Font("Tahoma", 0, 14));
        skLabel.setText("Sokak:");

        aptLabel.setText("Apartman No:");

        daireLabel.setText("Daire No:");

        adField.setFont(new Font("Tahoma", 0, 14));
        adField.setMinimumSize(new Dimension(200, 25));
        adField.setPreferredSize(new Dimension(200, 25));
        
        soyadField.setFont(new Font("Tahoma", 0, 14));
        soyadField.setMinimumSize(new Dimension(200, 25));
        soyadField.setPreferredSize(new Dimension(200, 25));

        tcField.setFont(new Font("Tahoma", 0, 14));
        tcField.setMinimumSize(new Dimension(200, 25));
        tcField.setPreferredSize(new Dimension(200, 25));
        
        ggField.setFont(new Font("Tahoma", 0, 14));
        ggField.setMinimumSize(new Dimension(75, 25));
        ggField.setPreferredSize(new Dimension(75, 25));

        aaField.setFont(new Font("Tahoma", 0, 14));
        aaField.setMinimumSize(new Dimension(75, 25));
        aaField.setPreferredSize(new Dimension(75, 25));

        yyField.setFont(new Font("Tahoma", 0, 14));
        yyField.setMinimumSize(new Dimension(75, 25));
        yyField.setPreferredSize(new Dimension(75, 25));

        telField.setFont(new Font("Tahoma", 0, 14));
        telField.setMinimumSize(new Dimension(200, 25));
        telField.setPreferredSize(new Dimension(200, 25));

        epostaField.setFont(new Font("Tahoma", 0, 14));
        epostaField.setMinimumSize(new Dimension(200, 25));
        epostaField.setPreferredSize(new Dimension(200, 25));

        ilField.setFont(new Font("Tahoma", 0, 14));
        ilField.setMinimumSize(new Dimension(200, 25));
        ilField.setPreferredSize(new Dimension(200, 25));

        ilceField.setFont(new Font("Tahoma", 0, 14));
        ilceField.setMinimumSize(new Dimension(200, 25));
        ilceField.setPreferredSize(new Dimension(200, 25));

        mhField.setFont(new Font("Tahoma", 0, 14));
        mhField.setMinimumSize(new Dimension(200, 25));
        mhField.setPreferredSize(new Dimension(200, 25));

        cdField.setFont(new Font("Tahoma", 0, 14));
        cdField.setMinimumSize(new Dimension(200, 25));
        cdField.setPreferredSize(new Dimension(200, 25));

        skField.setFont(new Font("Tahoma", 0, 14));
        skField.setMinimumSize(new Dimension(200, 25));
        skField.setPreferredSize(new Dimension(200, 25));

        aptField.setFont(new Font("Tahoma", 0, 14));
        aptField.setMinimumSize(new Dimension(75, 25));
        aptField.setPreferredSize(new Dimension(75, 25));

        daireField.setFont(new Font("Tahoma", 0, 14));
        daireField.setMinimumSize(new Dimension(75, 25));
        daireField.setPreferredSize(new Dimension(75, 25));
        
        parolaLabel1.setFont(new Font("Tahoma", 0, 14));
        parolaLabel1.setText("Parola:");

        parolaField1.setFont(new Font("Tahoma", 0, 14));
        parolaField1.setName("");

        parolaLabel2.setFont(new Font("Tahoma", 0, 14));
        parolaLabel2.setText("Parola Tekrar:");

        parolaField2.setFont(new Font("Tahoma", 0, 14));
        parolaField2.setName("");      

        kayitButon.setFont(new Font("Tahoma", 0, 14));
        kayitButon.setText("Kayıt Ol");
        
        kullaniciTipBox.setFont(new Font("Tahoma", 0, 14));
        kullaniciTipBox.setModel(new DefaultComboBoxModel<>(new String[] { "Kullanıcı seçiniz", "Müşteri", "Memur", "Müdür" }));
        
        uyariLabel.setText("*Lütfen tüm bilgileri eksiksiz giriniz*");
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(aptLabel)
                                .addComponent(mhLabel)
                                .addComponent(ilceLabel)
                                .addComponent(ilLabel)
                                .addComponent(telLabel)
                                .addComponent(dtLabel)
                                .addComponent(soyadLabel)
                                .addComponent(adLabel)
                                .addComponent(tcLabel)
                                .addComponent(adresLabel)
                                .addComponent(epostaLabel)
                                .addComponent(cdLabel)
                                .addComponent(skLabel)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(kullaniciTipBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(parolaLabel2)
                            .addComponent(parolaLabel1))))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(kayitButon)
                            .addComponent(adField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(soyadField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tcField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ggLabel)
                                .addGap(18, 18, 18)
                                .addComponent(aaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(yyLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ggField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aaField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yyField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
                            .addComponent(telField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(epostaField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ilField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ilceField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mhField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cdField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(aptField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(daireLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(daireField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                            .addComponent(skField, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(parolaField1)
                            .addComponent(parolaField2))
                        .addContainerGap(90, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uyariLabel)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(uyariLabel)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(adField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(adLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kullaniciTipBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(soyadLabel)
                    .addComponent(soyadField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tcLabel)
                    .addComponent(tcField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(ggLabel, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(aaLabel)
                        .addComponent(yyLabel)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(dtLabel)
                    .addComponent(ggField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(aaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(yyField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(telLabel)
                    .addComponent(telField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(epostaLabel)
                    .addComponent(epostaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adresLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ilLabel)
                    .addComponent(ilField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(ilceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ilceLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(mhField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(mhLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(skField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(skLabel))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(aptField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(daireLabel)
                    .addComponent(aptLabel)
                    .addComponent(daireField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(parolaLabel1)
                    .addComponent(parolaField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(parolaLabel2)
                    .addComponent(parolaField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(kayitButon)
                .addContainerGap())
        );
        
        kayitButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                if (!(parolaField1.getText().equals(parolaField2.getText()))) {
                    JOptionPane.showMessageDialog(null, "Parolanız eşleşmiyor!");
                }
                else {
                    switch (kullaniciTipBox.getSelectedIndex()) {
                        case 0:
                            JOptionPane.showMessageDialog(null,"Lütfen kullanıcı tipi seçiniz.");
                            break;
                        case 1:
                            File musteriFile = new File(tcField.getText()+".txt");
                            if (musteriFile.exists()) {
                                JOptionPane.showMessageDialog(null, "Aynı TC Kimlik Numarası ile başka kayıt bulunmaktadır.");
                                tcField.setText("");
                                break;
                            }
                            else {
                                //YENİ MÜŞTERİ OLUŞTURMA
                                
                                //Müşteri ekranında daha gerçekçi bir görüntü için
                                int bakiye = Integer.parseInt(JOptionPane.showInputDialog("Hesap bakiyenizi giriniz."));
                                int limit = Integer.parseInt(JOptionPane.showInputDialog("Kredi kartı limitinizi giriniz."));
                                int borc = Integer.parseInt(JOptionPane.showInputDialog("Dönem borcunuzu giriniz."));
                                
                                Musteri musteri = new Musteri(IDTutucu.MID,
                                        parolaField1.getText(),
                                        adField.getText(),
                                        soyadField.getText(),
                                        new Adres(ilField.getText(),
                                                ilceField.getText(),
                                                mhField.getText(),
                                                cdField.getText(),
                                                skField.getText(),
                                                aptField.getText(),
                                                daireField.getText()),
                                        telField.getText(),
                                        epostaField.getText(),
                                        tcField.getText(),
                                        new Tarih(ggField.getText(),
                                                aaField.getText(),
                                                yyField.getText()),
                                        new Hesap(RandomNumberGenerator.Generate(new Hesap(null,0)),bakiye),
                                        new KrediKarti(RandomNumberGenerator.Generate(new KrediKarti(null,0,0)),limit,borc));
                                //BİLGİLERİ DOSYAYA YAZMAK İÇİN STRING'E TOPLAMA
                                String musteriInfo = musteri.getParola()+"\n"+
                                        "tip_musteri\n"+
                                        "idsi:"+musteri.getID()+"\n"+
                                        "adi:"+musteri.getAd()+"\n"+
                                        "soyadi:"+musteri.getSoyad()+"\n"+
                                        "adresimh:"+musteri.getAdres().getMahalle()+" Mh.\n"+
                                        "adresicd:"+musteri.getAdres().getCadde()+" Cd.\n"+
                                        "adresisk:"+musteri.getAdres().getSokak()+" Sk.\n"+
                                        "adresiaptdr:"+musteri.getAdres().getAptNo()+"/"+
                                        musteri.getAdres().getDaireNo()+"\n"+
                                        "adresisehir:"+musteri.getAdres().getIlce()+"/"+
                                        musteri.getAdres().getIl()+"\n"+
                                        "teli:"+musteri.getTel()+"\n"+
                                        "emaili:"+musteri.getEposta()+"\n"+
                                        "tcsi:"+musteri.getTCKN()+"\n"+
                                        "dtsi:"+musteri.getDT().getGun()+"/"+
                                        musteri.getDT().getAy()+"/"+
                                        musteri.getDT().getYil()+"\n"+
                                        "hesapnosu:"+musteri.getHesap().getHesapNo()+"\n"+
                                        "bakiyesi:"+musteri.getHesap().getBakiye()+"\n"+
                                        "kknosu:"+musteri.getKK().getKkNo()+"\n"+
                                        "limiti:"+musteri.getKK().getLimit()+"\n"+
                                        "borcu:"+musteri.getKK().getBorc()+"\nEOF";
                                //BİLGİLERİ DOSYAYA YAZMA
                                try {
                                    musteriFile.createNewFile();
                                    FileWriter myFW = new FileWriter(musteriFile,true);
                                    BufferedWriter myBW = new BufferedWriter(myFW);
                                    myBW.write(musteriInfo);
                                    myBW.close();
                                }
                                catch (IOException ex) {
                                    Logger.getLogger(BankAzakKayit.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                //Bir sonraki müşteri ID için 1 arttır
                                IDTutucu.MID++;
                                JOptionPane.showMessageDialog(null, "Kaydınız yapılmıştır.");
                                dispose();

                                BankAzakAnaEkran ba = new BankAzakAnaEkran();
                                ba.setVisible(true);
                                ba.setSize(500, 350);
                                ba.setResizable(false);
                                break;
                            }
                        case 2:
                            File memurFile = new File(tcField.getText()+".txt");
                            if (memurFile.exists()) {
                                JOptionPane.showMessageDialog(null, "Aynı TC Kimlik Numarası ile başka kayıt bulunmaktadır.");
                                tcField.setText("");
                                break;
                            }
                            else {
                                //YENİ MEMUR OLUŞTURMA
                                Memur memur = new Memur(IDTutucu.MEID,
                                        parolaField1.getText(),
                                        adField.getText(),
                                        soyadField.getText(),
                                        new Adres(ilField.getText(),
                                                ilceField.getText(),
                                                mhField.getText(),
                                                cdField.getText(),
                                                skField.getText(),
                                                aptField.getText(),
                                                daireField.getText()),
                                        telField.getText(),
                                        epostaField.getText(),
                                        tcField.getText(),
                                        new Tarih(ggField.getText(),
                                                aaField.getText(),
                                                yyField.getText()));
                                //BİLGİLERİ DOSYAYA YAZMAK İÇİN STRING'E TOPLAMA
                                String memurInfo = memur.getParola()+"\n"+
                                        "tip_memur\n"+
                                        memur.getID()+"\n"+
                                        memur.getAd()+"\n"+
                                        memur.getSoyad()+"\n"+
                                        memur.getAdres().getMahalle()+", "+
                                        memur.getAdres().getCadde()+", "+
                                        memur.getAdres().getSokak()+", "+
                                        memur.getAdres().getAptNo()+"/"+
                                        memur.getAdres().getDaireNo()+" "+
                                        memur.getAdres().getIlce()+"/"+
                                        memur.getAdres().getIl()+"\n"+
                                        memur.getTel()+"\n"+
                                        memur.getEposta()+"\n"+
                                        memur.getTCKN()+"\n"+
                                        memur.getDT().getGun()+"/"+
                                        memur.getDT().getAy()+"/"+
                                        memur.getDT().getYil();
                                //BİLGİLERİ DOSYAYA YAZMA

                                try {
                                    memurFile.createNewFile();
                                    FileWriter myFW = new FileWriter(memurFile,true);
                                    BufferedWriter myBW = new BufferedWriter(myFW);
                                    myBW.write(memurInfo);
                                    myBW.close();
                                }
                                catch (IOException ex) {
                                    Logger.getLogger(BankAzakKayit.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                //Bir sonraki memur ID için 1 arttır
                                IDTutucu.MEID++;
                                
                                JOptionPane.showMessageDialog(null, "Kaydınız yapılmıştır.");
                                dispose();

                                BankAzakAnaEkran ba = new BankAzakAnaEkran();
                                ba.setVisible(true);
                                ba.setSize(500, 350);
                                ba.setResizable(false);
                                break;
                            }
                        case 3:
                            File mudurFile = new File("mudur.txt");
                            if (mudurFile.exists()) {
                                JOptionPane.showMessageDialog(null, "Sadece 1 adet müdür kaydı yapılmaktadır.");
                                break;
                            }
                            else {
                                //MÜDÜR OLUŞTURMA
                                Mudur mudur = new Mudur(IDTutucu.MUID,
                                        parolaField1.getText(),
                                        adField.getText(),
                                        soyadField.getText(),
                                        new Adres(ilField.getText(),
                                                ilceField.getText(),
                                                mhField.getText(),
                                                cdField.getText(),
                                                skField.getText(),
                                                aptField.getText(),
                                                daireField.getText()),
                                        telField.getText(),
                                        epostaField.getText(),
                                        tcField.getText(),
                                        new Tarih(ggField.getText(),
                                                aaField.getText(),
                                                yyField.getText()));
                                //BİLGİLERİ DOSYAYA YAZMAK İÇİN STRING'E TOPLAMA
                                String mudurInfo = mudur.getParola()+"\n"+
                                        "tip_mudur\n"+
                                        mudur.getID()+"\n"+
                                        mudur.getAd()+"\n"+
                                        mudur.getSoyad()+"\n"+
                                        mudur.getAdres().getMahalle()+", "+
                                        mudur.getAdres().getCadde()+", "+
                                        mudur.getAdres().getSokak()+", "+
                                        mudur.getAdres().getAptNo()+"/"+
                                        mudur.getAdres().getDaireNo()+" "+
                                        mudur.getAdres().getIlce()+"/"+
                                        mudur.getAdres().getIl()+"\n"+
                                        mudur.getTel()+"\n"+
                                        mudur.getEposta()+"\n"+
                                        mudur.getTCKN()+"\n"+
                                        mudur.getDT().getGun()+"/"+
                                        mudur.getDT().getAy()+"/"+
                                        mudur.getDT().getYil();
                                //BİLGİLERİ DOSYAYA YAZMA
                                try {
                                    mudurFile.createNewFile();
                                    FileWriter myFW = new FileWriter(mudurFile,true);
                                    BufferedWriter myBW = new BufferedWriter(myFW);
                                    myBW.write(mudurInfo);
                                    myBW.close();
                                }
                                catch (IOException ex) {
                                    Logger.getLogger(BankAzakKayit.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                JOptionPane.showMessageDialog(null, "Kaydınız yapılmıştır.");
                                dispose();

                                BankAzakAnaEkran ba = new BankAzakAnaEkran();
                                ba.setVisible(true);
                                ba.setSize(500, 350);
                                ba.setResizable(false);
                                break;
                            }
                        default:
                            break;
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        BankAzakKayit bak=new BankAzakKayit();
        bak.setSize(500, 600);
        bak.setResizable(false);
        bak.setVisible(true);
    }
    
}
