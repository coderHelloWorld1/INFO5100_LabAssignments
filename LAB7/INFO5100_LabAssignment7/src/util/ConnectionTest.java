/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import model.User;

/**
 *
 * @author Purvam Sheth
 */
public class ConnectionTest {
    public static void main(String[] args){
        
        
        ArrayList<User> user = DatabaseConnector.getAllusers();
        
        for(User u: user){
            System.out.println(u.getId());
            System.out.println(u.getLegalName());
            System.out.println(u.getUserName());
            System.out.println(u.getEmailId());
            System.out.println(u.getPhoneNumber());
            System.out.println("");
        } 

//        User u1 = new User();
//        u1.setEmailId("sheth@gmail.com");
//        u1.setLegalName("Purvam");
//        u1.setPhoneNumber("5874125470");
//        u1.setUserName("pur10");
//        
//        DatabaseConnector.addUser(u1);
        
        
//        User u2 = new User();
//        u2.setEmailId("purvam@gmail.com");
//        u2.setLegalName("Purvam");
//        u2.setPhoneNumber("5874125470");
//        u2.setUserName("pur11");
//        u2.setId(user.get(10).getId());
//        
//        DatabaseConnector.editUser(user.get(10), u2);



//        DatabaseConnector.deleteUser(user.get(10));
    }    
}
