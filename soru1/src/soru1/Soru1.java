/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] dizi;
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutunu giriniz : ");
        dizi = new int[deger.nextInt()];
        System.out.println(dizi.length);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Lütfen dizinin " + (i + 1) + ". değerini giriniz : ");
            dizi[i] = deger.nextInt();
        }
        System.out.println("Girmiş olduğunuz dizi elemanları:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println("dizim[" + i + "]=" + dizi[i]);
        }
        System.out.print("Diziye eklenecek değeri giriniz:");
        int girilensayi = deger.nextInt();
        System.out.print("Bu değer dizinin hangi indisine eklensin?:");
        int nereye = deger.nextInt();
        System.out.println("Eklemeden sonra dizinin elemanları:");
        ekle(girilensayi, nereye, dizi);
    }

    public static void ekle(int girilen, int nereye, int[] dizim) {
        int[] dizi1 = new int[dizim.length + 1];
        for (int i = 0; i < nereye; i++) 
        {
            dizi1[i]=dizim[i];
        }
        dizi1[nereye]=girilen;
        for (int i = nereye; i < dizim.length; i++) 
        {
            dizi1[i+1]=dizim[i];
        }
        for (int i = 0; i < dizi1.length; i++) {
            System.out.println("dizim["+i+"]="+dizi1[i]);
        }
    }
    
}
