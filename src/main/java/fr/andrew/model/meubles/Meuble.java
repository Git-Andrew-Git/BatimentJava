package fr.andrew.model.meubles;

public class Meuble {
    private int largeur;
    private int hauteur;
    private int profondeur;
    private String nom;


    public Meuble(int largeur, int hauteur, int profondeur, String nom) {
        setLargeur(largeur);
        setHauteur(hauteur);
        setProfondeur(profondeur);
        setNom(nom);
    }

    @Override
    public String toString() {
        return "Meuble{" +
                "largeur=" + getLargeur() +
                ", hauteur=" + getHauteur() +
                ", profondeur=" + getProfondeur() +
                ", nom='" + getNom() + '\'' +
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
    public long voulume(){
        long result = getLargeur() * getHauteur() * getProfondeur();
        return result;
    }

    public long surface() {
        long result = getLargeur() * getProfondeur();
        return result;
    }

    public void afficher() {
        System.out.printf("Meuble: %s\n\nLe volume d’encombrement du meuble: %d m\u00B3\nLa surface maximale prise par le meuble: %d m\u00B2\n\n\n", getNom(), voulume(), surface());
    }
}
