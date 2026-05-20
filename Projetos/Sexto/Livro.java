import java.util.HashMap;
import java.util.Scanner;

class Livro {
    Scanner sc = new Scanner(System.in);
    String titulo;
    String autor;
    boolean status;
    int codigo;
    public Livro(String titulo, String autor, boolean status) {
        this.titulo = titulo;
        this.autor = autor;
        this.status = status;
    }

    HashMap<Integer, Livro> livro = new HashMap<>();

    void teste(){

        livro.put(1, new Livro("Pequeno príncipe", "Antoine de Saint-Exupéry", true));
        
        livro.put(2, new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true));

        livro.put(3, new Livro("Dom Casmurro", "Machado de Assis", true));

        livro.put(4, new Livro("1984", "George Orwell", true));    

    }

    void cadastrar(){
        
        System.out.println("Digite o código do livro: ");
        codigo = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Digite o título do livro: ");
        String tituloDigitado = sc.nextLine();

        System.out.println("Digite o nome do autor do livro: ");
        String autorDigitado = sc.nextLine();

        livro.put(codigo, new Livro(tituloDigitado, autorDigitado, true));
        System.out.println("Livro cadastrado com sucesso!\n");
    }

    void listar(){

        System.out.println("\n========== LISTA DE LIVROS ==========");

        livro.forEach((codigo, livro) -> {
            System.out.printf("Código: %-4d | Título: %-25s | Autor: %-25s | Status: %s%n", 
                codigo, 
                livro.titulo, 
                livro.autor, 
                (livro.status ? "Disponível" : "Emprestado")
            );
        });
        System.out.println("=====================================\n");
    }

    void emprestar(){

        System.out.println("Digite o código do livro que você deseja: ");
        int codigoDigitado = sc.nextInt();

        Livro livroEncontrado = livro.get(codigoDigitado);

        if (livroEncontrado != null) {
            if (livroEncontrado.status) {
                livroEncontrado.status = false;
                System.out.println("Livro '" + livroEncontrado.titulo + "' emprestado com sucesso!");
            } else {
                System.out.println("Desculpe, este livro já está emprestado.");
            }
        } else {
            System.out.println("Livro não encontrado com o código informado.");
        }

    }

    void devolver(){

        System.out.println("Digite o código do livro que você deseja devolver: ");
        int codigoDigitado = sc.nextInt();

        Livro livroEncontrado = livro.get(codigoDigitado);

        if (livroEncontrado != null) {
            if (livroEncontrado.status == false) {
                livroEncontrado.status = true;
                System.out.println("Livro '" + livroEncontrado.titulo + "' devolução feita com sucesso!");
            } else {
                System.out.println("Este livro já está armazenado.");
            }
        } else {
            System.out.println("Livro não encontrado com o código informado.");
        }

    }

}
