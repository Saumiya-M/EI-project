package behavioral.observer;

public class WindowDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Window display: Current temperature is " + temperature + "°C");
    }
}
