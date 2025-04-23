import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        SistemaRecomendacao sistema = new SistemaRecomendacao();

        boolean rodando = true;

        while (rodando) {
            
            System.out.println("\n===== MENU =====");
            System.out.println("1. Adicionar novo filme");
            System.out.println("2. Listar filmes");
            System.out.println("3. Avaliar um filme");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine();


            switch (opcao) {
                case 1:
                    System.out.println("Digite o título do filme: ");
                    String titulo = entrada.nextLine();

                    System.out.println("Digite o gênero: ");
                    String genero = entrada.nextLine();

                    System.out.println("Digite o ano de lancamento: ");
                    int ano = entrada.nextInt();
                    entrada.nextLine();

                    Filme novoFilme = new Filme(titulo, genero, ano);
                    sistema.adicionarFilme(novoFilme);
                    System.out.println("Filme adicionado com sucesso.");
                    break;
                
                case 2: 
                    sistema.listarFilmes();
                    break;

                case 3: 
                    System.out.println("Digite o título do filme para avaliar: ");
                    String tituloAvaliado = entrada.nextLine();

                    System.out.println("Digite a nota (1 a 5):");
                    int nota = entrada.nextInt();
                    entrada.nextLine();
                    sistema.avaliarFilme(tituloAvaliado, nota);
                    break;

                case 4:
                    rodando = false;
                    System.out.println("Encerrando...");
                    break;
                
                default:
                    break;
            }

        }




        
        entrada.close();
    }
}
