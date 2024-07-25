package com.example.weather.services;

import com.example.weather.models.Weather;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class WeatherService {
    String baseUrl = "http://api.weatherapi.com/v1/current.json";
    WebClient webClient = WebClient.create(baseUrl);

    public Mono<Weather> getCurrentWeather(String key, String location){
        Mono<Weather> results = webClient
                .get()
                .uri(
                        uriBuilder -> uriBuilder
                                .queryParam("key",key)
                                .queryParam("q", location)
                                .build()
                )
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Weather.class);
        return results;

    }
}