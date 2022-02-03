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
public interface PersonelIslemler{
    public void krediOnay(String musteriTC,String neden,String faiz,String miktar);
    public void kartOnay(String musteriNo,String KartNo);
}
