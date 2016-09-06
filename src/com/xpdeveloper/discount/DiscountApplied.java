/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpdeveloper.discount;

import com.xpdeveloper.model.BrandDiscount;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smusthafa
 */
public class DiscountApplied {
    
    int dicountApplied;

    public DiscountApplied() {
        super();
    }
    
 public  int getDisAmount(int brandDis, int catDis, int priceAmt){
     if(brandDis>catDis){
     dicountApplied =     (priceAmt*brandDis)/100;
     
     }else{
     dicountApplied =     (priceAmt*catDis)/100;
     
     }
     return dicountApplied;
 
 }
          
    
}
