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
import org.me.dao.price_dao;
import org.me.model.pricing;

/**
 *
 * @author Aswin
 */
@WebService(serviceName = "price_service")
public class price_service {
    String truno = null;
    price_dao tdao= new price_dao();
    pricing t =null;
    ArrayList<pricing> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getpricingDetails")
    public ArrayList<pricing> getpricingDetails(@WebParam(name = "locationNameFrom") String locationNameFrom, @WebParam(name = "locationNameTo") String locationNameTo) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new pricing ();
         tlist = new ArrayList<>( tdao.getpricedata(locationNameFrom, locationNameTo));
         //tdao.getpricingdata(pricingID, CustomerID);
 
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
    ArrayList<String> t2 = null ; 
    /**
     * Web service getpricingNo
     */
    
    @WebMethod(operationName = "getpricingID")
    public ArrayList<String> getpricingID() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getpriceID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
