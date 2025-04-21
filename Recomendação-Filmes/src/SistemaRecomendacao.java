import java.util.ArrayList;
import java.util.List;


public class SistemaRecomendacao {
    
    private List<Filme> catalogo = new ArrayList<>();

    public void adicionarFilme(Filme filme){
        catalogo.add(filme);

    }


    public void avaliarFilme(String titulo, int nota) {
        for (Filme filme : catalogo) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                filme.adicionarAvaliacao(nota);
                System.out.println("Avaliação adicionada com sucesso.");
                return;
            }
        }
        System.out.println("Filme não encontrado.");
    }

    public void listarFilmes(){
        for(Filme f : catalogo){
            System.out.println(f);
        }
    }
}
