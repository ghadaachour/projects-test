/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

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

 */
public class RandomForest extends BaseModel {
private int numTrees;
private int maxDepth;
    public RandomForest(String name, int version, String description) {
        super(name, version, description);
    }

    @Override
    public void train(DataSet dataset) {
      System.out.print(": Entraîne le modèle random forest en utilisant l’ensemble de données fourni");
  }

    @Override
    public double predict(DataSet dataset) {
       System.out.print(" Prédit un résultat de random forest basé sur une instance donnée");
    return 0; }
    
}