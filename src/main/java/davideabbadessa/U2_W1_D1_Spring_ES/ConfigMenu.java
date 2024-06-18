package davideabbadessa.U2_W1_D1_Spring_ES;


import davideabbadessa.U2_W1_D1_Spring_ES.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class ConfigMenu {

    //<------------ Topping ------------>
    @Bean
    public Topping mozzarella() {
        return new Topping("\nMozzarella", 0.69, 92);
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("\nProsciutto", 0.99, 35);
    }

    @Bean
    public Topping cipolle() {
        return new Topping("\nCipolle", 0.69, 22);
    }

    @Bean
    public Topping ananas() {
        return new Topping("\nAnanas", 0.79, 24);
    }

    @Bean
    public Topping salame() {
        return new Topping("\nSalame", 0.99, 86);
    }

    //<------------ Pizze ------------>
    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("\nPizza Margherita (Pomodoro, Mozzarella)", 4.99, 1104);
        pizza.aggiungiTopping(mozzarella());
        return pizza;
    }

    @Bean
    public Pizza hawaiianPizza() {
        Pizza pizza = new Pizza("\nHawaiian Pizza (Pomodoro, Mozzarella, Prosciutto, Ananas)", 6.49, 1024);
        pizza.aggiungiTopping(mozzarella());
        pizza.aggiungiTopping(prosciutto());
        pizza.aggiungiTopping(ananas());
        return pizza;
    }

    @Bean
    public Pizza salamiPizza() {
        Pizza pizza = new Pizza("\nSalami Pizza (Pomodoro, Mozzarella, Salame)", 5.99, 1160);
        pizza.aggiungiTopping(mozzarella());
        pizza.aggiungiTopping(salame());
        return pizza;
    }

    //<------------ Drink ------------>
    @Bean
    public Drink limonata() {
        return new Drink("\nLimonata (0.33l)", 1.29, 128);
    }

    @Bean
    public Drink acqua() {
        return new Drink("\nAcqua (0.5l)", 1.29, 0);
    }

    @Bean
    public Drink vino() {
        return new Drink("\nVino (0.75l, 13%)", 7.49, 607);
    }

    //<------------ Tavoli ------------>
    @Bean
    public Tavolo tavolo1() {
        return new Tavolo(1, 4, false);
    }

    @Bean
    public Tavolo tavolo2() {
        return new Tavolo(2, 2, false);
    }

    @Bean
    public Tavolo tavolo3() {
        return new Tavolo(3, 10, true);
    }

    @Bean
    public Tavolo tavolo4() {
        return new Tavolo(4, 12, true);
    }

    @Bean
    public Tavolo tavolo5() {
        return new Tavolo(5, 27, false);
    }

    //<------------ Ordini ------------>
    @Bean
    public Ordine ordine1(Menu menu, Tavolo tavolo1) {
        Ordine ordine = new Ordine(1, "in corso", 4, LocalDateTime.now(), tavolo1);
        ordine.aggiungiElementoMenu(menu.getItems().get(5)); //pizza margherita
        ordine.aggiungiElementoMenu(menu.getItems().get(9)); //acqua
        ordine.calcolaImportoTotale(2.0); //costo del coperto
        return ordine;
    }

    @Bean
    public Ordine ordine2(Menu menu, Tavolo tavolo2) {
        Ordine ordine = new Ordine(2, "in corso", 2, LocalDateTime.now(), tavolo2);
        ordine.aggiungiElementoMenu(menu.getItems().get(6)); //Hawaiian Pizza
        ordine.aggiungiElementoMenu(menu.getItems().get(10)); //vino
        ordine.calcolaImportoTotale(2.0); //costo del coperto
        return ordine;
    }


    @Bean
    public Menu menu() {
        Menu menu = new Menu();


        //<------------ Topping ------------>
        menu.aggiungiProdotto(mozzarella());
        menu.aggiungiProdotto(ananas());
        menu.aggiungiProdotto(prosciutto());
        menu.aggiungiProdotto(cipolle());
        menu.aggiungiProdotto(salame());

        //<------------ Pizze ------------>
        menu.aggiungiProdotto(margherita());
        menu.aggiungiProdotto(hawaiianPizza());
        menu.aggiungiProdotto(salamiPizza());

        //<------------ Drink ------------>
        menu.aggiungiProdotto(limonata());
        menu.aggiungiProdotto(acqua());
        menu.aggiungiProdotto(vino());


        //<------------ Tavoli ------------>

        //<------------ Ordini ------------>
        return menu;
    }
}



