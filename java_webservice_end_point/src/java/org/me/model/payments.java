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
public class payments {
    

    private String PaymentID;
    private String OrderID;
    private String PaymentMethodID;
    private String PaymentAmount;
    private String PaymentDate;
    private String check_credit_number;
    private String CreditCardNumber;
    private String cardholdername;
    private String CreditCardExpDate;
    private String CreditCardAuthorizationNumber;



    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public void setPaymentMethodID(String PaymentMethodID) {
        this.PaymentMethodID = PaymentMethodID;
    }

    public void setPaymentAmount(String PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    public void setCheck_credit_number(String check_credit_number) {
        this.check_credit_number = check_credit_number;
    }

    public void setCreditCardNumber(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    public void setCardholdername(String cardholdername) {
        this.cardholdername = cardholdername;
    }

    public void setCreditCardExpDate(String CreditCardExpDate) {
        this.CreditCardExpDate = CreditCardExpDate;
    }

    public void setCreditCardAuthorizationNumber(String CreditCardAuthorizationNumber) {
        this.CreditCardAuthorizationNumber = CreditCardAuthorizationNumber;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public String getPaymentMethodID() {
        return PaymentMethodID;
    }

    public String getPaymentAmount() {
        return PaymentAmount;
    }

    public String getPaymentDate() {
        return PaymentDate;
    }

    public String getCheck_credit_number() {
        return check_credit_number;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public String getCardholdername() {
        return cardholdername;
    }

    public String getCreditCardExpDate() {
        return CreditCardExpDate;
    }

    public String getCreditCardAuthorizationNumber() {
        return CreditCardAuthorizationNumber;
    }
    
}
