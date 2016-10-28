/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rubel.app.gui.provider;

import com.rubel.app.model.User;
import java.util.List;
import javax.swing.table.TableModel;

/**
 *
 * @author Rubel Sarker
 */
public class UserTableProvider {
   
     public TableModel getTableModel(List<User> users){
        
        Object [][] data= new Object [users.size()][2];
        for(int i =0; i<users.size(); i++){
            User user  = users.get(i);
            data[i][0] = user.getEmail();
            data[i][1] = user.getUserName();
        
        }
        String[] headers= getTableHeaders();
        TableModel tbModel= new javax.swing.table.DefaultTableModel(data,headers);
        return tbModel;
     }
             
     private String[] getTableHeaders(){
         return new String[]{"Name", "Email"};
     }
}
