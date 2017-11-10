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
import org.me.model.locations;


/**
 *
 * @author Pradeep
 */
public class location_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<locations> tlist = null ;
    locations t= null;
   public ArrayList<locations> getLocbyid(String locationid) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM locations WHERE locationID = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, locationid);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new locations();
                t.setAddress_street1(rs.getString("address_street1"));
                t.setAddress_street2(rs.getString("address_street2"));
                t.setCity(rs.getString("city"));
                t.setCountry_region(rs.getString("country_region"));
                t.setLocation_contact_name(rs.getString("location_contact_name"));
                t.setLocation_phone(rs.getLong("locphone"));
                t.setLocationcode(rs.getString("Locationcode"));
                t.setLocationid(rs.getString("locationid"));
                t.setLocemail(rs.getString("locemail"));
                t.setLocfaxnumber(rs.getLong("locfaxnumber"));
                t.setLocname(rs.getString("locname"));
                t.setPostalcode(rs.getLong("postalcode"));
                t.setState(rs.getString("state"));
                
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

    public String getLocation_id(String locationCode, String locationName) throws Exception{
    String ID = null;    
        conn = connector.getConnection();
	try{
            String sql="SELECT locationID FROM locations WHERE locName = ? and locationCode = ?  ";
            ps=conn.prepareStatement(sql);
            ps.setString(1, locationName);
            ps.setString(2, locationCode);
            rs=ps.executeQuery();
            try {
                while(rs.next()){
                 ID = rs.getString("locationID");
                }
             }   
            catch(Exception ex)
            {
                    ex.printStackTrace();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }  
                       
                
return ID;
		
    }
 
}

