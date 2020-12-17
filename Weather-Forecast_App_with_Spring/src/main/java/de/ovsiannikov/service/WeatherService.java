package de.ovsiannikov.service;

import de.ovsiannikov.entity.Forecast;
import de.ovsiannikov.entity.SearchResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class WeatherService {

    private WeatherGateway gateway;

    public WeatherService(WeatherGateway gateway) {
        this.gateway = gateway;
    }

    private static Logger logger = LogManager.getLogger(WeatherService.class);

    public String getWeatherByCityName(String cityName) throws Exception {
        SearchResult[] cityByName = gateway.findCityByName(cityName);
        if (cityByName.length == 0) {
            logger.error("City with name ===>>> " + cityName + " <<<=== not found.");
            throw new RuntimeException("No results for " + cityName);
        }
        Forecast forecast = gateway.getWeatherByWoeid(cityByName[0].getWoeid());
        return "Temperature in " + cityName.toUpperCase() + " --- " + forecast.getConsolidatedWeather()[0].getTheTemp() + " °C";
    }
}
