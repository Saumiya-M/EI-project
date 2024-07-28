import behavioral.observer.*;
import behavioral.strategy.*;

public class Main {
    public static void main(String[] args) {
        // Observer Pattern Demo
        System.out.println("Observer Pattern Demo:");
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver phoneDisplay = new PhoneDisplay();
        WeatherObserver windowDisplay = new WindowDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(windowDisplay);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(27.3f);

        // Strategy Pattern Demo
        System.out.println("\nStrategy Pattern Demo:");
        TextEditor editor = new TextEditor();

        editor.setFormatter(new UpperCaseFormatter());
        editor.publishText("Hello World");

        editor.setFormatter(new LowerCaseFormatter());
        editor.publishText("Hello World");
    }
}
