package de.ovsiannikov.service;

import de.ovsiannikov.entity.ConsolidatedWeather;
import de.ovsiannikov.entity.Forecast;
import de.ovsiannikov.entity.SearchResult;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherServiceTest {

    private WeatherGateway gateway = mock(WeatherGateway.class);

    @Test
    public void testGetWeatherByCityName() throws Exception {

        when(gateway.getWeatherByWoeid(anyString())).thenReturn(createTestForecast());
        when(gateway.findCityByName(anyString())).thenReturn(createSearchResult());
        WeatherService service = new WeatherService(gateway);

        String weatherInBerlin = service.getWeatherByCityName("Berlin");

        assertEquals("Temperature in BERLIN --- 25 °C", weatherInBerlin);
    }

    private SearchResult[] createSearchResult() {
        SearchResult result = new SearchResult("1234");
        SearchResult[] results = {result};
        return results;
    }

    private Forecast createTestForecast() {
        ConsolidatedWeather weather = new ConsolidatedWeather("25");
        ConsolidatedWeather[] result = {weather};
        Forecast forecast = new Forecast(result);
        return forecast;
    }


    @Test(expected = RuntimeException.class)
    public void testGetWeatherByCityName_1() throws Exception {

        when(gateway.getWeatherByWoeid(anyString())).thenReturn(createTestForecast_1());
        when(gateway.findCityByName(anyString())).thenReturn(createSearchResult_1());
        WeatherService service = new WeatherService(gateway);

        String weatherInBerlin = service.getWeatherByCityName("Berlin");

        assertEquals("25", weatherInBerlin);
    }

    private SearchResult[] createSearchResult_1() {
        SearchResult[] results = {};
        return results;
    }

    private Forecast createTestForecast_1() {
        ConsolidatedWeather weather = new ConsolidatedWeather("25");
        ConsolidatedWeather[] result = {weather};
        Forecast forecast = new Forecast(result);
        return forecast;
    }
}
