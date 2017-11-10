/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.customers;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Pradeep
 */
public class customers_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<customers> tlist = null ;
    customers t= null;
    public ArrayList<customers> getcustomersdata(String Contact_Name, String PhoneNumber) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM customers WHERE Contact_Name = ? and PhoneNumber = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, Contact_Name);
            ps.setString(2, PhoneNumber);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new customers();

                t.setCustomerid(rs.getInt(1));
                t.setCustomerTitle(rs.getString(2));
                t.setBusinessName(rs.getString(3));
                t.setPhoneNumber(rs.getString(5));
                System.out.print(t.toString());
                tlist.add(t);
            }
         }
        catch(Exception e)
        {   

                System.out.println(e.getMessage());
        }
    return tlist;
    }  

    public ArrayList<String> getCustomerID() {
      ArrayList<String> al = new ArrayList<>();
        String CustomerID ;
        conn = connector.getConnection();
        try{
            String s1 = "select CustomerID from customers";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new customers();
                CustomerID = rs.getString("CustomerID");
                al.add(CustomerID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

