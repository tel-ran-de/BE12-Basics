package de.ovsiannikov.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import de.ovsiannikov.entity.Forecast;
import de.ovsiannikov.entity.SearchResult;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeatherGatewayTest {
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void testFindCityByName() throws Exception {

        WeatherGateway gateway = new WeatherGateway(mapper);

        SearchResult[] berlins = gateway.findCityByName("Berlin");

        assertTrue(berlins.length == 1);
    }

    @Test
    public void testGetWeatherByWoeid() throws Exception {
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);

        WeatherGateway gateway = new WeatherGateway(mapper);

        Forecast weatherByWoeid = gateway.getWeatherByWoeid("638242");
    }
}
