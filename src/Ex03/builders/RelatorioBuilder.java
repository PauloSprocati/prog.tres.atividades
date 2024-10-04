package Ex03.builders;

import Ex03.entities.Relatorio;

public class RelatorioBuilder {
    private Relatorio relatoio = new Relatorio();

     public RelatorioBuilder setTitulo(String titulo) {
         this.relatoio.setTitulo(titulo);
         return this;
     }

    public RelatorioBuilder setCorpo(String corpo) {
        this.relatoio.setCorpo(corpo);
        return this;
    }

    public RelatorioBuilder setRodape(String rodape) {
        this.relatoio.setRodape(rodape);
        return this;
    }

    public Relatorio build() {
         return this.relatoio;
    }

}
