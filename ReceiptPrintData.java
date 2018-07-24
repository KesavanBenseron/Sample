package com.example.kesavant.kiosk.Model;

import java.util.List;

/**
 * Created by kesavanT on 1/31/2018.
 */

public class ReceiptPrintData {
    public String IPAddress;
    public String addressLine1;
    public String addressLine2;
    public String city;
    public String date;
    public double discounts;
    public double gratuity;
    public String name;
    public List<PrintItem> printItems;
    public double serviceCharge;
    public String state;
    public List<OrderTax> taxes;
    public String time;
    public double total;
    public double totalGrossAmount;
    public double totalInclusiveTax;
    public double totalTaxAmount;
    public String zipCode;
    public double changeDue;
    public String totalPaymentTipStr;
    public List<ReceiptPayment> payments;
    public double totalPaymentTip;
    public String discountsStr;
    public String gratuityStr;
    public String totalStr;
    public String totalGrossAmountStr;
    public String totalInclusiveTaxStr;
    public String totalTaxAmountStr;
    public String changeDueStr;
    public String checkNo;
    public String tableName;
    public String customerName;
    public String checkCreatedEmpName;
    public String service;
    public String customerAddressLine1;
    public String customerAddressLine2;
    public String customerCity;
    public String customerState;
    public String customerZipCode;
    public String customerCountry;
    public String customerEmailId;
    public String customerPhoneNumber;
    public String customerGateCode;
    public String customerNotes;
    public boolean isShowLocalName;
    public int loyaltyPoints;
    public String loyaltyAmount;
}
