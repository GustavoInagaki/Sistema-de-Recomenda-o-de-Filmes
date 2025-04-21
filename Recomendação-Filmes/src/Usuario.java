import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nome;
    private List<Filme> filmesAssistidos;

    public Usuario(String nome){
        this.nome = nome;
        this.filmesAssistidos = new ArrayList<>();
    }


    //public void assistirFilme(Filme filme, int nota){
     //   filme.avaliar(nota);
      //  filmesAssistidos.add(filme);
    //}

    public List<Filme> getFilmesAssistidos(){
        return filmesAssistidos;
    }

    public String getNome(){
        return nome;
    }
}
