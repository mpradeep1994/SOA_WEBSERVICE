/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.payments;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Aswin
 */
public class payments_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<payments> tlist = null ;
    payments t= null;
    public ArrayList<payments> getpaymentsdata(String PaymentID, String CardholdersName) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM payments WHERE PaymentID = ? and CardholdersName = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, PaymentID);
            ps.setString(2, CardholdersName);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new payments();
                t.setPaymentID(rs.getString(1));
                t.setOrderID(rs.getString(2));
                t.setPaymentMethodID(rs.getString(3));
                t.setPaymentAmount(rs.getString(4));
                t.setPaymentDate(rs.getString(5));
                t.setCheck_credit_number(rs.getString(6));
                t.setCreditCardNumber(rs.getString(7));
                t.setCardholdername(rs.getString(8));
                t.setCreditCardExpDate(rs.getString(9));
                t.setCreditCardAuthorizationNumber(rs.getString(10));
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

    public ArrayList<String> getPaymentID() {
      ArrayList<String> al = new ArrayList<>();
        String PaymentID ;
        conn = connector.getConnection();
        try{
            String s1 = "select PaymentID from Payments";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new payments();
                PaymentID = rs.getString("PaymentID");
                al.add(PaymentID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

