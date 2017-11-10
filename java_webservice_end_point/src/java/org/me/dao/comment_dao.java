/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.dao;
import java.sql.Connection;
import org.me.model.comments;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Aneesh_PC
 */
public class comment_dao {
    
    
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<comments> tlist = null ;
    comments t= null;
    public ArrayList<comments> getcommentdetails(int TruckID ) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Comments  WHERE TruckID  = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, TruckID );
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new comments();
                t.setCommentid(rs.getInt("commentID"));
                t.setCustomerid (rs.getInt("customerID"));
                t.setTransactionid (rs.getString("transactionID"));
                t.setLocationid (rs.getString("locationID"));
                t.setTruckid (rs.getString("TruckID"));
                t.setCommenttime (rs.getInt("CommentTime"));
                t.setComment_data (rs.getString("comments"));
                tlist.add(t);
            }
         }
        catch(Exception e)
        {   

                System.out.println(e.getMessage());
        }
    return tlist;
    }  

    public ArrayList getcomments(int customerID) {
      ArrayList al = new ArrayList<>();
        String cust_comments ;
        conn = connector.getConnection();
        try{
            String sql = "SELECT comments FROM Comments WHERE customerID = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, customerID );
            
            rs = ps.executeQuery();
            while(rs.next()){
                cust_comments = rs.getString("comments");
                System.out.print(cust_comments);
                al.add(cust_comments);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
    
}
