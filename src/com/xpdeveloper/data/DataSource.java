/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xpdeveloper.data;

import com.xpdeveloper.model.InventoryModel;
import static com.xpdeveloper.model.InventoryModel.readInventoryCSV;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author smusthafa
 */
public class DataSource {
    
    String filePath = "C:\\Users\\smusthafa\\Documents\\NetBeansProjects\\XPDeveloper\\src\\com\\xpdeveloper\\data\\inv.csv";
  public  List<InventoryModel> invStore;

    public DataSource() {
        super();
    }
    public List<InventoryModel> loadInventory() throws IOException{
        if (filePath.length()!=0){
         invStore = readInventoryCSV(filePath);
        
        }
    return invStore;
    }
    
}
