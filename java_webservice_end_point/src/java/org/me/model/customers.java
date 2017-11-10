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
public class customers {
    
                private int customerid;
                private String customerTitle;   
                private String businessName;   
                private String bontact_Name;   
                private String phoneNumber;

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerID) {
        this.customerid = customerID;
    }

    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public void setBontact_Name(String bontact_Name) {
        this.bontact_Name = bontact_Name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerTitle() {
        return customerTitle;
    }

    public String getBusinessName() {
        return businessName;
    }

    public String getBontact_Name() {
        return bontact_Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
