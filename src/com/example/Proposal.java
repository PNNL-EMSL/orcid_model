package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Proposal {

@SerializedName("title")
@Expose
private Title title;
@SerializedName("hosts")
@Expose
private Hosts hosts;
@SerializedName("external-ids")
@Expose
private ExternalIds externalIds;
@SerializedName("start-date")
@Expose
private OrcidDate startDate;
@SerializedName("end-date")
@Expose
private OrcidDate endDate;

public Title getTitle() {
return title;
}

public void setTitle(Title title) {
this.title = title;
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

public OrcidDate getStartDate() {
return startDate;
}

public void setStartDate(OrcidDate startOrcidDate) {
this.startDate = startOrcidDate;
}

public OrcidDate getEndDate() {
return endDate;
}

public void setEndDate(OrcidDate endOrcidDate) {
this.endDate = endOrcidDate;
}

}