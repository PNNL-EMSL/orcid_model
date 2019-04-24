package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StringValue{
	@SerializedName("value")
	@Expose
	private String value;

	public StringValue(){}
	public StringValue(String val){
		value = val;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}