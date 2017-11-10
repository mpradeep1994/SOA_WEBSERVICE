package org.me.service;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.me.dao.transactions_dao;
import org.me.model.transactions;

/**
 *
 * @author Aswin
 */
@WebService(serviceName = "transactions_service")
public class transactions_service {
    String truno = null;
    transactions_dao tdao= new transactions_dao();
    transactions t =null;
    ArrayList<transactions> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "gettransactionsDetails")
    public ArrayList<transactions> transactions(@WebParam(name = "transactionDate") String transactionDate, @WebParam(name = "transactionAmount") String transactionAmount) throws Exception {
    //TODO write your implementation code here:
    try{
     t = new transactions ();
         tlist = new ArrayList<>( tdao.gettransactionsdata(transactionDate, transactionAmount));
         //tdao.gettransactionsdata(transactionDate, transactionAmount);
    
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
    ArrayList<String> t2 = null ; 
    /**
     * Web service gettransactionsNo
     */
    
    @WebMethod(operationName = "gettransactionID")
    public ArrayList<String> gettransactionID() {
        //TODO write your implementation code here:
        try{
            t2= tdao.gettransactionID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
