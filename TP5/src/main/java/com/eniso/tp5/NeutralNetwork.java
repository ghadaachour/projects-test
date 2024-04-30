/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author GHADA
 */
public class NeutralNetwork extends BaseModel {
private int[] layers;
private String activationFunction;
    public NeutralNetwork(String name, int version, String description) {
        super(name, version, description);
    }

    public NeutralNetwork(String name ,int[] layers, String activationFunction) {
        super(name, 1, "");
        this.layers = layers;
        this.activationFunction = activationFunction;
    }


    @Override
    public void train(DataSet dataset) {
     System.out.print(": Entraîne le modèle NeuralNetwork en utilisant l’ensemble de données fourni");
   }

    @Override
    public double predict(DataSet dataset) {
         System.out.print(" Prédit un résultat de NeuralNetwork basé sur une instance donnée");
    return 0;  }
    
}