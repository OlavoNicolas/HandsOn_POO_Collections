import java.util.ArrayList;

public class UmHandsOn {
    public static void main(String[] args) {
        ArrayList<String> Produtos = new ArrayList<>();
        Produtos.add("Motor");
        Produtos.add("Pneu");
        Produtos.add("Óleo");
        Produtos.add("Bateria");
        Produtos.add("Lâmpada");

        System.out.println("\nProdutos: " + Produtos);
        System.out.println("Qntd: " + Produtos.size());
        
    }
}
