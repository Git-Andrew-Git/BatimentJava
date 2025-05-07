package fr.andrew.batiment;

import java.util.ArrayList;

public class Batiment {
    // ✅ checked
    // Bonne gestion de la composition
    private String adresseBatiment;
    private final int nbPiecesMaxi = 7;
    private ArrayList<Piece> pieces = new ArrayList<>(nbPiecesMaxi);

    public void setNbPieces(int nbPieces) {
        this.nbPieces = nbPieces;
    }

    private int nbPieces = 0;

    public int piecesLibre() {
        return getNbPiecesMaxi() - getNbPieces();
    }

    public void afficher() {
        System.out.printf("Batiment avec adresse : %s\n\n", getAdresseBatiment());
        System.out.printf("Quantité des pièces actuelle : %d\n", getNbPieces());
        System.out.printf("Quantité des pièces maximale : %d\n", getNbPiecesMaxi());
        System.out.printf("Quantité des pièces libres : %d\n\n", piecesLibre());
        for (int j = 0; j < getPieces().size(); j++) {
            getPieces().get(j).afficher();
        }
    }

    public void ajouterPieces(int largeur, int hauteur, int profondeur, String nom) {
        try {
            if (getNbPieces() >= getNbPiecesMaxi()) {
                throw new IllegalArgumentException("numero des pieces permit est depassé");
            } else {
                pieces.add(new Piece(largeur, hauteur, profondeur, nom));
                setNbPieces(getNbPieces() + 1);

            }
        } catch (IllegalArgumentException e) {
            System.out.println("numero des pieces permit est depassé" + e.getMessage());
        } finally {
            System.out.printf("Pièces existantes : %d\n", getNbPieces());
            System.out.printf("Maximum possible : %d\n", getNbPiecesMaxi());
        }
    }

    public Batiment(String adresseBatiment) {
        setAdresseBatiment(adresseBatiment);

    }

    @Override
    public String toString() {
        return "Batiment{" +
                "adresseBatiment='" + getAdresseBatiment() + '\'' +
                ", nbPiecesMaxi=" + getNbPiecesMaxi() +
                ", nbPieces=" + getNbPieces() +
                ", pieces=" + getPieces() +
                '}';
    }

    public String getAdresseBatiment() {
        return adresseBatiment;
    }

    public void setAdresseBatiment(String adresseBatiment) {
        this.adresseBatiment = adresseBatiment;
    }

    public int getNbPiecesMaxi() {
        return nbPiecesMaxi;
    }

    public int getNbPieces() {
        return nbPieces;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

}
