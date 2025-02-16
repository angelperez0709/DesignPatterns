package examples.builder.builders;

import examples.builder.burguers.Burguer;
import examples.builder.components.Bread;
import examples.builder.components.Cheese;
import examples.builder.components.Meat;
import examples.builder.components.Sauce;

public class OrderBuilder implements Builder {
    private Bread bread;
    private Cheese cheese;
    private Meat meat;
    private Sauce sauce;

    @Override
    public OrderBuilder setBread(Bread bread) {
        this.bread = bread;
        return this;

    }

    @Override
    public OrderBuilder setCheese(Cheese cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public OrderBuilder setMeat(Meat meat) {
        this.meat = meat;
        return this;
    }

    @Override
    public OrderBuilder setSauce(Sauce sauce) {
        this.sauce = sauce;
        return this;
    }

    //Clear the builder to get ready for making more burguers
    public void reset() {
        cheese = null;
        meat = null;
        sauce = null;
        bread = null;
    }

    public Burguer getOrder() {
        Burguer burguer = new Burguer(bread, cheese, meat, sauce);
        reset();
        return burguer;
    }
}
