package org.stereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Weather {
    @Value("Winter")
    private String weather_type;
    @Value("Lucknow")
    private String city;
    @Value("#{myBestFriends}")
    private List<String> friends;

    public Weather() {
    }

    public Weather(String weather_type, String city, List<String> friends) {
        this.weather_type = weather_type;
        this.city = city;
        this.friends = friends;
    }

    public String getWeather_type() {
        return weather_type;
    }

    public void setWeather_type(String weather_type) {
        this.weather_type = weather_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "weather_type='" + weather_type + '\'' +
                ", city='" + city + '\'' +
                ", friends=" + friends +
                '}';
    }
}
