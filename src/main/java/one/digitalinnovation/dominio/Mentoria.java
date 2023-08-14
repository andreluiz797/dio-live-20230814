package one.digitalinnovation.dominio;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class Mentoria extends Conteudo {

    private LocalDateTime data;

    @Override
    public double calcularXp() {
        return XP_PADRAO;
    }
}
