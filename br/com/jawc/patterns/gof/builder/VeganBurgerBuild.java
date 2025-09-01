/**
 * @author jawc
 */
package br.com.jawc.patterns.gof.builder;

public class VeganBurgerBuild extends BurgerBuilder {
    @Override
    void buildBun() {
        burger.setBun("Vegan White Bread");
    }

    @Override
    void buildMeat() {
        burger.setMeat("Vegan Beef");
    }

    @Override
    void buildSalad() {
        burger.setSalad("Vegan Iceberg");
    }

    @Override
    void buildCheese() {
        burger.setCheese("Vegan American Cheese");
    }

    @Override
    void buildSauce() {
        burger.setSauce("Vegan Secret Sauce");
    }
}
