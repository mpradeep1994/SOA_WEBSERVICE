/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Aneesh_PC
 */
public class invoice_dao {
    
      PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
      ArrayList<String> al = new ArrayList<>();
        String invoiceno ;
    public ArrayList<String> getinvoicedata(String orderid) throws Exception{
    conn = connector.getConnection();

    al = new ArrayList<>();
        try {
            String sql = "SELECT invoiceID FROM Invoices WHERE OrderID  = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, orderid);
            rs = ps.executeQuery();
            while(rs.next()){
                 
       invoiceno = rs.getString("invoiceID");
                al.add(invoiceno);
            }
         }
        catch(Exception e)
        {   

                System.out.println(e.getMessage());
        }
    return al;
    }  

    public String getinvcust(int custid) {
      String a1=null;
        conn = connector.getConnection();
        try{
            String s1 = "select invoiceID from Invoices WHERE CustomerID = ?";
            ps = conn.prepareStatement(s1);
            ps.setInt(1, custid);
            rs = ps.executeQuery();
            while(rs.next()){
                a1 = rs.getString("invoiceID");
         
            }
          }
        catch(Exception ex){
            ex.printStackTrace();
        }
          return a1;
    }
    
}
