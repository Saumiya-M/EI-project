package behavioral.observer;

public class PhoneDisplay implements WeatherObserver {
    @Override
    public void update(float temperature) {
        System.out.println("Phone display: Current temperature is " + temperature + "°C");
    }
}
