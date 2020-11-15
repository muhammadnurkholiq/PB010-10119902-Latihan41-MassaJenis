/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Massa Jenis
 * 
 */

public class PB01010119902Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus objK = new Kubus();
        System.out.println("==== Massa Jenis Kubus====");
        objK.setSisi(5);
        objK.setMassa(250);
        System.out.println("Sisi : " + objK.getSisi());
        System.out.println("Massa : " + objK.getMassa());
        System.out.println("");
        System.out.println("==== Hasil Perhitungan====");
        System.out.println("Volume : " + objK.hitungVolume(0));
        System.out.println("Massa Jenis : " + objK.hitungMassaJenis(0, 0));
    }
    
}