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
import org.me.dao.invoice_dao;
import org.me.model.invoices;


/**
 *
 * @author Aneesh_PC
 */

@WebService(serviceName = "invoice_service")
public class invoices_service {
    
     String truno = null;
    invoice_dao tdao= new invoice_dao();
    invoices t =null;
    ArrayList<String> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getinvoicedata")
    public ArrayList<String> getinvoicedata(@WebParam(name = "orderid") String orderid) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new invoices ();
         tlist = new ArrayList<String>( tdao.getinvoicedata(orderid));
         //tdao.gettruckdata(make, model);
 
      } 
    catch (Exception e) {
         e.printStackTrace();
      }
     return tlist;
    }
    
   
    /**
     * Web service getTruckNo
     */
    String t2 = null ; 
    @WebMethod(operationName = "getinvcust")
    public String getNo(int custid) {
        //TODO write your implementation code here:
        try{
            t2= tdao.getinvcust(custid);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }
    
    
}
