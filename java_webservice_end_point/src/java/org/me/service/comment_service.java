/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.service;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.me.dao.comment_dao;
import org.me.model.comments;

/**
 *
 * @author Aneesh_PC
 */

@WebService(serviceName = "comment_service")
public class comment_service {
    
    String truno = null;
    comment_dao tdao= new comment_dao();
    comments t =null;
    ArrayList<comments> tlist = null ;

    /**
     * Web service operation
     */
     @WebMethod(operationName = "getcommentdetails")
    public ArrayList<comments> comment(@WebParam(name = "TruckId") int TruckID) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new comments();
         tlist = new ArrayList<>( tdao.getcommentdetails(TruckID));
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    ArrayList<String> t2 = null ; 
    /**
     * Web service getTruckNo
     */
    
    @WebMethod(operationName = "getTruckNo")
    public ArrayList getTruckNo(@WebParam(name = "customerID") int customerID) {
        //TODO write your implementation code here:
        try{
            t2= tdao.getcomments(customerID);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
}
