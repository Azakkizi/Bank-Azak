import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

interface IYillikFaiz {
    static final float FAIZ=15.35f;
}
interface IAsgariTutarOrani {
    static final float ORAN=0.2f;
}
abstract class IDTutucu {
    static final int MUID = 1; //Müdür ID = 1
    static int MEID = 2; //Memur ID 2'den başlıyor, giderek artacak
    static int MID = 100; //En fazla 99 çalışan oluşturulabilir, Müşteri ID 100'den başlıyor, giderek artacak
}
abstract class Kullanici {
    private int ID;
    private String parola;
    private String ad;
    private String soyad;
    private Adres adres;
    private String telefon;
    private String eposta;
    private String TCKN;
    private Tarih dt;

    public Kullanici(int ID, String parola, String ad, String soyad, Adres adres, String telefon, String eposta, String TCKN, Tarih dt) {
        this.ID = ID;
        this.parola = parola;
        this.ad = ad;
        this.soyad = soyad;
        this.adres = adres;
        this.telefon = telefon;
        this.eposta = eposta;
        this.TCKN = TCKN;
        this.dt = dt;
    }

    public int getID() {
        return ID;
    }
    public String getParola() {
        return parola;
    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public Adres getAdres() {
        return adres;
    }
    public String getTel() {
        return telefon;
    }
    public String getTCKN() {
        return TCKN;
    }
    public String getEposta() {
        return eposta;
    }
    public Tarih getDT() {
        return dt;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setParola(String parola) {
        this.parola = parola;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    public void setTel(String telefon) {
        this.telefon = telefon;
    }
    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
    public void setTCKN(String TCKN) {
        this.TCKN = TCKN;
    }
    public void setDT(Tarih dt) {
        this.dt = dt;
    }
} //end of Class Kullanici

class Musteri extends Kullanici {
    private Hesap hesap;
    private KrediKarti kk;

    public Musteri(int ID, String parola, String ad, String soyad, Adres adres, String telefon, String eposta, String TCKN, Tarih dt, Hesap hesap, KrediKarti kk) {
        super(ID,parola,ad,soyad,adres,telefon,eposta,TCKN,dt);
        this.hesap = hesap;
        this.kk=kk;
    }
    
    public Hesap getHesap() {
        return hesap;
    }
    public KrediKarti getKK() {
        return kk;
    }
    public void setHesap(Hesap hesap) {
        this.hesap = hesap;
    }
    public void setKK(KrediKarti kk) {
        this.kk = kk;
    }
} //end of Class Musteri

interface Calisan {
    public void cikar(File kisi, String path);
}

class Mudur extends Kullanici implements Calisan {

    public Mudur(int ID, String parola, String ad, String soyad, Adres adres, String telefon, String eposta, String TCKN, Tarih dt) {
        super(ID, parola, ad, soyad, adres, telefon, eposta, TCKN, dt);
    }
    @Override
    public void cikar(File memur, String path) {
        try {
            Files.delete(Paths.get(path));
            JOptionPane.showMessageDialog(null, "Memur silindi.");
        }
        catch (IOException ex) {
            Logger.getLogger(Memur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Memur extends Kullanici implements Calisan {

    public Memur(int ID, String parola, String ad, String soyad, Adres adres, String telefon, String eposta, String TCKN, Tarih dt) {
        super(ID, parola, ad, soyad, adres, telefon, eposta, TCKN, dt);
    }
    @Override
    public void cikar(File musteri, String path) {
        try {
            Files.delete(Paths.get(path));
            JOptionPane.showMessageDialog(null, "Müşteri silindi.");
        }
        catch (IOException ex) {
            Logger.getLogger(Memur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Hesap {
    private String hesapNo;
    private int bakiye;

    public Hesap(String hesapNo, int bakiye) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }
    
    public String getHesapNo() {
        return hesapNo;
    }
    public int getBakiye() {
        return bakiye;
    }
    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }
    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
} //end of Class Hesap

class KrediKarti {
    private String kkNo;
    private int limit;
    private int borc;
    private boolean otoOdeme=false; //Default olarak false

    public KrediKarti(String kkNo, int limit, int borc) {
        this.kkNo = kkNo;
        this.limit = limit;
        this.borc = borc;
    }

    public String getKkNo() {
        return kkNo;
    }
    public int getLimit() {
        return limit;
    }
    public int getBorc() {
        return borc;
    }
    public boolean ifOtoOdeme() {
        return otoOdeme;
    }
    public void setKkNo(String kkNo) {
        this.kkNo = kkNo;
    }
    public void setLimit(int limit) {
        this.limit = limit;
    }
    public void setBorc(int borc) {
        this.borc = borc;
    }
    public void setOtoOdeme(String s) {
        if (s.equals("Evet")) this.otoOdeme=true;
        else this.otoOdeme=false;
    }
} //end of Class KrediKarti

class Adres {
    private String il;
    private String ilce;
    private String mahalle;
    private String cadde;
    private String sokak;
    private String aptNo;
    private String daireNo;

    public Adres(String il, String ilce, String mahalle, String cadde, String sokak, String aptNo, String daireNo) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.sokak = sokak;
        this.aptNo = aptNo;
        this.daireNo = daireNo;
    }
    
    public String getIl() {
        return il;
    }
    public String getIlce() {
        return ilce;
    }
    public String getMahalle() {
        return mahalle;
    }
    public String getCadde() {
        return cadde;
    }
    public String getSokak() {
        return sokak;
    }
    public String getAptNo() {
        return aptNo;
    }
    public String getDaireNo() {
        return daireNo;
    }
    public void setIl(String il) {
        this.il = il;
    }
    public void setIlce(String ilce) {
        this.ilce = ilce;
    }
    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }
    public void setCadde(String cadde) {
        this.cadde = cadde;
    }
    public void setSokak(String sokak) {
        this.sokak = sokak;
    }
    public void setAptNo(String aptNo) {
        this.aptNo = aptNo;
    }
    public void setDaireNo(String daireNo) {
        this.daireNo = daireNo;
    }
} //end of Class Adres

class Tarih {
    private String gun;
    private String ay;
    private String yil;

    public Tarih(String gun, String ay, String yil) {
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
    }
    
    public String getYil() {
        return yil;
    }
    public String getAy() {
        return ay;
    }
    public String getGun() {
        return gun;
    }
    public void setYil(String yil) {
        this.yil = yil;
    }
    public void setAy(String ay) {
        this.ay = ay;
    }
    public void setGun(String gun) {
        this.gun = gun;
    }
} //end of Class Tarih

class RandomNumberGenerator {
    public static String Generate(Object o){
        String sonuc=null;
        if (o instanceof Hesap) {
            sonuc = String.valueOf((int)(Math.random() * (9999999 - 1000000)) + 1000000);
        }
        else if (o instanceof KrediKarti) {
            sonuc = String.valueOf(74001205);
            sonuc += (String.valueOf((int)(Math.random() * (99999999 - 10000000)) + 10000000));
        }
        return sonuc;
    }
}

public class BankAzak {
    public static void main(String[] args) {
    }
}
