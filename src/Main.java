import java.time.LocalDate;

import ao.dio.desafio.dominio.Bootcamp;
import ao.dio.desafio.dominio.Curso;
import ao.dio.desafio.dominio.Dev;
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

       /*
       System.out.println(curso);
       System.out.println(curso2);
       System.out.println(mentoria);
*/
         Bootcamp bootcamp = new Bootcamp();
         bootcamp.setNome("Bootcamp Java Developer");
         bootcamp.setDescricao("Descrição Bootcamp Java Developer");
         bootcamp.getConteudos().add(curso);
         bootcamp.getConteudos().add(curso2);
         bootcamp.getConteudos().add(mentoria);

         
         Dev devHelder = new Dev();
         devHelder.setNome("Hélder");
         devHelder.inscreverBootcamp(bootcamp);
         System.out.println("Conteudos Inscritos Hélder" + devHelder.getConteudosInscritos());        
         devHelder.progredir();
         devHelder.progredir(); 
         devHelder.progredir();
         System.out.println("-");
         System.out.println("Conteudos Inscritos Hélder" + devHelder.getConteudosInscritos());
         System.out.println("Conteudos Concluidos Hélder" + devHelder.getConteudoConcluidos());
         System.out.println("XP:" + devHelder.calcularTotalXp());

         System.out.println("----------------------------------");

         Dev devJo = new Dev();
         devJo.setNome("Jó");
         devJo.inscreverBootcamp(bootcamp);
         System.out.println("Conteudos Inscritos Jó" + devJo.getConteudosInscritos());        
         devJo.progredir();
         System.out.println("-");
         System.out.println("Conteudos Inscritos Jó" + devJo.getConteudosInscritos());
         System.out.println("Conteudos Concluidos Jó" + devJo.getConteudoConcluidos());
         System.out.println("XP:" + devJo.calcularTotalXp());

    }
}
