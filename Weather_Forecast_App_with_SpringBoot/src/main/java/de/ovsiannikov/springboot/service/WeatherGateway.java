package de.ovsiannikov.springboot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.ovsiannikov.springboot.controller.WeatherForecastController;
import de.ovsiannikov.springboot.entity.Forecast;

import de.ovsiannikov.springboot.entity.SearchResult;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.util.Arrays;

@Service
@ConfigurationPropertiesBinding
public class WeatherGateway {

    private final String SEARCH_URL = "https://www.metaweather.com/api/location/search/?query=";
    private final String FORECAST_URL = "https://www.metaweather.com/api/location/";

    private static Logger logger = LogManager.getLogger(WeatherGateway.class);

    private ObjectMapper mapper;

    public WeatherGateway(ObjectMapper mapper) {
        this.mapper = mapper;
    }

    public SearchResult[] findCityByName(String cityName) throws Exception {

        URL searchUrl = new URL(SEARCH_URL + cityName);

        SearchResult[] searchResults = mapper.readValue(searchUrl, SearchResult[].class);
        logger.info(Arrays.toString(searchResults));

        return searchResults;
    }

    public Forecast getWeatherByWoeid(String woeid) throws Exception {
        URL forecastUrl = new URL(FORECAST_URL + woeid);
        logger.info("ForecastUrl - " + forecastUrl);

        Forecast forecast = mapper.readValue(forecastUrl, Forecast.class);
        logger.info("Forecast from WeatherGateway class - " + forecast);

        return forecast;
    }
}
