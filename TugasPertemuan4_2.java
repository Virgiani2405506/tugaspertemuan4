/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan4_2;

/**
 *
 * @author LENOVO
 * TUGAS PERTEMUAN 4
 * NIM GENAP
 * NO.2
 */
import java.util.Scanner;
public class TugasPertemuan4_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas awal: ");
        int awal = input.nextInt();
        
        System.out.println("Masukkan batas akhir: ");
        int akhir = input.nextInt();
        
        System.out.println("Bilangan genap:");
        
        for(int i = awal; i <= akhir; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.printf("%d ", i);
        }
    }
}
