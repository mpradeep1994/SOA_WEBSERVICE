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
import org.me.dao.customers_dao;
import org.me.dao.truck_dao;
import org.me.model.customers;
import org.me.model.truck;

/**
 *
 * @author Pradeep
 */
@WebService(serviceName = "customers_service")
public class customers_service {
    String truno = null;
    customers_dao tdao= new customers_dao();
    customers t =null;
    ArrayList<customers> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getCustomerDetails")
    public ArrayList<customers> getCustomerDetails(@WebParam(name = "Contact_Name") String Contact_Name, @WebParam(name = "PhoneNumber") String PhoneNumber) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new customers();
         tlist = new ArrayList<>( tdao.getcustomersdata(Contact_Name, PhoneNumber));
         //tdao.gettruckdata(make, model);
         System.out.print(tlist.get(0));
           System.out.print(tlist.get(1));
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    

    /**
     * Web service getTruckNo
     */
        ArrayList<String> t2 = null ; 
    @WebMethod(operationName = "getCustomerID")
    public ArrayList<String> getCustomID() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getCustomerID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
