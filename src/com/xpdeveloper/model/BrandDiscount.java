package com.xpdeveloper.model;

import java.util.HashMap;

public class BrandDiscount {
    
   public HashMap<String,Integer> disAmount = new HashMap<String,Integer>();
      
    public BrandDiscount() {
        super();
    
    disAmount.put("Wrangler", 10);
    disAmount.put("Arrow", 20);
    disAmount.put("Vero Moda", 60);
    disAmount.put("UCB", 0);
    disAmount.put("Adidas", 5);
    disAmount.put("Provogue", 20);
       
    }


  
}
