import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankAzakAnaEkran extends JFrame {
    private JButton GirisButon;
    private JButton KayitButon;
    private JLabel BackGround;
    
    public BankAzakAnaEkran() {
        KayitButon = new JButton();
        GirisButon = new JButton();
        BackGround = new JLabel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BankAzak");

        BackGround.setIcon(new ImageIcon(getClass().getResource("/bankazak.png")));
        BackGround.setText("");
        //add(BackGround);
        
        KayitButon.setFont(new Font("Tahoma", 0, 14));
        KayitButon.setText("Kayıt Ol");
        //add(KayitButon);
        
        GirisButon.setFont(new Font("Tahoma", 0, 14));
        GirisButon.setText("Giriş Yap");
        //add(GirisButon);
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(KayitButon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(GirisButon, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
                .addComponent(BackGround, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(KayitButon, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addComponent(GirisButon, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
            .addComponent(BackGround, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)  
        );
        
        KayitButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                BankAzakKayit bak=new BankAzakKayit();
                bak.setSize(500, 600);
                bak.setResizable(false);
                bak.setVisible(true);
            }
        });
        
        GirisButon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                dispose();
                BankAzakGiris bag=new BankAzakGiris();
                bag.setSize(320, 160);
                bag.setResizable(false);
                bag.setVisible(true);
            }
        });
    }
    
    public static void main(String[] args) {
        BankAzakAnaEkran ba = new BankAzakAnaEkran();
        
        ba.setSize(500, 350);
        ba.setResizable(false);
        ba.setVisible(true);
        
        
    }
    
}
