package de.ovsiannikov;

import de.ovsiannikov.config.WeatherForecastConfig;
import de.ovsiannikov.service.InputOutputService;
import de.ovsiannikov.service.WeatherService;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class WeatherForecastApp {

    private InputOutputService inputOutputService;
    private WeatherService weatherService;
    private static Logger logger = LogManager.getLogger(WeatherForecastApp.class);

    public WeatherForecastApp(InputOutputService inputOutputService, WeatherService weatherService) {
        this.inputOutputService = inputOutputService;
        this.weatherService = weatherService;
    }

    public void execute() throws Exception {
        logger.info("Application started");

        String s = inputOutputService.readInputCityName();
        String res = weatherService.getWeatherByCityName(s);
        InputOutputService.print(res);

        logger.info("Application finished");

    }

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WeatherForecastConfig.class);
        WeatherForecastApp app = (WeatherForecastApp) context.getBean("app");
        app.execute();
    }
}
