package examples.builder.burguers;

import examples.builder.components.Bread;
import examples.builder.components.Cheese;
import examples.builder.components.Meat;
import examples.builder.components.Sauce;

public record Burguer(Bread bread, Cheese cheese, Meat meat, Sauce sauce) {
    @Override
    public String toString() {
        return "Burguer{" +
                "bread=" + bread +
                ", cheese=" + cheese +
                ", meat=" + meat +
                ", sauce=" + sauce +
                '}';
    }
}
