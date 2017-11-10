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
import org.me.dao.orders_dao;
import org.me.model.orders;

/**
 *
 * @author Aswin
 */
@WebService(serviceName = "orders_service")
public class orders_service {
    String truno = null;
    orders_dao tdao= new orders_dao();
    orders t =null;
    ArrayList<orders> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getordersDetails")
    public ArrayList<orders> getordersDetails(@WebParam(name = "OrderDate") String OrderDate, @WebParam(name = "OrderTotalAmount") String OrderTotalAmount) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new orders ();
         tlist = new ArrayList<>( tdao.getordersdata(OrderDate, OrderTotalAmount));
         //tdao.getordersdata(OrderDate, OrderTotalAmount);
         System.out.print(tlist.get(0));
           System.out.print(tlist.get(1));
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
    
    /**
     * Web service getOrderID
     */
    ArrayList<String> t2 = null ; 
    @WebMethod(operationName = "getOrderID")
    public ArrayList<String> getOrderID() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getOrderID();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
