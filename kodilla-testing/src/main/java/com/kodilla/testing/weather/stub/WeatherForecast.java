package com.kodilla.testing.weather.stub;
import java.util.*;


public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }


    public Double averageCalculation() {

        Map<String, Double> resultMap = new HashMap<>();
        double sum = 0;
        for (Map.Entry<String, Double> temp : temperatures.getTemperatures().entrySet()) {
            sum += temp.getValue();
        }
        double average = sum / temperatures.getTemperatures().size();
        return average;
    }

    @Override
    public String toString() {
        return String.valueOf(averageCalculation());
    }

    public Double medianCalculation() {
        List<Double> averageList = new ArrayList<>(temperatures.getTemperatures().values());
        double median = 0;
        double average = 0;
        Collections.sort(averageList);
        if (averageList.size() % 2 == 0) {
            int index = (averageList.size() / 2 + ((averageList.size()) / 2 - 1)) / 2;
            median = averageList.get(index);
        } else {
            int index = averageList.size() / 2;
            median = averageList.get(index);
        }
        return median;
    }
}