/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.orders;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Pradeep
 */
public class orders_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<orders> tlist = null ;
    orders t= null;
    public ArrayList<orders> getordersdata(String OrderDate, String OrderTotalAmount) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Orders WHERE OrderDate = ? and OrderTotalAmount = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, OrderDate);
            ps.setString(2, OrderTotalAmount);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new orders();

                t.setOrderID(rs.getString(1));
                t.setCustomerID(rs.getString(2));
                t.setTransaction1ID(rs.getString(3));
                t.setTransaction2ID(rs.getString(4));
                t.setLocationID(rs.getString(5));
                t.setTruckID(rs.getLong(6));
                t.setEmployeeID(rs.getLong(7));
                t.setIsSPecial(rs.getString(8));
                t.setPurchaseOrderNumber(rs.getString(9));
                t.setOrderTotalAmount((int) rs.getLong(10));
                t.setOrderDate(rs.getString(11));
                t.setCommentTime(rs.getString(12));
                t.setComments(rs.getString(13));

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

    public ArrayList<String> getOrderID() {
      ArrayList<String> al = new ArrayList<>();
        String OrderID;
        conn = connector.getConnection();
        try{
            String s1 = "select OrderID from Orders";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new orders();
                OrderID = rs.getString("OrderID");
                al.add(OrderID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

