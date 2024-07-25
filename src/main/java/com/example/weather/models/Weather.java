
 package com.example.weather.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import lombok.Data;

 @JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "location",
    "current"
})
@Data
@Generated("jsonschema2pojo")
public class Weather {

    @JsonProperty("location")
    @Valid
    public Location location;
    @JsonProperty("current")
    @Valid
    public Current current;

}
