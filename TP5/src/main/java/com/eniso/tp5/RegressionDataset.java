/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author GHADA
 */
public class RegressionDataset extends DataSet{
private double[] targets;
private int numFeatures;

    public RegressionDataset(String path, boolean isTrain) {
        super(path, isTrain);
    }
    @Override
    public void chargementDonnes() {
      System.out.print("Implémentation du chargement des données de regresion.\n" );
    }

    public void pretraitementDonnes() {
       System.out.print("Implémentation du prétraitement spécifique aux tâches de regresion.\n" );
    }
    
}