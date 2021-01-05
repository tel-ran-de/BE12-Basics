package de.ovsiannikov.springboot.controller;

import de.ovsiannikov.springboot.service.WeatherService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;


@Controller
public class WeatherForecastController {

    private static Logger logger = LogManager.getLogger(WeatherForecastController.class);

    private WeatherService weatherService;

    @Autowired
    public WeatherForecastController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @RequestMapping()
    public String enterTheCity() {

        return "enter-city-name";
    }

    @RequestMapping("/showTemperature")
    public String getTempByCityName(@RequestParam("cityNameForm") String cityName, Model model) throws Exception {

        model.addAttribute("temp", weatherService.getWeatherByCityName(cityName));

        return "temp-by-city-name";
    }
}
