package com.example.kesavant.kiosk.Model;

import com.example.kesavant.kiosk.Activity.ServiceTypes;
import com.example.kesavant.kiosk.Activity.StartupActivity;

/**
 * Created by kesavanT on 12/18/2017.
 */

public class MenuItem {

    public String employee = StartupActivity.employeeId;
    public String menuId = "";
    public String tableId = ServiceTypes.QSR.toString();
    public int quantity = 1;
    public String prefix = "";
    public String servingSize = "";
    public String price = "";
    public String serviceType = ServiceTypes.QSR.toString();
    public boolean isPlaceorder = false;
    public int orderNo = 0;

    public MenuItem(MenuItemJSON itemJson){
        this.menuId = itemJson.menuid;
        this.price = itemJson.price;
        this.servingSize = itemJson.servingSizeId;
    }
    public MenuItem(){

    }
}
