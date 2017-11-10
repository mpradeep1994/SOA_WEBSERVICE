/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.model;

/**
 *
 * @author Pradeep
 */

public class comments {
    
    private int commentid;
    private int commenttime;
    private String comment_data;
     customers cust = new customers();
     transactions trans = new transactions();
     locations loc = new locations();
     truck truc = new truck();
	
	public void setCustomerid(int customerId){
		
		cust.setCustomerid(customerId);
		
	}
	
	public int getcustomerid(){
		
		return cust.getCustomerid();
		
	}
        
      public void setTransactionid(String transactionID){
      
      trans.setTransactionID(transactionID);
      
      }
      
      public String getTransactionid(){
      
          return trans.getTransactionID();
      
      }
      
      public void setLocationid(String locationID){
      
      loc.setLocationid(locationID);
      
      }
      
      public String getlocationid(){
      
          return loc.getLocationid();
      
      }
      
          public void setTruckid(String Truckid){
      
      truc.setTruckID(Truckid);
      
      }
      
      public String getTruckid(){
      
          return truc.getTruckID();
      
      }
	
    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }

     public void setCommenttime(int commenttime) {
        this.commenttime = commenttime;
    }

    public void setComment_data(String comment_data) {
        this.comment_data = comment_data;
    }

    public int getCommentid() {
        return commentid;
    }

   
    public int getCommenttime() {
        return commenttime;
    }

    public String getComment_data() {
        return comment_data;
    }
    
}
