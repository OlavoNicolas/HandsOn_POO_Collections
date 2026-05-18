import java.util.HashMap;
import java.util.Scanner;
public class QuartoHandsOn {
    public static void main(String[] args) {
        Scanner ls = new Scanner(System.in);
        int escolha;
        HashMap<Integer, String> Cadastro = new HashMap<>();
        Cadastro.put(1,"Olavo");
        Cadastro.put(2,"João");
        Cadastro.put(3,"Arthur");
        Cadastro.put(4,"Lucas");
        Cadastro.put(5, "Paula");

        
        System.out.println("\nM° + Alunos: " + Cadastro);
        System.out.println("Qntd: " + Cadastro.size());

        do{
        System.out.println("Selecione uma matrícula de 1 a 5 para obter informações do aluno:");
        escolha = ls.nextInt(); 
        }while(escolha < 0 || escolha > 5);

        System.out.println("Aluno selecionado: " + (Cadastro.get(escolha)));

        do{
        System.out.println("Selecione uma matrícula de 1 a 5 para deletar aluno do sistema:");
        escolha = ls.nextInt(); 
        }while(escolha < 0 || escolha > 5);

        System.out.println("Aluno selecionado: " + (Cadastro.get(escolha)));
        Cadastro.remove(escolha);

        System.out.println("\nM° + Alunos: " + Cadastro);
        System.out.println("Qntd: " + Cadastro.size());

        ls.close();
    }
}
