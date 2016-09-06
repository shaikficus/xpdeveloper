/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpdeveloper.model;

import java.util.HashMap;

/**
 *
 * @author smusthafa
 */
public class Category {
     public HashMap<String,Integer> catDisAmount = new HashMap<String,Integer>();

    public Category() {
          
     catDisAmount.put("Casuals", 30);
     catDisAmount.put("Jeans", 20);
     catDisAmount.put("Dresses", 50);
     catDisAmount.put("Footwear", 50);
     catDisAmount.put("Shirts", 0);
     catDisAmount.put("Trousers", 0);  
        
    }
    
    
    
}
