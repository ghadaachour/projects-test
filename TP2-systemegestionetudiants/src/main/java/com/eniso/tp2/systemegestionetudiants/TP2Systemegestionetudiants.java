/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp2.systemegestionetudiants;

/**
 *
 * @author GHADA
 */
import java.util.ArrayList;


    // Constructor
    public SystemeGestionEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    // Getter and Setter methods for etudiants
    public ArrayList<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(ArrayList<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}






public class TP2Systemegestionetudiants {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
