package org.example;

public enum UnidadeFederativa {

    BAHIA("Bahia", "BA"),
    SÃO_PAULO("São paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "Rj");

    String nome;
    String sigla;

    UnidadeFederativa(String nome, String Sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }


}
