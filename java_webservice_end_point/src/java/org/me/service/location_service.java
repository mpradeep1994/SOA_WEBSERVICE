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
import org.me.dao.location_dao;
import org.me.model.locations;
import org.me.model.truck;

/**
 *
 * @author Pradeep
 */

@WebService(serviceName = "location_service")
public class location_service {
    locations l= null;
    location_dao dao= new location_dao();
     ArrayList<locations> tlist = null ;
    @WebMethod(operationName = "getLocationbyId")
    public ArrayList<locations> operation(@WebParam(name = "locationid") String locationid) throws Exception {
        //TODO write your implementation code here:
      try {	
         tlist = dao.getLocbyid(locationid);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return tlist;
     
    } 

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLocation_ID")
    public String getLocation_ID(@WebParam(name = "locationCode") String locationCode , @WebParam(name = "locationName") String locationName) {
    String ID = null;
        try {	
         ID = dao.getLocation_id(locationCode, locationName);
      } catch (Exception e) {
         e.printStackTrace();
      }
       return ID;
    }
   
}
