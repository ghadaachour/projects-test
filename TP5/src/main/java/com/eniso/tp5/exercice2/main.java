/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.exercice2;

/**
 *
 * @author GHADA
 */


import java.io.FileNotFoundException;

/**
 *

 */
public class main {


public static void main(String[] args) {
FileManager fileManager = new FileManager();
Mathoperation mathOperations = new Mathoperation();
UserValidator userValidator = new UserValidator();
try {
fileManager.readFile("invalid/file/path.txt");
} catch (FileNotFoundException e) {
System.out.println("Exception attrapée : " + e.getMessage());
}
try {
mathOperations.calculateFactorial(-5);
} catch (IllegalArgumentException e) {
System.out.println("Exception attrapée : " + e.getMessage());
}
try {
mathOperations.calculateSquareRoot(-10);
} catch (ArithmeticException e) {
System.out.println("Exception attrapée : " + e.getMessage());
}
try {
userValidator.validateAge(16);
} catch (UserAgeException e) {
System.out.println("Exception attrapée : " + e.getMessage());
}
}}