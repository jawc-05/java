/**
 * @author jawc
 */

package br.com.jawc.patterns.gof.builder;

public class Demo {

    public static void main(String[] args) {
        BurgerRestaurantDirector burgerRestaurant = new BurgerRestaurantDirector();
        burgerRestaurant.setBuilder(new CheeseBurgerBuilder());
        buildBurger(burgerRestaurant);

        burgerRestaurant.setBuilder(new VeganBurgerBuild());
        buildBurger(burgerRestaurant);
    }

    private static void buildBurger(BurgerRestaurantDirector burgerRestaurant){
        Burger burger = burgerRestaurant.buildBurger();
        burger.print();
    }
}
