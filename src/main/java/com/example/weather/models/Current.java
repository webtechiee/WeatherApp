package com.example.weather.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "last_updated",
    "temp_c",
    "is_day",
    "condition",
    "pressure_in",
    "cloud",
    "feelslike_c"
})
@Data
@Generated("jsonschema2pojo")
public class Current {

    @JsonProperty("last_updated")
    public String lastUpdated;
    @JsonProperty("temp_c")
    public Float tempC;
    @JsonProperty("is_day")
    public Integer isDay;
    @JsonProperty("condition")
    @Valid
    public Condition condition;
    @JsonProperty("pressure_in")
    public Float pressureIn;
    @JsonProperty("cloud")
    public Integer cloud;
    @JsonProperty("feelslike_c")
    public Float feelslikeC;

}
