package one.digitalinnovation.dominio;

import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Data
public class Bootcamp {
    private String nome;
    private LocalDate inicio;
    private LocalDate fim;
    private List<Conteudo> conteudos = new ArrayList<>();
    private List<Dev> devs = new ArrayList<>();

}
