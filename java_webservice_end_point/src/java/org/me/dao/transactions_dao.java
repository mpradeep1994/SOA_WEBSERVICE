/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.transactions;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Aswin
 */
public class transactions_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<transactions> tlist = null ;
    transactions t= null;
    public ArrayList<transactions> gettransactionsdata(String transactionDate, String model) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Transactions WHERE transactionDate = ? and transactionAmount = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, transactionDate);
            ps.setString(2, model);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new transactions();
                t.setTransactionID(rs.getString(1));
                t.setSetpriceID(rs.getString(2));
                t.setEmployeeID(rs.getLong(3));
                t.setTransactionDate(rs.getString(4));
                t.setTransactionDescription(rs.getString(5));
                t.setTransactionAmount(rs.getString(6));
                t.setTruckid(rs.getLong(7));
                t.setTruckNo(rs.getString(8));
                t.setMake(rs.getString(9));
                t.setModel(rs.getString(10));
                t.setYear(rs.getString(11));
                t.setVIN(rs.getString(12));
                t.setRunNumber(rs.getString(13));
                t.setQuantity(rs.getString(14));
                t.setDiscount(rs.getString(15));
                t.setUnitPrice(rs.getString(16));
                t.setDriverPrice(rs.getString(17));
                t.setRate(rs.getString(18));
                t.setSurcharge(rs.getString(19));
                t.setSpecial(rs.getString(20));

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

    public ArrayList<String> gettransactionID() {
      ArrayList<String> al = new ArrayList<>();
        String transactionID ;
        conn = connector.getConnection();
        try{
            String s1 = "select transactionID from Transactions";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new transactions();
                transactionID = rs.getString("transactionID");
                al.add(transactionID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

