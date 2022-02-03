/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banka.otomasyonu;

/**
 *
 * @author Sirac
 */
public interface Islemler {
    public void kaydol(String isim, String soyisim, String TC, String telefonNo, String sifre, String mail);
    public String bakiyeOgren();
    public void paraCek(double miktar);
    public void paraYatır(double miktar);
    public void paraTransfer(double miktar,String IBAN2);
    public void faturaOde(double miktar);
    public void kartOluştur(Musteri yeniM,String kartIsim);
    public void krediBasvur(double miktar);
    public void krediOde(double miktar);
}
