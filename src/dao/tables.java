 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class tables {
    public static void main(String[] args){  
        try{
            String userTable = "create table user(id int  AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(11),address varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar (200))";
            String adminDetails = "insert into user(name,email,mobileNumber,address,password,securityQuestion,answer,status) values('admin','admin@gmail.com','01234567890','Bangladesh','admin','what primary school did you attend?','ABC','true')";
            String productTable = "create table product (id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable= "create table bill(id int primary key,name varchar (200),mobileNumber varchar(200), email varchar(200),date varchar(50),total varchar(500), createdBy varchar(200))";
            DbOperations.setDataOrDelete(userTable,"User Table Created Successfully");
            DbOperations.setDataOrDelete(categoryTable,"Category Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails,"Admin details added Successfully");
            DbOperations.setDataOrDelete(productTable,"Product Table Created Successfully");
            DbOperations.setDataOrDelete(billTable,"Bill Table Created Successfully");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
                    }
    }
}
