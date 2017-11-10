/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.truck;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Pradeep
 */
public class truck_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<truck> tlist = null ;
    truck t= null;
    public ArrayList<truck> gettruckdata(String make, String model) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Trucks WHERE make = ? and model = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, make);
            ps.setString(2, model);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new truck();
                t.setColor(rs.getString(6));
                t.setLicensePlateNo(rs.getString(7));
                t.setMake(rs.getString(3));
                t.setModel(rs.getString(5));
                t.setTruckID(rs.getString(1));
                t.setTruckNo(rs.getString(2));
                t.setVIN(rs.getString(8));
                t.setYear(rs.getString(4));
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

    public ArrayList<String> getTruckNo() {
      ArrayList<String> al = new ArrayList<>();
        String truckNo ;
        conn = connector.getConnection();
        try{
            String s1 = "select TruckNo from Trucks";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new truck();
                truckNo = rs.getString("TruckNo");
                al.add(truckNo);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

