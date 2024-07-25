package com.example.weather.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "text"
})
@Data
@Generated("jsonschema2pojo")
public class Condition {

    @JsonProperty("text")
    public String text;

}
