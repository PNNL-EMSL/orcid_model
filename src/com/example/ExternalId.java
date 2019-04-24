package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalId {

@SerializedName("external-id-type")
@Expose
private String externalIdType;
@SerializedName("external-id-value")
@Expose
private String externalIdValue;
@SerializedName("external-id-url")
@Expose
private StringValue externalIdUrl;
@SerializedName("external-id-relationship")
@Expose
private String externalIdRelationship;

public String getExternalIdType() {
return externalIdType;
}

public void setExternalIdType(String externalIdType) {
this.externalIdType = externalIdType;
}

public String getExternalIdValue() {
return externalIdValue;
}

public void setExternalIdValue(String externalIdValue) {
this.externalIdValue = externalIdValue;
}

public StringValue getExternalIdUrl() {
return externalIdUrl;
}

public void setExternalIdUrl(StringValue externalIdUrl) {
this.externalIdUrl = externalIdUrl;
}

public String getExternalIdRelationship() {
return externalIdRelationship;
}

public void setExternalIdRelationship(String externalIdRelationship) {
this.externalIdRelationship = externalIdRelationship;
}

}