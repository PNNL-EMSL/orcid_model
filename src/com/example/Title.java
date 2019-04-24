package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Title {

@SerializedName("title")
@Expose
private StringValue title;

public StringValue getTitle() {
return title;
}

public void setTitle(StringValue title) {
this.title = title;
}

}