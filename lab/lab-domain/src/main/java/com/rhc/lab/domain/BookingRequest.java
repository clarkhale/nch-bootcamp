package com.rhc.lab.domain;

import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingRequest {

    private Venue venue;
    private DateTime open;
    private DateTime close;
    private List<Performance> performances = new ArrayList<Performance>();
    private String description;

    public Venue getVenue() {
	return venue;
    }

    public void setVenue(Venue venue) {
	this.venue = venue;
    }

    public DateTime getOpen() {
	return open;
    }

    public void setOpen(DateTime open) {
	this.open = open;
    }

    public DateTime getClose() {
	return close;
    }

    public void setClose(DateTime close) {
	this.close = close;
    }

    public List<Performance> getPerformances() {
	return performances;
    }

    public void setPerformances(List<Performance> performances) {
	this.performances = performances;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

}