import java.util.ArrayList;

public class DoisHandsOn {
    public static void main(String[] args) {
        ArrayList<Double> Nota = new ArrayList<>();
        Nota.add(10.0);
        Nota.add(7.0);
        Nota.add(5.0);
        Nota.add(6.0);
        double media = 0;
        double soma = 0;
        for (int i = 0; i < Nota.size(); i++) {                                                                                                
            System.out.println("Nota " + (i+1) + ":"+ Nota.get(i));
            soma += Nota.get(i);
        }
        media = soma/Nota.size();
        System.out.println("\nMédia das notas: " + media);
        System.out.println("Qntd: " + Nota.size());
    }
}
