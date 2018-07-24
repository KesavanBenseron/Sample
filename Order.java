package com.example.kesavant.kiosk.Model;

import java.util.ArrayList;
import java.util.List;

public class Order{

    public int orderNo;
    public int quantity ;
    public String menuId ;
    public String menuName ;
    public String seatId ;
    public String tableId;
    public String servingSizeId;
    public String servingSizeName;
    public String prefixId ;
    public String prefixName ;
    public String grossAmountStr ;
    public String totalGrossAmountStr ;
    public String totalTaxAmountStr;
    public String totalAmountStr ;
    public String totalPriceStr ;
    public double grossAmount;
    public double totalGrossAmount ;
    public double totalTaxAmount ;
    public double totalAmount ;
    public double totalPrice;
    public String givexPriceStr ;
    public String menuType;
    public List<Modifier> modifiers = new ArrayList<>();

//    var cutAndModify : Bool
//    var sliceOrders : Array<Order>?
//    var sliceName : String
//    var cutFraction : Int
//    var fraction : Int

//    var menuDiscountAmount : Double
//

//    var menuDiscountAmountStr : String
//
//    //kitchen print
//    var isKitchenPrint : Bool
//    //togo
//    var isItemToGo : Bool
//    var isVoid : Bool
//    var discounts : Array<Discount>?
//
//    var appliedItemDiscounts : Array<ItemDiscount>?
//
//    var giftCardType : String
//    var giftCardNumber : String
//
//    var attachRequest : String
//

//
//    var maxCutFraction : Int
//
//    var measureType: String
//
//    var hold : Bool
//
//    var appliedOpenItemDiscount : Bool
//
//    var giftCardReference : String
//    var displayQuantity: String
//
//    //Scale weights
//    var tareWeight : String
//    var contentWeight : String
//    var totalWeight : String
//    var menuScalePrice : String
}
