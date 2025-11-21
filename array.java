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
public class array {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan jumlah array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("elemen ke " + i + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0], min = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
            if (i < min) min = i;
        }

        System.out.println("nilai terbesar: " + max);
        System.out.println("nilai terkecil: " + min);

        int total = 0;
        for (int i : arr) total += i;
        double rata = (double) total / n;

        System.out.println("jumlah total: " + total);
        System.out.println("rata-rata: " + rata);

        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2) jumlahGanjil += arr[i];

        System.out.println("jumlah elemen ganjil: " + jumlahGanjil);

        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2) jumlahGenap += arr[i];

        System.out.println("jumlah elemen genap: " + jumlahGenap);

        System.out.print("jumlah dari : " + jumlahGenap + " adalah ");
        if (jumlahGenap % 2 == 0)
            System.out.println("genap");
        else
            System.out.println("ganjil");

        java.util.Arrays.sort(arr);

        System.out.println("array setelah diurutkan:");
        for (int i : arr) System.out.print(i + " ");
    }
}

