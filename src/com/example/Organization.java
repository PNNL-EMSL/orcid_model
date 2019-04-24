package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Organization {

@SerializedName("name")
@Expose
private String name;
@SerializedName("address")
@Expose
private Address address;
@SerializedName("disambiguated-organization")
@Expose
private DisambiguatedOrganization disambiguatedOrganization;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Address getAddress() {
return address;
}

public void setAddress(Address address) {
this.address = address;
}

public DisambiguatedOrganization getDisambiguatedOrganization() {
return disambiguatedOrganization;
}

public void setDisambiguatedOrganization(DisambiguatedOrganization disambiguatedOrganization) {
this.disambiguatedOrganization = disambiguatedOrganization;
}

}