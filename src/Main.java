import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDayvson = new Dev();
        devDayvson.setNome("Dayvson");
        devDayvson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Dayvson: " + devDayvson.getConteudosInscritos());
        devDayvson.progredir();
        devDayvson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Dayvson: " + devDayvson.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Dayvson: " + devDayvson.getConteudosConcluidos());
        System.out.println("XP:" + devDayvson.calcularTotalXp());

        System.out.println("--------------");

        Dev devCarla = new Dev();
        devCarla.setNome("Carla");
        devCarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
        devCarla.progredir();
        devCarla.progredir();
        devCarla.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carla: " + devCarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Carla: " + devCarla.getConteudosConcluidos());
        System.out.println("XP:" + devCarla.calcularTotalXp());


    }
}