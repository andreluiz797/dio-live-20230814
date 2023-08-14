package one.digitalinnovation.dominio;

import one.digitalinnovation.dominio.Bootcamp;
import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Dev;
import one.digitalinnovation.dominio.Mentoria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Basico");
        cursoJava.setDescricacao("Aprenda os conceito basico sobre Java.");
        cursoJava.setCargaHoraria(8);

        Curso cursoDotNet = new Curso();
        cursoDotNet.setTitulo("Java .Net");
        cursoDotNet.setDescricacao("Aprenda os conceitos basicos sobre C#.");
        cursoDotNet.setCargaHoraria(8);

        Curso cursoJavaAvancado = new Curso();
        cursoJavaAvancado.setTitulo("Java .Net");
        cursoJavaAvancado.setDescricacao("Aprenda os conceitos avancado sobre Java.");
        cursoJavaAvancado.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Aprenda Orientação a Objetos com Java");
        mentoria.setDescricacao("Imersao sobre os pilares da Orientaçaõ e Objetos.");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT START #2 Java");
        bootcamp.setInicio(LocalDate.now());
        bootcamp.setFim(bootcamp.getInicio().plusDays(45));
        bootcamp.setConteudos(Arrays.asList(  cursoJava,cursoDotNet,cursoJavaAvancado));

        Dev Gustavo = new Dev();
        Gustavo.setNome("Gustavo");

        Dev Andre = new Dev();
        Andre.setNome("Andre");

        Gustavo.inscrever(cursoDotNet);
        Gustavo.inscrever(bootcamp);
        Gustavo.progredir();
        Gustavo.progredir();

        Andre.inscrever(bootcamp);
        Andre.progredir();
        Andre.progredir();
        Andre.progredir();

        System.out.println(String.format("XP Gustavo: %2f" , Gustavo.calcularTotalXp()));
        System.out.println(String.format("XP Andre: %2f" , Andre.calcularTotalXp()));

        List<Dev> ranking = Arrays.asList(Gustavo, Andre).stream()
                   .sorted((dev1, dev2) -> Double.compare(dev1.calcularTotalXp(), dev2.calcularTotalXp()))
                           .collect(Collectors.toList());
        for (Dev dev : ranking) {
            System.out.println(dev.getNome());
        }







    }
}
