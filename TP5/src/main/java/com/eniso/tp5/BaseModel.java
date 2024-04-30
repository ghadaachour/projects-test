/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author GHADA
 */

/**
 *
 * @author chams
 */
public  abstract class BaseModel implements MachineLearningModel {
    protected String name ;
 protected int version;
protected String description ;
protected String device ;

    public BaseModel(String name, int version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }
void displayDetails(){
    System.out.print("Basemodel{" + "name=" + name + ", version=" + version + ", description=" + description + ", device=" + device + '}');
}

   
}