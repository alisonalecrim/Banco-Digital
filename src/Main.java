import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente jubileu = new Cliente();
        jubileu.setNome("Jubileu");

        Conta cc = new ContaCorrente(jubileu);
        Conta poupanca = new ContaPoupanca(jubileu);

        Scanner scanner = new Scanner(System.in);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        double valor = 0.0;
        int escolha = 0;

        while (escolha != 3) {


            System.out.println("Escolha uma opção a seguir: [1]Depositar  [2]Transferir  [3]Finalizar");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    valor = scanner.nextDouble();
                    cc.depositar(valor);
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 2:
                    System.out.println("Digite o valor a ser transferido: ");
                    valor = scanner.nextDouble();
                    cc.transferir(valor, poupanca);
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 3:
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                default:
                    System.out.println("Favor escolher uma opção válida");
                }
            }
        }
    }