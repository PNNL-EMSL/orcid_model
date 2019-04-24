package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalIds {

@SerializedName("external-id")
@Expose
private List<ExternalId> externalId = null;

public List<ExternalId> getExternalId() {
return externalId;
}

public void setExternalId(List<ExternalId> externalId) {
this.externalId = externalId;
}

}