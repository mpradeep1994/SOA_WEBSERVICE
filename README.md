# SERVICE ORIENTED ARCHITECTURE - WEBSERVICE

```
•	Building webservice from scratch to build a logistic tracking system.
•	Implemented XML parsers both in DOM and SAX parsers to move the data from XML to Mysql.
•	From MySql the data is sent out as a soap services to the client application which is built using HTML, CSS,
	Javascript and BootStrap. 
```

## Group 1 - TEAM DETAILS
	PRADEEP RAJA MOHAN - A20370429 
	ASWIN -
	ANEESH PARTHA - A20376172 
	
## COMPLETE WEB SERVICE DEMO -Click the Image to watch the demo video

[CLICK VIDEO LINK TO WATCH DEMO - WEBSERVICE](http://www.youtube.com/watch?v=gRU0Mn5_wwQ)
[![IMAGE ALT TEXT HERE](https://user-images.githubusercontent.com/17997235/33510385-42502214-d6d1-11e7-89e0-6cdecdc92db0.png)](http://www.youtube.com/watch?v=gRU0Mn5_wwQ)


	
## IMPLEMENTATION - SERVER SIDE - SOAP SERVICES

### JAVA PERSISTANCE - USING HIBERNATE:

### PROECT EXPLORER - WITH HIBERNATE FILES HIGLIGHTED
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/1.png "Optional title")

### HIBERNATE CONFIGURATION IN - hibernate.cfg.xml
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/2.png "Optional title")

### HIBERNATE HBM FILE - truck.hbm.xml
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/3.png "Optional title")

### POJO CLASS - Truck.java
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/4.png "Optional title")

### SOAP SERVICE DECLARATION USING @ATTRIBUTE  - @WebMethod :GetTruck() - For Truck Service 
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/5.png "Optional title")

### HIBERNATE- FACTORY - SESSION - TRANSACTION OBJECTS TO RETRIVE DATA FROM TRUCK TABLE
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/6.png "Optional title")

### DATA RETRIEVED USING HIBERNATE
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/8.png "Optional title")

### DATABASE - TABLE VALUES
![image](https://github.com/mpradeep1994/SOA_WEBSERVICE/blob/master/images/7.png "Optional title")

### LOGIN PAGE OF APA LOGISTICS

![9](https://user-images.githubusercontent.com/17997235/33510384-4240acf8-d6d1-11e7-8978-7675763691dd.png)

### TWO TYPES OF LOGIN
### 1.CUSTOMER LOGIN
### 2.EMPLOYEE LOGIN

### CUSTOMER LOGIN

![10](https://user-images.githubusercontent.com/17997235/33510385-42502214-d6d1-11e7-89e0-6cdecdc92db0.png)

### USERS WHICH ARE NOT AVAILABLE IN THE DATABASE WILL NOT BE ALLOWED TO LOGIN

![11](https://user-images.githubusercontent.com/17997235/33510386-4263b46e-d6d1-11e7-80d8-1c0be2e5b6ff.png)
### * GET AVAILABLE PRICE IDs
### * GET ORDER DETAILS BASED ON DATE OF ORDER AND AMOUNT


### CUSTOMER INTERACTION PAGE

![12](https://user-images.githubusercontent.com/17997235/33510387-4270d658-d6d1-11e7-9bb6-57e60b794c59.png)

## ORDERS WEB SERVICE
### * GET ALL PRICE IDS AVAILABLE
### * GET ORDER DETAILS BASED ON DATE OF ORDER AND AMOUNT


![13](https://user-images.githubusercontent.com/17997235/33510388-4280b866-d6d1-11e7-9f62-b0a539772a25.png)

### PRICES IDs AVAILABLE IN DATABASE

![14](https://user-images.githubusercontent.com/17997235/33510389-428f4962-d6d1-11e7-97b6-43fe3be13982.png)

### ORDER ON DATE 10-02-2016 AND AMOUNT 6500

![15](https://user-images.githubusercontent.com/17997235/33510390-429ce950-d6d1-11e7-8fa8-faf912d80759.png)

## TRANSACTION WEB SERVICE
### * GET ALL PAYMENT IDs
### * GET PAYMENT DETAILS BASED ON PAYMENT ID AND CARD HOLDER NAME


### GET ALL PAYMENT IDs

![16](https://user-images.githubusercontent.com/17997235/33510391-42a7596c-d6d1-11e7-93e8-d038fb3cb090.png)

### PAYMENT DETAILS FOR PAYMENT ID - P02 AND CARD HOLDER NAME - DINESH

![17](https://user-images.githubusercontent.com/17997235/33510392-42b37fe4-d6d1-11e7-979e-dedd8e8a8bea.png)

## CUSTOMER WEB SERVICE
### * GET CUSTOMER IDs
### * GET CUSTOMER DETAILS BASED ON NAME AND PHONE NUMBER


### CUSTOMER IDs 

![18](https://user-images.githubusercontent.com/17997235/33510393-42c125a4-d6d1-11e7-8358-e6b4a90d10f2.png)

### CUSOTMER DETAILS FOR CUSTOMER NAME - BADRI AND NUMBER - 6466429615


![19](https://user-images.githubusercontent.com/17997235/33510394-42d3bb88-d6d1-11e7-81bb-4337a128b5da.png)

### CUSTOMER CAN LOGOUT ONCE THE CHECKS ARE COMPLETED

![20](https://user-images.githubusercontent.com/17997235/33510395-42e6a5e0-d6d1-11e7-889e-c5c3bd0cb137.png)


![21](https://user-images.githubusercontent.com/17997235/33510396-42f1125a-d6d1-11e7-8a39-7b74db26ccb9.png)

![22](https://user-images.githubusercontent.com/17997235/33510397-4306294c-d6d1-11e7-9d99-3200ef75437a.png)

![23](https://user-images.githubusercontent.com/17997235/33510398-431482bc-d6d1-11e7-9004-c72b5d09c523.png)

![24](https://user-images.githubusercontent.com/17997235/33510399-43269b6e-d6d1-11e7-95f1-7e2d1f3038ac.png)

![25](https://user-images.githubusercontent.com/17997235/33510400-433127d2-d6d1-11e7-9248-4bb6356062a1.png)

![26](https://user-images.githubusercontent.com/17997235/33510401-4345163e-d6d1-11e7-856f-769bb473ac63.png)

![27](https://user-images.githubusercontent.com/17997235/33510402-4351b182-d6d1-11e7-9261-1cb318ab6ade.png)

![28](https://user-images.githubusercontent.com/17997235/33510403-436527e4-d6d1-11e7-98ae-763ec8156454.png)

![29](https://user-images.githubusercontent.com/17997235/33510404-437784d4-d6d1-11e7-8fb2-5e61ce3c64c9.png)

![30](https://user-images.githubusercontent.com/17997235/33510405-4385b8e2-d6d1-11e7-95e1-104b860aa2b9.png)

![31](https://user-images.githubusercontent.com/17997235/33510406-43970ea8-d6d1-11e7-8f4a-e87ad91da094.png)

![32](https://user-images.githubusercontent.com/17997235/33510407-43a761a4-d6d1-11e7-9a97-7865fe02a301.png)
