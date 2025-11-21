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
public class perulangan {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Perulangan FOR:");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

        System.out.println("\nPerulangan FOREACH:");
        for (int a : age) {
            System.out.println(a);
        }
    }
}