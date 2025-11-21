/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;
import java.util.Scanner;

class MyThread extends Thread {

    int id;

    MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread ke-" + id + " sedang berjalan");
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Error pada thread ke-" + id);
        }
    }

    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class MenulisThread {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread yang ingin dibuat : ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            MyThread t = new MyThread(i);
            t.start();
        }

        System.out.println("Semua thread telah dimulai!");
    }
}