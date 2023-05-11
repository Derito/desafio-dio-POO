package ao.dio.desafio.dominio;

public class Curso {

    private int cargaHoraria;   
    private String descricao;
    private String titulo;


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + descricao + ", titulo=" + titulo + "]";
    }
 
    
}
