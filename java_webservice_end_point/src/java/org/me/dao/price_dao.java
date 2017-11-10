/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.pricing;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
    

/**
 *
 * @author Aswin
 */
public class price_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<pricing> tlist = null ;
    pricing t= null;
    public ArrayList<pricing> getpricedata(String locationNameFrom, String locationNameTo) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Pricing WHERE locationNameFrom = ? and locationNameTo = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, locationNameFrom);
            ps.setString(2, locationNameTo);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new pricing();
                t.setPriceID(rs.getLong(1));
                t.setCustomerID(rs.getString(2));
                t.setLocationIDFrom(rs.getString(3));
                t.setLocationIDTO(rs.getString(4));
                t.setLocationCodeFrom(rs.getString(5));
                t.setLocationCodeTo(rs.getString(6));
                t.setLocationNameFrom(rs.getString(7));
                t.setLocationNameTo(rs.getString(8));
                t.setPrice(rs.getString(9));
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

    public ArrayList<String> getpriceID() {
      ArrayList<String> al = new ArrayList<>();
        String priceID ;
        conn = connector.getConnection();
        try{
            String s1 = "select priceID from Pricing";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new pricing();
                priceID = rs.getString("priceID");
                al.add(priceID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

