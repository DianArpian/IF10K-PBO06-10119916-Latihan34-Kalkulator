/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan34.kalkulator;

/**
 *
 * @author DIAN
 */
public class Kalkulator {
      public double jumlah, value1, value2;
    
    public void tambahBilangan() {
        jumlah = value1 + value2;
        System.out.print(jumlah);
    }
    
    public void kurangBilangan() {
        jumlah = value1 - value2;
        System.out.print(jumlah);
    }
    
    public void kaliBilangan() {
        jumlah = value1 * value2;
        System.out.print(jumlah);
    }
    
    public void bagiBilangan() {
        jumlah = value1 / value2;
        System.out.print(String.format("%.2f" , jumlah));
    }
    
    public void sisaBilangan() {
        jumlah = value1 % value2;
        System.out.print(jumlah);
    }
}

