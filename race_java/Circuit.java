public class Circuit {
    
    private int nbTours;
    private int distance;

    public Circuit(int nbTours, int distance) {
        this.nbTours = nbTours;
        this.distance = distance;
    }

    public Circuit(int nbTours) {
        this.nbTours = nbTours;
        this.distance = 100;
    }

    public int getTotalDistance() {
        return this.nbTours * this.distance;
    }

}
