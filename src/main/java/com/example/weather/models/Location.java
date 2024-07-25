package com.example.weather.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.annotation.Generated;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "region",
    "country",
    "lat",
    "lon",
    "tz_id",
    "localtime_epoch",
    "localtime"
})
@Data
@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("name")
    public String name;
    @JsonProperty("region")
    public String region;
    @JsonProperty("country")
    public String country;
    @JsonProperty("lat")
    public Float lat;
    @JsonProperty("lon")
    public Float lon;
    @JsonProperty("tz_id")
    public String tzId;
    @JsonProperty("localtime_epoch")
    public Integer localtimeEpoch;
    @JsonProperty("localtime")
    public String localtime;

}
