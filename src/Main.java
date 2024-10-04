import Ex01.builders.PizzaBuilder;
import Ex01.entities.Pizza;

public class Main {
    public static void main(String[] args) {
        showPizza();
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
}
