package com.example.kesavant.kiosk.Model;

/**
 * Created by kesavanT on 1/18/2018.
 */

public class PrintItem {

    public double amount;
    public boolean isAttachRequest;
    public boolean isItemToGo;
    public boolean isModifier;
    public boolean isVoidError;
    public String name;
    public double price ;
    public String quantity;
    public String priceStr;
    public String amountStr;
    public boolean seat;
    public boolean subModifier;
    public String courseName;
    public String localName;
    public boolean isFreeItem;

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
