import java.util.Scanner;

public class SextoHandsOn {
    public static void main(String[] args) {
        Livro livro = new Livro(null, null, false);
        Scanner sc = new Scanner(System.in);
        int escolha;
        boolean loop = true;
        livro.teste();
            
        do{
        System.out.println("\n--- MENU livraria ---");
        System.out.println("1 - Cadastrar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolver livro");
        System.out.println("0 - Sair");
        
        System.out.print("Escolha uma opção: ");
        escolha = sc.nextInt();
        sc.nextLine();

        switch (escolha) {
            case 1:
                livro.cadastrar();
                break;
            case 2:
                livro.listar();    
                break;
            case 3:
                livro.emprestar();    
                break;
            case 4:
                livro.devolver();    
                break;
            case 0:
                System.out.println("Saindo...");    
                loop = false;
                break;
            default:
                System.out.println("ERROR! Digite novamente!");
                break;
        }}while(loop);
            
        
        sc.close();
    }
}
