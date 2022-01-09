package fundamentals;

public class Program {
    public static void main(String[] args) {

        Caneta c1 = new Caneta("Bic", "Roxa", 0.5f);
        Caneta c2 = new Caneta("Bic Cristal", "Preta", 0.7f);

        c1.status();
        c2.status();
    }
}
