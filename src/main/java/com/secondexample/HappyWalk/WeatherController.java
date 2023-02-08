package com.secondexample.HappyWalk;

import Weather.Weather;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WeatherController {
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    //---------------- API weather -----------------------
    @GetMapping("/getWeather")
    public String getWeather(Model model){
        List<Weather> weatherList = new ArrayList<Weather>();
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("https://api.openweathermap.org/data/2.5/weather?q=Dublin,ie&APPID=00ba7d04939b7d1d840987389fea387a", String.class);
        JSONObject root = new JSONObject(response);
        JSONArray data = root.getJSONArray("weather");

        for(int i = 0; i < data.length(); i++){
            JSONObject jsonWeather = data.getJSONObject(i);
            Weather weather = new Weather();
            int id = jsonWeather.getInt("id");
            String main = jsonWeather.getString("main");
            String description = jsonWeather.getString("description");
            String icon = jsonWeather.getString("icon");
            weather.setId(id);
            weather.setMain(main);
            weather.setDescription(description);
            weather.setIcon(icon);
            weatherList.add(weather);
        }
        model.addAttribute("response", weatherList);
        return "weatherInfo";
    }

}
