# /bin/bash

# MYSQL Connection
mysql -uaswin -paswin apa_logistics <<EOF

# Create Tables

CREATE TABLE Customers(
CustomerID NUMERIC(10,2)  NOT NULL,
 CustomerTitle varchar(100),
 BusinessName varchar(100) ,
 Company_Name varchar(100) ,
 Contact_Name varchar(100) ,
 BillingAddress varchar(100),
 City varchar(100),
 StateOrProvince varchar(100),
 PostalCode varchar(100) , 
 Country_Region varchar(100) ,
 PhoneNumber varchar(10),
 CellNumber varchar(10),
 FaxNumber varchar(10) ,
 EmailAddress varchar(100) ,
 contact_number  varchar(100) , 
 Alternate_Contact_Name varchar(100), 
 DateEntered varchar(10),
 sfrom varchar(100),
 to_one varchar(100),
 to_two varchar(100),
 to_three varchar(100),
 status varchar(100)    
)

drop table customers;



CREATE TABLE Locations (
locationID varchar(100)  NOT null
, locName varchar(100)
, locationCode varchar(100)
, isAuction varchar(100)
, address_street1 varchar(100)
, address_street2 varchar(100)
, city varchar(100)
, state varchar(100)
, postalCode varchar(100)
, country_region varchar(100)
, location_contact_name varchar(100)
, locPhone varchar(100)
, locFaxNumber varchar(100)
, locEmail varchar(100)
);



CREATE TABLE Pricing (
priceID NUMERIC(10,2)  NOT NULL 
, CustomerID NUMERIC(10,2)  
, locationIDFrom varchar(100)    
, locationIDTO varchar(100)    
, locationCodeFrom varchar(100)     
, locationCodeTo varchar(100)     
, locationNameFrom varchar(100)    
, locationNameTo varchar(100)    
, price varchar(100)     
);


CREATE TABLE Orders (
OrderID varchar(100)  NOT NULL  
, customerID varchar(50)    
, transaction1ID varchar(100) 
, transaction2ID varchar(100)    
, locationID varchar(100)    
, TruckID NUMERIC(10,2)    
, EmployeeID NUMERIC(10,2)    
, isSPecial varchar(100)    
, PurchaseOrderNumber varchar(100)   
, OrderTotalAmount varchar(100)    
, OrderDate varchar(100)    
, CommentTime varchar(100)   
, comments varchar(100)    
);

drop table orders;


CREATE TABLE Comments (
commentID NUMERIC(10,2)  NOT NULL  
, customerID NUMERIC(10,2)    
, transactionID varchar(100)    
, locationID varchar(100)    
, TruckID NUMERIC(10,2)    
, CommentTime varchar(100)    
, comments varchar(100)    
);

CREATE TABLE Payments (
PaymentID varchar(100)  NOT null
, OrderID varchar(100)    
, PaymentMethodID varchar(100)    
, PaymentAmount varchar(100)    
, PaymentDate varchar(100)    
, ChequeNumber_CreditCard varchar(100)    
, CreditCardNumber varchar(100)    
, CardholdersName varchar(100)    
, CreditCardExpDate varchar(100)    
, CreditCardAuthorizationNumber varchar(100)   
);

CREATE TABLE Transactions (
transactionID varchar(100)  NOT null  
, priceID Varchar(5)    
, employeeID NUMERIC(10,2)    
, transactionDate varchar(100)    
, transactionDescription varchar(100)    
, transactionAmount varchar(100)   
, truckid NUMERIC(10,2)    
, truckNo varchar(100)    
, make varchar(100)    
, model varchar(100)    
, year varchar(100)    
, VIN varchar(100)    
, runNumber varchar(100)    
, quantity varchar(100)    
, discount varchar(100)    
, unitPrice varchar(100)   
, driverPrice varchar(100)    
, rate varchar(100)   
, surcharge varchar(100)    
, special varchar(100)    
);

drop table transactions;

CREATE TABLE Invoices (
invoiceID varchar(100)  NOT null  
, OrderID varchar(100)    
, CustomerID NUMERIC(10,2)    
, PaymentID varchar(100)    
, fromLocationID1 varchar(100)    
, TolocationID1 varchar(100)  
, fromLocationID2 varchar(100)    
, TolocationID2 varchar(100)  
, Description varchar(100)    
, Price varchar(100)   
, Quantity varchar(100)   
, Contact_Name varchar(100)    
, EmailAddress varchar(100)    
);

CREATE TABLE Expenses (
ExpenseID NUMERIC(10,2)  NOT null  
, EmployeeID NUMERIC(10,2)    
, ExpenseType varchar(100)    
, PurposeofExpense varchar(100)    
, AmountSpent varchar(100)    
, Description varchar(100)    
, DatePurchased varchar(100)    
, DateSubmitted varchar(100)    
, AdvanceAmount varchar(100)    
, PaymentMethod varchar(100)    
);

CREATE TABLE Employees (
EmployeeID NUMERIC(10,2)  NOT null  
, FirstName varchar(100)    
, LastName varchar(100)    
, Email varchar(100)    
, Extension varchar(100)    
, HomePhone varchar(100)   
, CellPhone varchar(100)   
, Job_title varchar(100)    
, SocialSecurityNumber varchar(100)    
, DriverLicenseNumber varchar(100)    
, Address varchar(100)    
, City varchar(100)    
, State varchar(100)    
, PostalCode varchar(100)    
, Birthdate varchar(100)    
, DateHired varchar(100)    
, Salary varchar(100)    
, Notes varchar(100)    
);

drop table employees;

CREATE TABLE Trucks (
TruckID NUMERIC(10,2)  NOT null  
, TruckNo varchar(100)    
, Make varchar(100)    
, Year varchar(100)     
, Model varchar(100)    
, Color varchar(100)    
, LicensePlateNo varchar(100)    
, VIN varchar(100)    
)




EOF

# Exit Connection
exit