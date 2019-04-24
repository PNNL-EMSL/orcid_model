package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResourceItem {

@SerializedName("resource-name")
@Expose
private String resourceName;
@SerializedName("resource-type")
@Expose
private String resourceType;
@SerializedName("hosts")
@Expose
private Hosts hosts;
@SerializedName("external-ids")
@Expose
private ExternalIds externalIds;
@SerializedName("url")
@Expose
private StringValue url;

public String getResourceName() {
return resourceName;
}

public void setResourceName(String resourceName) {
this.resourceName = resourceName;
}

public String getResourceType() {
return resourceType;
}

public void setResourceType(String resourceType) {
this.resourceType = resourceType;
}

public Hosts getHosts() {
return hosts;
}

public void setHosts(Hosts hosts) {
this.hosts = hosts;
}

public ExternalIds getExternalIds() {
return externalIds;
}

public void setExternalIds(ExternalIds externalIds) {
this.externalIds = externalIds;
}

public StringValue getUrl() {
return url;
}

public void setUrl(StringValue url) {
this.url = url;
}

}