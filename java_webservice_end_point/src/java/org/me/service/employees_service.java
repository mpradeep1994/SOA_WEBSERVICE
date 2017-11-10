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
import org.me.dao.employees_dao;
import org.me.model.employees;

/**
 *
 * @author Aneesh_PC
 */

@WebService(serviceName = "employee_service")
public class employees_service {

  String truno = null;
    employees_dao tdao= new employees_dao();
    employees t =null;
    ArrayList<employees> tlist = null ;
    /**
     * Web service operation
     * 
     */
    @WebMethod(operationName = "getemployeedata")
    public ArrayList<employees> getemployeedata(@WebParam(name = "employeeid") int employeeid) throws Exception {
    //TODO write your implementation code here:
    try{
	 t = new employees();
         tlist = new ArrayList<>( tdao.getemployeedata(employeeid));
         //tdao.gettruckdata(make, model);
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
    
    @WebMethod(operationName = "getempsalary")
    public ArrayList<String> getempsal(int employeeid) {
        //TODO write your implementation code here:
        try{
            t2= tdao.getempsalary(employeeid);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return t2;
    }    
    
}
