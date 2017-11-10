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

public class invoices {
  
    private String invoiceid;
    private String description;
    private int price;
    private int quantity;
    private String contact_name;
    private String email_address;

    public void setInvoiceid(String invoiceid) {
        this.invoiceid = invoiceid;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getInvoiceid() {
        return invoiceid;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getContact_name() {
        return contact_name;
    }

    public String getEmail_address() {
        return email_address;
    }
        
}
