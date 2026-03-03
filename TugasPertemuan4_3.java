/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan4_3;

/**
 *
 * @author LENOVO
 * TUGAS PERTEMUAN 4
 * GENAP
 * NO.3
 */
import java.util.Scanner;
public class TugasPertemuan4_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan a: ");
        int a = input.nextInt();
        int input1 = a;
        System.out.println("Masukkan bilangan b: ");
        int b = input.nextInt();
        int input2 = b;
        
        while( b != 0){
            int sisa = a % b;
            a = b;
            b = sisa;
        };
        
        System.out.printf("Pembagi Bersama Terbesar (GCD) dari %d dan %d adalah %d", input1, input2, a);
    }
}
