import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import de.telran.service.InputOutputService;
import de.telran.service.WeatherGateway;
import de.telran.service.WeatherService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


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
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        WeatherService weatherService = new WeatherService(new WeatherGateway(mapper));
        WeatherForecastApp app = new WeatherForecastApp(new InputOutputService(), weatherService);
        app.execute();
    }
}
