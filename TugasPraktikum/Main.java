/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum;

/**
 *
 * @author W10
 */
public class Main {
  public static void main(String[] args) {
        // TODO code application logic here
        
        //membuat objek guru
        Guru pakGuru = new Guru("Bu Yanti", "Sejarah", 33, "1985023850050234");
        pakGuru.info();
        
        //membuat objek murid
        Murid murid = new Murid("Andin", "X RPL 1", 1, 16, "172398504");
        murid.info();
        
        //membuat objek karyawan
        Karyawan satpam = new Karyawan("Pak Munar", "Security", 38, "198057385420186");
        satpam.info();
        
    }  
}
