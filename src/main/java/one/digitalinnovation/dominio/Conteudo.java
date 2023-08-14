package one.digitalinnovation.dominio;

import lombok.Data;

@Data
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10.0;

    private String titulo;
    private String descricacao;

    public abstract double calcularXp() ;


}
