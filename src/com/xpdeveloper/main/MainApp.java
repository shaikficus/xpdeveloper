/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpdeveloper.main;

import com.xpdeveloper.model.InventoryModel;
import com.xpdeveloper.model.BrandDiscount;
import com.xpdeveloper.model.Category;
import com.xpdeveloper.discount.DiscountApplied;
import com.xpdeveloper.data.DataSource;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

/**
 *
 * @author smusthafa
 */
public class MainApp {
    
    public static Integer totAmount =0;

    public MainApp() {
    }

    public static void main(String[] args) throws IOException {
        List<Integer> customerChoice = new ArrayList<Integer>();
        customerChoice.add(1);
        customerChoice.add(2);
        customerChoice.add(3);
        customerChoice.add(4);

        DiscountApplied da = new DiscountApplied();
        BrandDiscount brandDiscount = new BrandDiscount();
        Category category = new Category();
        DataSource ds = new DataSource();
        List<InventoryModel> invStore = ds.loadInventory();
        System.out.println("=================================================================");
        System.err.println("ID | Brand             |Category      |price   |");
        for (InventoryModel mainCat : invStore) {
            System.out.println(mainCat.getId() + " |  " + mainCat.getBrand() + " | " + mainCat.getCategory()+" | "+mainCat.getPrice());

        }
        System.out.println("=================================================================\n");
        System.out.println("Your Cart and Invoice\n");
        System.out.println("=================================================================\n");
        //System.out.println(invStore.get(1).getBrand());

        for (Integer number : customerChoice) {
            Integer amountPaid = (invStore.get((number - 1)).getPrice()-da.getDisAmount(brandDiscount.disAmount.get(invStore.get((number - 1)).getBrand()), category.catDisAmount.get(invStore.get((number - 1)).getCategory()), invStore.get((number - 1)).getPrice()));
            System.out.println(number+"|"+invStore.get((number - 1)).getBrand()+"|"+  invStore.get((number - 1)).getPrice()+"|"+amountPaid);
            //System.out.println("Number = " + number);
            //System.out.println("Brand" + invStore.get((number - 1)).getBrand());
            //System.out.println("Brand Discount" + brandDiscount.disAmount.get(invStore.get((number - 1)).getBrand()));
            //System.out.println("Category" + invStore.get((number - 1)).getCategory());
            //System.out.println("Category Discount" + category.catDisAmount.get(invStore.get((number - 1)).getCategory()));
            //System.out.println("Price" + invStore.get((number - 1)).getPrice());
            totAmount = totAmount+amountPaid;

            //System.out.println("Discount Applied" + da.getDisAmount(brandDiscount.disAmount.get(invStore.get((number - 1)).getBrand()), category.catDisAmount.get(invStore.get((number - 1)).getCategory()), invStore.get((number - 1)).getPrice()));

        }
                System.out.println("=================================================================\n");
        System.out.println("Total Invoice Amount: "+totAmount );
        System.out.println("=================================================================\n");

    }

}
