package fr.andrew.batiment;

import fr.andrew.batiment.meubles.Meuble;

import java.util.ArrayList;

public class Piece {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;

    final private int nbMeublesMaxi = 3;
    private ArrayList<Meuble> meubles = new ArrayList<>(nbMeublesMaxi);

    public void setNbMeubles(int nbMeubles) {
        this.nbMeubles = nbMeubles;
    }

    private int nbMeubles = 0;

    public void ajouterMeubles(Meuble... meuble) {
        try {
            if (getNbMeubles() >= getNbMeublesMaxi()) {
                throw new IllegalArgumentException("numero des meubles permit est depassé");
            }
            for (int i = 0; i < meuble.length; i++) {

                if (getNbMeubles() >= getNbMeublesMaxi()) {

                    continue;

                } else {
                    meubles.add(meuble[i]);
                    setNbMeubles(getNbMeubles()+1);

                }

            }
        } catch (IllegalArgumentException e) {
            System.out.println("numero des meubles permit est depassé" + e.getMessage());
        } finally {
            System.out.printf("Meubles existants : %d\n", getNbMeubles());
            System.out.printf("Max meubles possible : %d\n", getNbMeublesMaxi());
        }
    }

    private long voulume() {
        long result = getLargeur() * getHauteur() * getProfondeur();
        return result;
    }

    private long surface() {
        long result = getLargeur() * getProfondeur();
        return result;
    }

    public long surfaceMeubles() {
        long result = 0;
        for (int i = 0; i < meubles.size(); i++) {
            result += meubles.get(i).surface();
        }
        return result;
    }

    public long surfaceLibre() {
        return surface() - surfaceMeubles();
    }

    public void afficher() {
        System.out.printf("Piece: %s\n\nLe volume d’encombrement de la piece: %d m\u00B3\nLa surface maximale prise " +
                "par la piece: %d m\u00B2\nLa surface libre : %d\n\n\n", getNom(), voulume(), surface(), surfaceLibre());
        System.out.println("L'info sur les meubles : ");
        for (int i = 0; i < meubles.size(); i++) {

            System.out.printf("Meuble: %s\n\nLe volume d’encombrement du meuble: %d m\u00B3\nLa surface maximale prise par le meuble: %d m\u00B2\n\n\n", meubles.get(i).getNom(), meubles.get(i).voulume(), meubles.get(i).surface());
        }
    }


    Piece(int largeur, int hauteur, int profondeur, String nom) {
        setLargeur(largeur);
        setHauteur(hauteur);
        setProfondeur(profondeur);
        setNom(nom);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "largeur=" + getLargeur() +
                ", hauteur=" + getHauteur() +
                ", profondeur=" + getProfondeur() +
                ", nomPiece='" + getNom() + '\'' +
                ", nbMeublesMaxi=" + getNbMeublesMaxi() +
                ", nbMeubles=" + getNbMeubles() +
                ", meubles=" + getMeubles() +
                '}';
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public int getProfondeur() {
        return profondeur;
    }

    public void setProfondeur(int profondeur) {
        this.profondeur = profondeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Meuble> getMeubles() {
        return meubles;
    }

    public int getNbMeubles() {
        return nbMeubles;
    }



    public int getNbMeublesMaxi() {
        return nbMeublesMaxi;
    }
}
