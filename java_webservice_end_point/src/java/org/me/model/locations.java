/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.model;

/**
 *
 * @author Pradeep
 */
public class locations {
    
    private String locationid;
    private String locname;
    private String locationcode;
    private String isAuction;
    private String address_street1;
    private String address_street2;
    private String city;
    private String state;
    private long postalcode;
    private String country_region;
    private String location_contact_name;
    private long location_phone;
    private long locfaxnumber;
    private String locemail;

    public void setLocationid(String locationid) {
        this.locationid = locationid;
    }

    public void setLocname(String locname) {
        this.locname = locname;
    }

    public void setLocationcode(String locationcode) {
        this.locationcode = locationcode;
    }

    public void setIsAuction(String isAuction) {
        this.isAuction = isAuction;
    }

    public void setAddress_street1(String address_street1) {
        this.address_street1 = address_street1;
    }

    public void setAddress_street2(String address_street2) {
        this.address_street2 = address_street2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPostalcode(long postalcode) {
        this.postalcode = postalcode;
    }

    public void setCountry_region(String country_region) {
        this.country_region = country_region;
    }

    public void setLocation_contact_name(String location_contact_name) {
        this.location_contact_name = location_contact_name;
    }

    public void setLocation_phone(long location_phone) {
        this.location_phone = location_phone;
    }

    public void setLocfaxnumber(long locfaxnumber) {
        this.locfaxnumber = locfaxnumber;
    }

    public void setLocemail(String locemail) {
        this.locemail = locemail;
    }

    public String getLocationid() {
        return locationid;
    }

    public String getLocname() {
        return locname;
    }

    public String getLocationcode() {
        return locationcode;
    }

    public String getIsAuction() {
        return isAuction;
    }

    public String getAddress_street1() {
        return address_street1;
    }

    public String getAddress_street2() {
        return address_street2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public long getPostalcode() {
        return postalcode;
    }

    public String getCountry_region() {
        return country_region;
    }

    public String getLocation_contact_name() {
        return location_contact_name;
    }

    public long getLocation_phone() {
        return location_phone;
    }

    public long getLocfaxnumber() {
        return locfaxnumber;
    }

    public String getLocemail() {
        return locemail;
    }
       
}
