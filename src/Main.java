import Ex01.builders.PizzaBuilder;
import Ex01.entities.Pizza;
import Ex02.builders.VeiculoBuilder;
import Ex02.entities.Veiculo;
import Ex03.builders.RelatorioBuilder;
import Ex03.entities.Relatorio;

public class Main {
    public static void main(String[] args) {
        showPizza();
        showVeiculo();
        showRelatorio();
    }

    public static void showPizza() {
        Pizza pizza = new PizzaBuilder()
                .setMassa("MASSA")
                .setTamanho("40CM")
                .addIngrediente("MUSSARELA")
                .build();

//        Pizza pizza2 = new PizzaBuilder()
//                .setMassa("MASSA")
//                .setTamanho("40CM")
//                        .build();

        System.out.println(pizza.toString());
//        System.out.println(pizza2.toString());
    }

    public static void showVeiculo() {
        Veiculo veiculo = new VeiculoBuilder()
                .setTipo("CARRO")
                .setRodas(4)
                .setCor("AZUL")
                .build();

        System.out.println(veiculo.toString());
    }

    public static void showRelatorio() {
        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("TITULO")
                .setCorpo("CORPO CORPO CORPO")
                .setRodape("RODAPÉ")
                .build();

        System.out.println(relatorio.toString());
    }
}
