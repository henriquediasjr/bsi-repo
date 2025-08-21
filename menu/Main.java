package menu;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Pessoa> pessoas = new ArrayList<>();

    public static void main(String[] args) {
        menu(args);
    }
    public static void menu(String[] args) {

        Scanner scannerPergunta = new Scanner(System.in);

        while (true){
            System.out.println("Escolha uma opcao:");
            System.out.println("1 - Cadastrar nova pessoa");
            System.out.println("2 - Listar todas as pessoas");
            System.out.println("3 - Buscar pessoas por nome");
            System.out.println("4 - Atualizar dados de uma pessoa");
            System.out.println("5 - Remover dados de uma pessoa");
            System.out.println("6 - Sair");

            int escolha = scannerPergunta.nextInt();

            switch (escolha) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:
                    listarPessoas();
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opcao valida");
                    break;
            };
        }
    }

    // funcão que vai cadastrar pessoa 
    public static void cadastrarPessoa() {
        Pessoa p = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        p.nome = scanner.nextLine();
        System.out.println("Digite a idade da pessoa: ");
        p.idade = scanner.nextInt();
        System.out.println("Digite o telefone da pessoa: ");
        p.telefone = scanner.nextInt();
        System.out.println("Digite o email da pessoa: ");
        p.email = scanner.next();

        
        pessoas.add(p);
    }

    public static void listarPessoas() {
        System.out.println("Lista de pessoas: ");
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.nome);
            // System.valorout.println("Idade: " + p.idade);
            System.out.println("Telefone: " + p.telefone);
            System.out.println("Email: " + p.email);
        }
    }

}
