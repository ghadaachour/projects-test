/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.exercice2;

/**
 *
 * @author GHADA
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chams
 */
public class UserValidator {
    public void validateAge(int a)throws UserAgeException{
        if(a<18)throw new UserAgeException("age is under 18");
    }
}