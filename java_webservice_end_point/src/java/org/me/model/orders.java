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

public class orders {
    private String OrderID;
    private String isSPecial;
    private String PurchaseOrderNumber;
    private int OrderTotalAmount;
    private String OrderDate;
    private String CommentTime;
    private String comments;
    private String customerID;
    private String transaction1ID;
    private String transaction2ID;
    private String locationID;
    private Long TruckID;
    private Long EmployeeID;

    public String getOrderID() {
        return OrderID;
    }

    public String getIsSPecial() {
        return isSPecial;
    }

    public String getPurchaseOrderNumber() {
        return PurchaseOrderNumber;
    }

    public int getOrderTotalAmount() {
        return OrderTotalAmount;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public String getCommentTime() {
        return CommentTime;
    }

    public String getComments() {
        return comments;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getTransaction1ID() {
        return transaction1ID;
    }

    public String getTransaction2ID() {
        return transaction2ID;
    }

    public String getLocationID() {
        return locationID;
    }

    public Long getTruckID() {
        return TruckID;
    }

    public Long getEmployeeID() {
        return EmployeeID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setIsSPecial(String isSPecial) {
        this.isSPecial = isSPecial;
    }

    public void setPurchaseOrderNumber(String PurchaseOrderNumber) {
        this.PurchaseOrderNumber = PurchaseOrderNumber;
    }

    public void setOrderTotalAmount(int OrderTotalAmount) {
        this.OrderTotalAmount = OrderTotalAmount;
    }

    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    public void setCommentTime(String CommentTime) {
        this.CommentTime = CommentTime;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public void setTransaction1ID(String transaction1ID) {
        this.transaction1ID = transaction1ID;
    }

    public void setTransaction2ID(String transaction2ID) {
        this.transaction2ID = transaction2ID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public void setTruckID(Long TruckID) {
        this.TruckID = TruckID;
    }

    public void setEmployeeID(Long EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    
}
