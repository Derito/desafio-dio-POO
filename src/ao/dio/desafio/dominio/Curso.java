package ao.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;   
   

    public Curso() {
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", descricao=" + getDescricao() + ", titulo=" + getTitulo() + "]";
    }
    @Override
    public double calcularXp() {
        // Herda da class mãe
        return XP_PADRAO * cargaHoraria;
    }
 
    
}
