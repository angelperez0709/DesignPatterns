package examples.singleton;

public class Main {
    public static void main(String[] args) {
        //Creating configuration object with singleton
        Configuration c = Configuration.getConfiguration();
        //Setting the options into the instance field
        c.setLanguage("English");
        c.setDarkMode(true);
        c.setVolume(10);
        //Showing the object
        System.out.println(c);
        //Creating another object, with singleton returning the same instance
        Configuration b = Configuration.getConfiguration();
        //Retrieve the same toString, because is the same object
        System.out.println(b);
        c.setVolume(20);
        //Returns true
        System.out.println(b.equals(c));
    }
}
