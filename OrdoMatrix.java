/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbuaul;

import java.util.Scanner;

public class OrdoMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Baris: ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom: ");
        int Kolom = input.nextInt();
        
        int matrix[][] = new int[baris][Kolom];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Masukkan Nilai Baris " + (i+1) + " Kolom " + (j+1) + ": ");
                matrix[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((j+1) != matrix[i].length) {
                    System.out.print(matrix[i][j] + " | ");
                } else {
                    System.out.print(matrix[i][j]);
                }
            }
            System.out.println();
        }
    }
}





