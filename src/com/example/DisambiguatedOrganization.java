package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DisambiguatedOrganization {

@SerializedName("disambiguated-organization-identifier")
@Expose
private String disambiguatedOrganizationIdentifier;
@SerializedName("disambiguation-source")
@Expose
private String disambiguationSource;

public String getDisambiguatedOrganizationIdentifier() {
return disambiguatedOrganizationIdentifier;
}

public void setDisambiguatedOrganizationIdentifier(String disambiguatedOrganizationIdentifier) {
this.disambiguatedOrganizationIdentifier = disambiguatedOrganizationIdentifier;
}

public String getDisambiguationSource() {
return disambiguationSource;
}

public void setDisambiguationSource(String disambiguationSource) {
this.disambiguationSource = disambiguationSource;
}

}