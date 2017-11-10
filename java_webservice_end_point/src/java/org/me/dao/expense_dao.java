/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.dao;
import java.sql.Connection;
import org.me.model.expense;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Pradeep
 */
public class expense_dao {
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<expense> tlist = null ;
    expense t= null;
    public ArrayList<expense> getexpensedata(String ExpenseType, String AmountSpent) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM expenses WHERE ExpenseType = ? and AmountSpent = ? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ExpenseType);
            ps.setString(2, AmountSpent);
            rs = ps.executeQuery();
            while(rs.next()){
                 
                t = new expense();

                t.setExpenseID(rs.getString(1));
                t.setEmployeeID(rs.getString(2));
                t.setExpenseType(rs.getString(3));
                t.setPurposeofExpense(rs.getString(4));
                t.setAmountSpent(rs.getString(5));
                t.setDescription(rs.getString(6));
                t.setDatePurchased(rs.getString(7));
                t.setDateSubmitted(rs.getString(8));
                t.setAdvanceAmount(rs.getString(9));
                t.setPaymentMethod(rs.getString(10));

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

    public ArrayList<String> getExpenseID() {
      ArrayList<String> al = new ArrayList<>();
        String ExpenseID ;
        conn = connector.getConnection();
        try{
            String s1 = "select ExpenseID from expenses";
            ps = conn.prepareStatement(s1);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new expense();
                ExpenseID = rs.getString("ExpenseID");
                al.add(ExpenseID);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
}

