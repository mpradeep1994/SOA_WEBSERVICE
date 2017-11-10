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
import org.me.dao.payments_dao;
import org.me.model.payments;

/**
 *
 * @author Aswin
 */
@WebService(serviceName = "payments_service")
public class payments_service {
    String truno = null;
    payments_dao tdao= new payments_dao();
    payments t =null;
    ArrayList<payments> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getpaymentsDetails")
    public ArrayList<payments> payments(@WebParam(name = "PaymentID") String PaymentID, @WebParam(name = "CardholdersName") String CardholdersName) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new payments ();
         tlist = new ArrayList<>( tdao.getpaymentsdata(PaymentID, CardholdersName));
         //tdao.getpaymentsdata(PaymentID, CardholdersName);

      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
 
    /**
     * Web service getPaymentID
     */
       ArrayList<String> t2 = null ; 
    @WebMethod(operationName = "getPaymentID")
    public ArrayList<String> getPaymentID() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getPaymentID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
