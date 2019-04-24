package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

@SerializedName("city")
@Expose
private String city;
@SerializedName("region")
@Expose
private String region;
@SerializedName("country")
@Expose
private String country;

public String getCity() {
return city;
}

public void setCity(String city) {
this.city = city;
}

public String getRegion() {
return region;
}

public void setRegion(String region) {
this.region = region;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

}