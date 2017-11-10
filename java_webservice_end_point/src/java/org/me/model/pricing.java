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

public class pricing {
    
    private Long priceID;
    private String price;
    private String CustomerID;
    private String locationIDFrom;
    private String locationIDTO;
    private String locationCodeFrom;
    private String locationCodeTo;
    private String locationNameFrom;
    private String locationNameTo;
    

    public Long getPriceID() {
        return priceID;
    }

    public String getPrice() {
        return price;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public String getLocationIDFrom() {
        return locationIDFrom;
    }

    public String getLocationIDTO() {
        return locationIDTO;
    }

    public String getLocationCodeFrom() {
        return locationCodeFrom;
    }

    public String getLocationCodeTo() {
        return locationCodeTo;
    }

    public String getLocationNameFrom() {
        return locationNameFrom;
    }

    public String getLocationNameTo() {
        return locationNameTo;
    }

    public void setPriceID(Long priceID) {
        this.priceID = priceID;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setLocationIDFrom(String locationIDFrom) {
        this.locationIDFrom = locationIDFrom;
    }

    public void setLocationIDTO(String locationIDTO) {
        this.locationIDTO = locationIDTO;
    }

    public void setLocationCodeFrom(String locationCodeFrom) {
        this.locationCodeFrom = locationCodeFrom;
    }

    public void setLocationCodeTo(String locationCodeTo) {
        this.locationCodeTo = locationCodeTo;
    }

    public void setLocationNameFrom(String locationNameFrom) {
        this.locationNameFrom = locationNameFrom;
    }

    public void setLocationNameTo(String locationNameTo) {
        this.locationNameTo = locationNameTo;
    }

    
}
