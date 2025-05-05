package fr.andrew;

import fr.andrew.batiment.Batiment;
import fr.andrew.batiment.meubles.Meuble;

public class Main {
    public static void main(String[] args) {
        // Créer le bâtiment
        Batiment monBatiment = new Batiment("10 Rue des Programmateurs, Paris");

        // Ajouter quelques pièces
        monBatiment.ajouterPieces(5, 3, 4, "Salon");
        monBatiment.ajouterPieces(4, 3, 3, "Chambre");
        monBatiment.ajouterPieces(2, 3, 2, "Cuisine");

        Meuble canape = new Meuble(2, 1, 1, "Canapé");
        Meuble tableBasse = new Meuble(1, 1, 1, "Table basse");
        Meuble lampe = new Meuble(0, 1, 0, "Lampe de salon");

        monBatiment.getPieces().get(0).ajouterMeubles(canape, tableBasse, lampe);
        monBatiment.getPieces().get(1).ajouterMeubles(tableBasse, lampe);
        monBatiment.getPieces().get(2).ajouterMeubles(tableBasse);

        monBatiment.afficher();


    }
}