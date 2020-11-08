/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan34.kalkulator;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Kalkulator
 */

public class PBO0610119916Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
        Kalkulator k = new Kalkulator();
        
        System.out.println("===Aplikasi Kalkulator Bilangan===");
        System.out.print("Masukkan Angka ke-1 : ");
        k.value1 = input.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        k.value2 = input.nextDouble();
        System.out.println();
        
        System.out.print("Hasil Pertambahan : ");
        k.tambahBilangan();
        System.out.println();
        
        System.out.print("Hasil Pengurangan : ");
        k.kurangBilangan();
        System.out.println();
        
        System.out.print("Hasil Perkalian : ");
        k.kaliBilangan();
        System.out.println();
        
        System.out.print("Hasil Pembagian : ");
        k.bagiBilangan();
        System.out.println();
      
        System.out.print("Hasil Sisa : ");
        k.sisaBilangan();
        System.out.println();
     
    }
    
}
