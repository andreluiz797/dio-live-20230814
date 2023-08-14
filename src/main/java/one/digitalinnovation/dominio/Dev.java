package one.digitalinnovation.dominio;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
public class Dev {

    private String nome;
    private List<Conteudo> conteudosInscritos = new ArrayList<>();
    private List<Conteudo> conteudosConcluidos = new ArrayList<>();

    public void inscrever(Conteudo conteudo) {
        if (conteudosInscritos.contains(conteudo)) {
            System.out.println("Voce ja está inscrito neste conteudo.");
        }else {
            conteudosInscritos.add(conteudo);
        }
    }
    public void inscrever(Bootcamp bootcamp) {
        bootcamp.getConteudos().stream().forEach(this::inscrever);

        bootcamp.getDevs().add(this);
        }

        public void progredir() {
            Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
            if (conteudo.isPresent()) {
                conteudosConcluidos.add(conteudo.get());
                conteudosInscritos.remove(conteudo.get());
            }else{
                System.out.println("Você não está mais inscrito em nenhum conteudo.");
            }
        }

        public double calcularTotalXp() {
          return conteudosConcluidos.stream()
                  .mapToDouble(conteudo -> conteudo.calcularXp())
                  .sum();

        }

}
