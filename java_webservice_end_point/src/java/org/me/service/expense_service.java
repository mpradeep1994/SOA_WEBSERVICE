/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.service;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.me.dao.expense_dao;
import org.me.model.expense;

/**
 *
 * @author Pradeep
 */
@WebService(serviceName = "expense_service")
public class expense_service {
    String truno = null;
    expense_dao tdao= new expense_dao();
    expense t =null;
    ArrayList<expense> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getexpenseDetails")
    public ArrayList<expense> expense(@WebParam(name = "ExpenseType") String ExpenseType, @WebParam(name = "AmountSpent") String AmountSpent) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new expense ();
         tlist = new ArrayList<>( tdao.getexpensedata(ExpenseType, AmountSpent));
         //tdao.getexpensedata(ExpenseType, AmountSpent);
         System.out.print(tlist.get(0));
           System.out.print(tlist.get(1));
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
    ArrayList<String> t2 = null ; 
    /**
     * Web service getExpenseID
     */
    
    @WebMethod(operationName = "getExpenses")
    public ArrayList<String> getExpenses() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getExpenseID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
