import java.util.Set;
import java.util.HashSet;

public class Course {
    private Circuit circuit;
    private Set<Vaisseau> vaisseaux;
    private int nbTicks;

    public Course(Circuit circuit) {
        this.circuit = circuit;
        this.vaisseaux = new HashSet();
        this.nbTicks = 0;
    }

    public void inscrireVaisseau(Vaisseau vaisseau) {
        vaisseaux.add(vaisseau);
    }

    @Override
    public String toString() {
        String result = "";
        for (Vaisseau vaisseau : this.vaisseaux) {
            result += vaisseau + '\n';
        }
        return result;
    }
}
