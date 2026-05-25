import java.util.Scanner;

public class Setimo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pedido.dadosMock();

        boolean loop = true;
        System.out.println("===== SISTEMA DA LANCHONETE =====");

        do {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status de um pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total dos pedidos");
            System.out.println("0 - Sair");

            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    Pedido.cadastrarPedido(sc);
                    break;

                case 2:
                    Pedido.listarPedidos();
                    break;

                case 3:
                    Pedido.atualizarStatus(sc);
                    break;

                case 4:
                    Pedido.buscarPedido(sc);
                    break;

                case 5:
                    Pedido.mostrarValorTotal();
                    break;

                case 0:
                    loop = false;
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (loop);

        sc.close();
    }
}
