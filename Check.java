package com.example.kesavant.kiosk.Model;

import java.util.List;

/**
 * Created by kesavanT on 12/11/2017.
 */


public class Check {

    public String id;
    public String subTotalStr = "";
    public String totalSaleAmountStr = "";
    public String totalTaxAmountStr = "";
    public double totalGrossAmount;
    public double totalTaxAmount;
    public double totalSaleAmount;
    public List<Order> orders;
    public List<Seat> seats;
    public boolean taxExempt;
    public double taxExemptAmount;
    public String checkNo;
    public double paidAmount;
    public String customerID;
    public String customerName;
    public String customerEmailId;
    public String customerPhoneNumber;
    public double totalInclusiveTaxAmount;
    public String ticketNo;
    public String totalGrossAmountStr;
    public String saleUniqueId;
    public String service;
    public String paidAmountStr;
    public String balanceAmountStr;
    public String openByEmpId = "";
    public String openEmployeeName = "";


    //
//    var id : String
//    var totalGrossAmount : Double
//    var totalTaxAmount : Double
//    var totalSaleAmount : Double
//    var orders : Array<Order>?
//    var seats : Array<Seat>?
//
//    var totalDiscountAmount : Double
//
//    var tipTotalAmount : Double
//
//    var totalGrossAmountWithOutDiscounts : Double
//
//    var totalTaxAmountWithOutDiscounts : Double
//    var totalDiscounts : Double
//    var totalDiscountTax : Double
//
/// //    var totalDiscountAmountStr : String
//    var gratuityTotalAmountStr : String
//    var totalGrossAmountWithOutDiscountsStr : String
//    var totalTaxAmountWithOutDiscountsStr : String
//    var totalDiscountsStr : String
//    var totalDiscountTaxStr : String
//    var taxExemptAmountStr : String
    //    var totalInclusiveTaxAmountStr : String
//    var tipTotalAmountStr : String
    //    var subTotalStr : String

//    var haveShowOrderType: Bool
//    var isCustomerNameChanged: Bool
//
//    var appliedOpenCheckDiscount : Bool
//
//    var savedCards: [CardDetail]
//    var isFutureOrder : Bool

}
