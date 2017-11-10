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
import org.me.model.employees;

/**
 *
 * @author Aneesh_PC
 */
public class employees_dao {
    
    PreparedStatement ps =null;
    Statement statement= null;
    ResultSet rs=null;
    Connection conn = null ;   
    ArrayList<employees> tlist = null ;
    employees t= null;
    public ArrayList<employees> getemployeedata(int employeeid) throws Exception{
    conn = connector.getConnection();

    tlist = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Employees WHERE EmployeeID = ? ";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, employeeid);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new employees();
                t.setEmployeeid(rs.getString("EmployeeID"));
                t.setFirstname(rs.getString("FirstName"));
                t.setLastname(rs.getString("LastName"));
                t.setEmail(rs.getString("Email"));
                t.setExtension(Integer.parseInt(rs.getString("Extension")));
                t.setHomephone(Integer.parseInt(rs.getString("HomePhone")));
                t.setCellphone(Integer.parseInt(rs.getString("CellPhone")));
                t.setJob_title(rs.getString("Job_title"));
                t.setSsn(Integer.parseInt(rs.getString("SocialSecurityNumber")));
                t.setDlnumber(rs.getString("DriverLicenseNumber"));
                t.setAddress(rs.getString("Address"));
                t.setCity(rs.getString("City"));
                t.setState(rs.getString("State"));
                t.setPostalcode(Integer.parseInt(rs.getString("PostalCode")));
                t.setBirthdate(rs.getString("Birthdate"));
                t.setDatehired(rs.getString("DateHired"));
                t.setSalary(Integer.parseInt(rs.getString("Salary")));
                t.setNotes(rs.getString("Notes"));
                tlist.add(t);
            }
         }
        catch(Exception e)
        {   

                System.out.println(e.getMessage());
        }
    return tlist;
    }  

    public ArrayList<String> getempsalary(int EmployeeId) {
      ArrayList<String> al = new ArrayList<>();
        String salary ;
        conn = connector.getConnection();
        try{
            String s1 = "select Salary from Employees where EmployeeID = ?";
            ps = conn.prepareStatement(s1);
            ps.setInt(1, EmployeeId);
            rs = ps.executeQuery();
            while(rs.next()){
                t = new employees();
                salary = rs.getString("Salary");
                al.add(salary);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return al; 
    }
    
}
