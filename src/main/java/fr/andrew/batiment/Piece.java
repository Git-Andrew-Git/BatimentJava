package fr.andrew.batiment;

import java.util.ArrayList;

public class Piece extends Meuble {


    final private int nbMeublesMaxi = 3;
    private int nbMeubles = 0;
    private ArrayList<Meuble> meubles = new ArrayList<>();


//    TODO finish this
    @Override
    public void affiche() {
        System.out.println();
        for (int i = 0; i < meubles.size(); i++) {
        System.out.printf("Meuble: %s\n\nLe volume d’encombrement du meuble: %d m\u00B3\nLa surface maximale prise " +
                "par le meuble: %d m\u00B2\n\n\n", meubles.get(i).getNom(), meubles.get(i).voulume(), meubles.get(i).surface());
         }
    }

    public Piece(int largeur, int hauteur, int profondeur, String nom) {
        super(largeur, hauteur, profondeur, nom);
    }

    @Override
    public String toString() {
        return "Piece{" +
                "largeur=" + getLargeur() +
                ", hauteur=" + getHauteur() +
                ", profondeur=" + getProfondeur() +
                ", nomPiece='" + getNom() + '\'' +
                ", nbMeublesMaxi=" + nbMeublesMaxi +
                ", nbMeubles=" + getNbMeubles() +
                ", meubles=" + getMeubles() +
                '}';
    }



    public ArrayList<Meuble> getMeubles() {
        return meubles;
    }

    public void setMeubles(ArrayList<Meuble> meubles) {
        this.meubles = meubles;
    }

    public int getNbMeubles() {
        return nbMeubles;
    }

    public void setNbMeubles(int nbMeubles) {
        this.nbMeubles = nbMeubles;
    }
}
