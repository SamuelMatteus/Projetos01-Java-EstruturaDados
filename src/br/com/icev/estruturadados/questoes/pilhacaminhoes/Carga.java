package br.com.icev.estruturadados.questoes.pilhacaminhoes;

class Carga {
    private String descricaoCarga;
    private int nivelCriticidade;

    public Carga(String descricaoCarga, int nivelCriticidade) {
        this.descricaoCarga = descricaoCarga;
        this.nivelCriticidade = nivelCriticidade;
    }

    public String getDescricaoCarga() {
        return descricaoCarga;
    }

    public int getNivelCriticidade() {
        return nivelCriticidade;
    }


}
