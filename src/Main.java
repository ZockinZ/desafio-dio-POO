import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCarga_horaria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCarga_horaria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java developer");
        bootcamp.setDescricao("Bootcamp desc");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno.setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Breno: " + devBreno.getConteudosInscritos());
        devBreno.progredir();
        devBreno.progredir();
        System.out.println("Conteudos Concluídos Breno: " + devBreno.getContrudosConcluidos());
        System.out.println("Conteudos Inscritos Breno: " + devBreno.getConteudosInscritos());
        System.out.println("XP: " + devBreno.calcularTotalXP());

        System.out.println("-------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteudos Concluídos Joao: " + devJoao.getContrudosConcluidos());
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXP());


    }
}