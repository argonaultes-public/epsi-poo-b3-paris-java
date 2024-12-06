public class App {
    public static void main(String[] args) {
        Circuit c = new Circuit(2, 2000);
        Vaisseau v1 = new Vaisseau("vaisseau1", "rouge", 100, 20);
        Vaisseau v2 = new Vaisseau("vaisseau", "bleu", 150, 28);
        Vaisseau v3 = new Vaisseau("vaisseau", "noir", 10, 0);
    
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
    }
}
