package examples.builder;

import examples.builder.builders.Builder;
import examples.builder.components.Bread;
import examples.builder.components.Cheese;
import examples.builder.components.Meat;
import examples.builder.components.Sauce;

public class Director {
    public void makeGlutenFreeBurguer(Builder builder) {
        //Here we could implement the necessary logic to make an expensive burger.
        builder.setBread(Bread.GLUTEN_FREE);
        builder.setCheese(Cheese.CHEDDAR);
        builder.setMeat(Meat.PIG);
    }

    public void makeExpensiveBurguer(Builder builder) {
        builder.setBread(Bread.WHOLE);
        builder.setMeat(Meat.VEAL);
        builder.setCheese(Cheese.PROVOLONE);
        builder.setSauce(Sauce.MUSTARD);
    }

    public void makeVeganBurguer(Builder builder) {
        builder.setBread(Bread.NORMAL);
        builder.setMeat(Meat.VEGAN);
        builder.setCheese(Cheese.VEGAN);
        builder.setSauce(Sauce.KETCHUP);
    }
}
