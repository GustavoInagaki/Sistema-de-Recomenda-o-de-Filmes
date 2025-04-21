import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String titulo;
    private String genero;
    private int ano;
    private List<Integer> avaliacoes = new ArrayList<>();


    public Filme(String titulo, String genero, int ano){
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
        
    }

    public void adicionarAvaliacao(int nota){
        if(nota >= 1 && nota <= 5){
            avaliacoes.add(nota);

        }else{
            System.out.println("A nota deve ser entre 1 e 5.");
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public String getGenero(){
        return genero;
    }

    public double getMediaAvaliacoes(){
        if(avaliacoes.isEmpty()) return 0.0;

        int soma = 0;
        for(int nota : avaliacoes){
            soma += nota;
        }

        return (double) soma / avaliacoes.size();
    }


    public String toString(){
        return String.format("Título: %s | Gênero: %s | Ano: %d | Média de Avaliações: %.2f",
                titulo, genero, ano, getMediaAvaliacoes()); 
    }

    
}
