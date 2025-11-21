/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;

 class Langkah extends Thread {
    String nama;
    int jumlah;

    Langkah(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    @Override
    public void run() {
        for (int i = 1; i <= jumlah; i++) {
            System.out.println(nama + " - Langkah ke-" + i);
            try {
                Thread.sleep(1000); 
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan pada thread");
            }
        }
        System.out.println(nama + " Selesai!");
    }
}

public class StartThread {
    public static void main(String[] args) {

        Langkah p1 = new Langkah("Andi", 5);
        Langkah p2 = new Langkah("Anda", 2);

        p1.start(); 
        p2.start();   
    }
}