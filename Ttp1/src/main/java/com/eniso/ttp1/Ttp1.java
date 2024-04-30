
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 
package com.eniso.ttp1;
import java.util.Scanner; 

/**
 * 
 */
public class Ttp1 {

    public static void main(String[] args) {
        System.out.println("Bonjour, mon premier TP en POO");
        System.out.println("Quel est votre nom ?");

        Scanner read = new Scanner(System.in);
        String name = read.next();
        System.out.println("Bonjour " + name); 
        
        System.out.println("Quel est votre âge, " + name + " ?"); 

        int age = read.nextInt(); 
        System.out.println(name + ", votre âge est " + age);
    }
        public static double[] calcul(int[][] image) {
        double[] p = new double[256];

        for(int i = 0;i<256;i++){
            int occ = 0;
            for (int k = 0; k < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (i==image[k][j]){
                    occ++;
                }
            }
        }
            p[i] = occ/(image.length*image[0].length);
        }

        return p;
    }
         public static double calculateEntropie(int[][] image) {
        double e=0;
        double[] p = calcul(image);
        for (int i=0; i<256;i++){
            e-=p[i]*Math.log(p[i]);
                }
        return e ;
    }


}