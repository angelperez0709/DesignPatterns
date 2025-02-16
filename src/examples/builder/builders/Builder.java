package examples.builder.builders;

import examples.builder.burguers.Burguer;
import examples.builder.components.Bread;
import examples.builder.components.Cheese;
import examples.builder.components.Meat;
import examples.builder.components.Sauce;

public interface Builder {
    Builder setBread(Bread bread);

    Builder setCheese(Cheese cheese);

    Builder setMeat(Meat meat);

    Builder setSauce(Sauce sauce);

    Burguer getOrder();
}
