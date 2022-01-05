import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] main) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Rubson");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Rubson: " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("Conteúdos inscritos - Rubson: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Rubson: " + dev1.getConteudosConcluidos());
        System.out.println("XPs - Rubson: " + dev1.calcularTotalXp());



        System.out.println("-------");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos - Lucas:  " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos inscritos - Lucas:  " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluidos - Lucas: " + dev2.getConteudosConcluidos());
        System.out.println("XPs - Lucas: " + dev2.calcularTotalXp());

    }
}
