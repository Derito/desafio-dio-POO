import java.time.LocalDate;

import ao.dio.desafio.dominio.Curso;
import ao.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
       // instanciando a classe Curso

       Curso curso = new Curso();
       curso.setTitulo(" Curso Java OO ");
       curso.setDescricao(" Descrição do curso Java OO ");
       curso.setCargaHoraria(4);

       Curso curso2 = new Curso();

       curso2.setTitulo("Curso C++");
       curso2.setDescricao("Descrição do curso C**");
       curso2.setCargaHoraria(8);

     //Polimorfismo

     //Conteudo conteudo = new Curso();
       
       Mentoria mentoria = new Mentoria();

       mentoria.setTitulo("mentótia de Java");
       mentoria.setDescricao("Descrição da mentória Java.");
       mentoria.setData(LocalDate.now());

       System.out.println(curso);
       System.out.println(curso2);
       System.out.println(mentoria);

    }
}
