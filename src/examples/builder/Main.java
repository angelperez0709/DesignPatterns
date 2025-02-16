package examples.builder;

import examples.builder.builders.OrderBuilder;
import examples.builder.burguers.Burguer;
import examples.builder.components.Bread;
import examples.builder.components.Cheese;
import examples.builder.components.Meat;
import examples.builder.components.Sauce;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        OrderBuilder builder = new OrderBuilder();
        //Now we are creating a buruger with a director to organise the creating
        director.makeExpensiveBurguer(builder);
        Burguer burguer = builder.getOrder();
        System.out.println(burguer);
        director.makeVeganBurguer(builder);
        System.out.println(builder.getOrder());
        //Here we are creating the burguer with the builder directly
        OrderBuilder builder2 = new OrderBuilder();
        Burguer burguerWithoutDirector = builder2.
                setBread(Bread.NORMAL).
                setMeat(Meat.PIG).
                setSauce(Sauce.MAYONNAISE).
                setCheese(Cheese.BRIE).
                getOrder();
        System.out.println(burguerWithoutDirector);
    }
}
