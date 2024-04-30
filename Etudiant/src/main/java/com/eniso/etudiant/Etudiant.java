/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.etudiant;

import java.util.ArrayList;

/**
 *
 * @author GHADA
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private int numeroinscription;
    private String email;

    public Etudiant(String nom, String prenom, int numeroInscription, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroinscription = numeroinscription;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumeroInscription() {
        return numeroInscription;
    }

    public void setNumeroInscription(int numeroInscription) {
        this.numeroInscription = numeroInscription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to display student information
    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroInscription=" + numeroInscription +
                ", email='" + email + '\'' +
                '}';
    }
}

class SystemeGestionEtudiants {
    private ArrayList<Etudiant> etudiants;


    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
