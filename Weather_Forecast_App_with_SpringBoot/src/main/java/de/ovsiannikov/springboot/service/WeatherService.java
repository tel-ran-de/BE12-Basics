package de.ovsiannikov.springboot.service;

import de.ovsiannikov.springboot.entity.Forecast;
import de.ovsiannikov.springboot.entity.SearchResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class WeatherService {


    private WeatherGateway gateway;

    @Autowired
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
        logger.info("Forecast from WeatherService  - " + forecast);

        return forecast.getConsolidatedWeather()[0].getTheTemp() + " °C";
    }
}
