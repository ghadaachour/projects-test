/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.exercice2;

/**
 *
 * @author GHADA
 */
public class Mathoperation {
    public void calculateFactorial(int x) throws IllegalArgumentException{
        if(x<0) throw new IllegalArgumentException("variable est negative");
    }
    public void calculateSquareRoot(int x){
         if(x<0) throw new ArithmeticException("variable est negative");
   
    }
}