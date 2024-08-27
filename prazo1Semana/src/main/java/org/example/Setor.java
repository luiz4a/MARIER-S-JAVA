package org.example;

public enum Setor {
    ENGENHARIA("Engenharia"),

    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos_humanos"),

    MARKETING("Marketing"),
    OPERACOES("Operaçoes");

    String texto;

    Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
