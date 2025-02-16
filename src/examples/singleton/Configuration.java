package examples.singleton;

public class Configuration {
    private boolean darkMode;
    private String language;
    private int volume;
    private static volatile Configuration instance;

    private Configuration() {
        this.darkMode = false;
        this.language = "Spanish";
        this.volume = 0;
    }

    public static Configuration getConfiguration() {
        synchronized (Configuration.class) {
            if (instance == null) {
                instance = new Configuration();
            }
            return instance;
        }
    }

    public boolean isDarkMode() {
        return darkMode;
    }

    public void setDarkMode(boolean darkMode) {
        this.darkMode = darkMode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "darkMode=" + darkMode +
                ", language='" + language + '\'' +
                ", volume=" + volume +
                '}';
    }
}
