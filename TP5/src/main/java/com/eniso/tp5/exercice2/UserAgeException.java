/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.exercice2;

/**
 *
 * @author GHADA
 */
public class UserAgeException extends Exception{
   private String message;

    public UserAgeException(String message) {
        this.message = message;
    }

   @Override
    public String getMessage() {
        return message;
    }

   
   
}