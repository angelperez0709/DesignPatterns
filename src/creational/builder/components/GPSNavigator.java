package creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Great Russell St, London WC1B 3DG, United Kingdom";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
