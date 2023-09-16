/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soru2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner deger=new Scanner(System.in);
        int []dizi=new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Lütfen dizinin "+i+" 'inci değerini giriniz.");
            dizi[i]=deger.nextInt();
        }      
        System.out.println(enKucuk(dizi));
        
    }
    public static int enKucuk(int[] dizi)
    {
        int kucuk =dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (kucuk>dizi[i]) {
               kucuk=dizi[i];
            }            
        }
        return kucuk;
    }
}
