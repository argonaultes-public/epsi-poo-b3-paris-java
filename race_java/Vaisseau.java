public class Vaisseau {

    private String nom;
    private String couleur;
    private int vitesseMax;
    private int latence;
    private int distance;
    private int classement;
   
    public Vaisseau(String nom, String couleur, int vitesseMax, int latence) {
        this.nom = nom;
        this.couleur = couleur;
        this.vitesseMax = vitesseMax;
        this.latence = latence;
    }

    public Vaisseau(String nom) {
        this.nom = nom;
        this.couleur = "inconnu";
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int newDistance) {
        this.distance = newDistance;
    }

    public int getVitesseMax() {
        return this.vitesseMax;
    }

    public int getLatence() {
        return this.latence;
    }

    @Override
    public boolean equals(Object other) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("%s (vitesse: %d, latence: %d)", this.nom, this.vitesseMax, this.latence);
    }

}
