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
public class expense{
    
                private String ExpenseID;  
                private String EmployeeID;  
                private String ExpenseType; 
                private String PurposeofExpense;
                private String AmountSpent;  
                private String Description;  
                private String DatePurchased; 
                private String DateSubmitted;  
                private String AdvanceAmount;  
                private String PaymentMethod;  
                
    public void setExpenseID(String ExpenseID) {
        this.ExpenseID = ExpenseID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public void setExpenseType(String ExpenseType) {
        this.ExpenseType = ExpenseType;
    }

    public void setPurposeofExpense(String PurposeofExpense) {
        this.PurposeofExpense = PurposeofExpense;
    }

    public void setAmountSpent(String AmountSpent) {
        this.AmountSpent = AmountSpent;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setDatePurchased(String DatePurchased) {
        this.DatePurchased = DatePurchased;
    }

    public void setDateSubmitted(String DateSubmitted) {
        this.DateSubmitted = DateSubmitted;
    }

    public void setAdvanceAmount(String AdvanceAmount) {
        this.AdvanceAmount = AdvanceAmount;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }
    


    public String getExpenseID() {
        return ExpenseID;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public String getExpenseType() {
        return ExpenseType;
    }

    public String getPurposeofExpense() {
        return PurposeofExpense;
    }

    public String getAmountSpent() {
        return AmountSpent;
    }

    public String getDescription() {
        return Description;
    }

    public String getDatePurchased() {
        return DatePurchased;
    }

    public String getDateSubmitted() {
        return DateSubmitted;
    }

    public String getAdvanceAmount() {
        return AdvanceAmount;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }
    

}
