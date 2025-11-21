/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6;

/**
 *
 * @author ASUS E1404GA
 */
public class mobil {
     public static void main(String[] args) {

        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        System.out.println("sebelum diubah:");
        for (String m : mobil) {
            System.out.println(m);
        }

        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                mobil[i] = "Toyota";
            }
        }

        System.out.println("\nsesudah diubah:");
        for (String m : mobil) {
            System.out.println(m);
        }
    }
}