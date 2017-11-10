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
public class truck {
 
    private String TruckID;
    private String TruckNo;
    private String Make ;
    private String Year ;
    private String Model;
    private String Color ;
    private String LicensePlateNo;
    private String VIN;

    public void setTruckID(String TruckID) {
        this.TruckID = TruckID;
    }

    public void setTruckNo(String TruckNo) {
        this.TruckNo = TruckNo;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setLicensePlateNo(String LicensePlateNo) {
        this.LicensePlateNo = LicensePlateNo;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getTruckID() {
        return TruckID;
    }

    public String getTruckNo() {
        return TruckNo;
    }

    public String getMake() {
        return Make;
    }

    public String getYear() {
        return Year;
    }

    public String getModel() {
        return Model;
    }

    public String getColor() {
        return Color;
    }

    public String getLicensePlateNo() {
        return LicensePlateNo;
    }

    public String getVIN() {
        return VIN;
    }
}
