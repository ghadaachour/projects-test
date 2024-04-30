/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5;

/**
 *
 * @author GHADA
 */
public abstract class DataSet {
    protected boolean isTrain;
    protected String path;

    public DataSet( String path,boolean isTrain) {
        this.isTrain = isTrain;
        this.path = path;
    }
    
    public abstract void  chargementDonnes();
      public abstract void  pretraitementDonnes();
}