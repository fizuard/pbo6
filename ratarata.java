/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;

import java.util.Scanner;

/**
 *
 * @author ASUS E1404GA
 */
public class ratarata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah bilangan: ");
        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Bilangan ke-" + i + ": ");
                arr[i] = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Input bukan angka! Program berhenti.");
                return;
            }
        }

        double total = 0;
        for (double d : arr) total += d;

        System.out.println("Rata-rata = " + (total / n));
    }
}