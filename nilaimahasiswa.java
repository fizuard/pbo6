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
public class nilaimahasiswa {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = sc.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = sc.nextInt();
            sc.nextLine();

            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
        }
    }
}