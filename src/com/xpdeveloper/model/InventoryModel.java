/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpdeveloper.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author smusthafa
 */
public class InventoryModel {

    int _Id;
    String _brand;
    String _category;
    int _price;
   

    public InventoryModel(int _Id, String _brand, String _category, int _price) {
        this._Id = _Id;
        this._brand = _brand;
        this._category = _category;
        this._price = _price;
       
    }

    public int getId() {
        return _Id;
    }

    public void setId(int _Id) {
        this._Id = _Id;
    }

    public String getBrand() {
        return _brand;
    }

    public void setBrand(String _brand) {
        this._brand = _brand;
    }

    public String getCategory() {
        return _category;
    }

    public void setCategory(String _category) {
        this._category = _category;
    }

    public int getPrice() {
        return _price;
    }

    public void setPrice(int _price) {
        this._price = _price;
    }


    
    public static InventoryModel createInventory(String[] metadata){
        int id = Integer.parseInt(metadata[0]);
        String brand = metadata[1];
        String category = metadata[2];
        int price = Integer.parseInt(metadata[3]);
        
        return new InventoryModel(id,brand,category,price);
    }

    public static List<InventoryModel> readInventoryCSV(String fileName) throws IOException {
        List<InventoryModel> inv = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            String line;
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                  
                String[] attributes = line.split(",");
                InventoryModel inventory = createInventory(attributes);
                inv.add(inventory);
                 //line=br.readLine();            

            }
           
        }catch(IOException ioe){
        ioe.printStackTrace();
        }
        
        return inv;
    }

    public InventoryModel() {
    super();
    }
}
