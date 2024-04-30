/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp1;

import java.util.Scanner;

public class Image {

    public static double[] calcul(int[][] image) {
        int nb = image.length * image[0].length;
        double[] p = new double[256];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                int x = image[i][j];
                p[x]++;
            }
        }

        for (int i = 0; i < p.length; i++) {
            p[i] /= nb;
        }

        return p;
    }

