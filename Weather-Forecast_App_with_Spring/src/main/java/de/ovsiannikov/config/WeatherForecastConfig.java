package de.ovsiannikov.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import de.ovsiannikov.WeatherForecastApp;
import de.ovsiannikov.service.InputOutputService;
import de.ovsiannikov.service.WeatherGateway;
import de.ovsiannikov.service.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherForecastConfig {


    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        return mapper;
    }

    @Bean
    public WeatherGateway weatherGateway(ObjectMapper mapper) {
        return new WeatherGateway(mapper);
    }

    @Bean
    public WeatherService weatherService(WeatherGateway gateway) {
        return new WeatherService(gateway);
    }

    @Bean
    public InputOutputService service() {
        return new InputOutputService();
    }

    @Bean
    public WeatherForecastApp app(InputOutputService inputOutputService, WeatherService weatherService) {
        return new WeatherForecastApp(inputOutputService, weatherService);
    }
}
