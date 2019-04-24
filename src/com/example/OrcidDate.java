package com.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrcidDate {

@SerializedName("year")
@Expose
private StringValue year;
@SerializedName("month")
@Expose
private StringValue month;
@SerializedName("day")
@Expose
private StringValue day;

public StringValue getYear() {
return year;
}

public void setYear(StringValue year) {
this.year = year;
}

public StringValue getMonth() {
return month;
}

public void setMonth(StringValue month) {
this.month = month;
}

public StringValue getDay() {
return day;
}

public void setDay(StringValue day) {
this.day = day;
}

}