package com.example.weather.controllers;

import com.example.weather.models.Weather;
import com.example.weather.services.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("w1")
@RequiredArgsConstructor

public class WeatherController {
private final WeatherService weatherService;
    String key = "5f63e7b275464b65bbf145808242406";
    @GetMapping("get")
    public String getCurrentWeather(@RequestParam String location){
       Weather weather = weatherService.getCurrentWeather(key,location).block();
      Float temperature = weather.getCurrent().getTempC();
      if (temperature < -30)
          return "Extremely cold, frostbite risk";
      else if ((temperature >= -30) && temperature < -20)
          return "Very cold, severe frostbite risk";
      else if ((temperature >= -20) && temperature < -10)
          return "Very cold, frostbite possible";
      else if ((temperature >= -10) && temperature < -0)
          return "Cold, frostbite unlikely, hypothermia possible with prolonged exposure";
      else if ((temperature >= 0) && temperature < 10)
          return "Chilly to cool, light jacket needed";
      else if ((temperature >= 10) && temperature < 20)
          return "Mild, comfortable, light clothing needed";
      else if ((temperature >= 20) && temperature < 30)
          return "Warm, ideal outdoor temperature, summer clothing";
      else if ((temperature >= 30) && temperature < 40)
          return "Hot, risk of heat exhaustion, stay hydrated";
      else if (temperature > 40)
          return "Extremely hot, risk of heatstroke, take precautions";
      else
          return "Temperature of out of range";

    }

}
