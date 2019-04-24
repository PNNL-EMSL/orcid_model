package com.example;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResearchResource {
@SerializedName("put-code")
@Expose
private String putCode = null;
@SerializedName("proposal")
@Expose
private Proposal proposal;
@SerializedName("resource-item")
@Expose
private List<ResourceItem> resourceItem = null;

public String getPutCode(){
	return putCode;
}

public void setPutCode(String putCode){
	this.putCode = putCode;
}

public Proposal getProposal() {
return proposal;
}

public void setProposal(Proposal proposal) {
this.proposal = proposal;
}

public List<ResourceItem> getResourceItem() {
return resourceItem;
}

public void setResourceItem(List<ResourceItem> resourceItem) {
this.resourceItem = resourceItem;
}

}