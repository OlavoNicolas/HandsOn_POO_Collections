import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {

    private int numeroPedido;
    private String nomeCliente;
    private String itemPedido;
    private double valor;
    private String status;

    private static ArrayList<Pedido> pedidos = new ArrayList<>();


    public Pedido(int numeroPedido, String nomeCliente,
                  String itemPedido, double valor, String status) {

        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.itemPedido = itemPedido;
        this.valor = valor;
        this.status = status;
    }


    
    public static void cadastrarPedido(Scanner sc) {

        System.out.println("\n===== CADASTRO DE PEDIDO =====");

        System.out.print("Digite o número do pedido: ");
        int numeroPedido = sc.nextInt();
        sc.nextLine();

        
        for (Pedido p : pedidos) {

            if (p.numeroPedido == numeroPedido) {

                System.out.println("ERRO! Pedido já cadastrado.");
                return;
            }
        }

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite o item pedido: ");
        String itemPedido = sc.nextLine();

        System.out.print("Digite o valor do pedido: ");
        double valor = sc.nextDouble();

        
        String status = "PENDENTE";

        Pedido novoPedido = new Pedido(
                numeroPedido,
                nomeCliente,
                itemPedido,
                valor,
                status
        );

        pedidos.add(novoPedido);

        System.out.println("\nPedido cadastrado com sucesso!");
    }


    
    public static void listarPedidos() {

        if (pedidos.isEmpty()) {

            System.out.println("\nNenhum pedido cadastrado.");
            return;
        }

        System.out.println("\n========== LISTA DE PEDIDOS ==========");

        for (Pedido p : pedidos) {

            System.out.printf(
                    "Pedido: %-5d | Cliente: %-20s | Item: %-20s | Valor: R$ %.2f | Status: %s%n",
                    p.numeroPedido,
                    p.nomeCliente,
                    p.itemPedido,
                    p.valor,
                    p.status
            );
        }

        System.out.println("======================================");
    }


    
    public static void atualizarStatus(Scanner sc) {

        System.out.print("\nDigite o número do pedido: ");
        int numeroBusca = sc.nextInt();

        for (Pedido p : pedidos) {

            if (p.numeroPedido == numeroBusca) {

                int opcao;

                do {

                    System.out.println("\nEscolha o novo status:");
                    System.out.println("1 - PENDENTE");
                    System.out.println("2 - PREPARANDO");
                    System.out.println("3 - FINALIZADO");

                    opcao = sc.nextInt();

                } while (opcao < 1 || opcao > 3);

                switch (opcao) {

                    case 1:
                        p.status = "PENDENTE";
                        break;

                    case 2:
                        p.status = "PREPARANDO";
                        break;

                    case 3:
                        p.status = "FINALIZADO";
                        break;
                }

                System.out.println("Status atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Pedido não encontrado.");
    }


    
    public static void buscarPedido(Scanner sc) {

        System.out.print("\nDigite o número do pedido: ");
        int numeroBusca = sc.nextInt();

        for (Pedido p : pedidos) {

            if (p.numeroPedido == numeroBusca) {

                System.out.println("\n===== PEDIDO ENCONTRADO =====");

                System.out.println("Número do Pedido: " + p.numeroPedido);
                System.out.println("Cliente: " + p.nomeCliente);
                System.out.println("Item: " + p.itemPedido);
                System.out.printf("Valor: R$ %.2f%n", p.valor);
                System.out.println("Status: " + p.status);

                return;
            }
        }

        System.out.println("Pedido não encontrado.");
    }


    
    public static void mostrarValorTotal() {

        double total = 0;

        for (Pedido p : pedidos) {

            total += p.valor;
        }

        System.out.printf("\nValor total dos pedidos: R$ %.2f%n", total);
    }


    
    public static void dadosMock() {

        pedidos.add(new Pedido(
                101,
                "Carlos Silva",
                "X-Burguer",
                25.50,
                "PENDENTE"
        ));

        pedidos.add(new Pedido(
                102,
                "Mariana Souza",
                "Pizza Calabresa",
                48.00,
                "PREPARANDO"
        ));

        pedidos.add(new Pedido(
                103,
                "João Pedro",
                "Refrigerante",
                8.50,
                "FINALIZADO"
        ));
    }
}