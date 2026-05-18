import java.util.HashSet;

public class TerceiroHandsOn {
    public static void main(String[] args) {
                HashSet<String> nomes = new HashSet<>();
        nomes.add("Arthur");
        nomes.add("Arthur");
        nomes.add("Arthur");
        nomes.add("João");
        nomes.add("Lucas");

        System.out.println("\nPresentes: " + nomes);
        System.out.println("Qntd: " + nomes.size());
    }
}
