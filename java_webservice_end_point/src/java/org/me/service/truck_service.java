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
import org.me.dao.truck_dao;
import org.me.model.truck;
/**
 *
 * @author Pradeep
 */

@WebService(serviceName = "truck_service")
public class truck_service {
    String truno = null;
    truck_dao tdao= new truck_dao();
    truck t =null;
    ArrayList<truck> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getTruckDetails")
    public ArrayList<truck> truck(@WebParam(name = "make") String make, @WebParam(name = "model") String model) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new truck ();
         tlist = new ArrayList<>( tdao.gettruckdata(make, model));
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
    @WebMethod(operationName = "getTruckNooo")
    public ArrayList<String> getTruckNooo() {
        //TODO write your implementation code here:
        try{
            t2= tdao.getTruckNo();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
