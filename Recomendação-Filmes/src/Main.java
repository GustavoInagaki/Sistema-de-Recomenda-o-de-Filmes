public class Main {
    public static void main(String[] args) {
        SistemaRecomendacao sistema = new SistemaRecomendacao();

        Filme f1 = new Filme("O Poderoso Chefão", "Drama", 1972);
        Filme f2 = new Filme("Vingadores: Ultimato", "Ação", 2019);

        sistema.adicionarFilme(f1);
        sistema.adicionarFilme(f2);

        sistema.avaliarFilme("O Poderoso Chefão", 5);
        sistema.avaliarFilme("O Poderoso Chefão", 4);
        sistema.avaliarFilme("Vingadores: Ultimato", 3);

        sistema.listarFilmes();

        
        
    }
}
