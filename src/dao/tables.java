package dao;

import javax.swing.JOptionPane;


public class tables {
    public static void main(String[] args){
        try{
            String userTable= "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200), mobileNumber varchar(10),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE(email))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','India','admin','What primary school did you attend?','ABC','true')";
            String categoryTable="create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable="create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200), price varchar (200))";
            String billTable="create table bill(id int primary key,name varchar(200),mobileNumber varchar(10),email varchar(200),date varchar(200),category varchar(50),total varchar (200),createdBy varchar(200))";
            DbOperations.setDataOrDelete(userTable,"User Table Created Sucessfully");
            DbOperations.setDataOrDelete(adminDetails,"Admin Details Added Sucessfully");
            DbOperations.setDataOrDelete(categoryTable,"Category Table Created Sucessfully");
            DbOperations.setDataOrDelete(productTable,"Product Table Created Sucessfully");
            DbOperations.setDataOrDelete(billTable," Table Created Sucessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
