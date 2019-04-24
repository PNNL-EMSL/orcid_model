package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hosts {

@SerializedName("organization")
@Expose
private List<Organization> organization = null;

public List<Organization> getOrganization() {
return organization;
}

public void setOrganization(List<Organization> organization) {
this.organization = organization;
}

}