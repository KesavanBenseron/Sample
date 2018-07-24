package com.magtek.mobile.android.mtscraoemdemo.Model;

import java.util.Map;

/**
 * Created by kesavanT on 2/21/2018.
 */

public class ProcessManualEntryRequest {
    public Map<String,String> AdditionalRequestData;
    public String AddressLine1;
    public String AddressLine2;
    public double Amount;
    public String City;
    public String Country;
    public String CustomerCode;
    public String CustomerTransactionID;
    public String CVV;
    public String ExpirationDate;
    public String NameOnCard;
    public String PAN;
    public String Password;
    public String ProcessorName;
    public String State;
    public Map<String,String> TransactionInputDetails;
    public String TransactionType;
    public String Username;
    public String ZIP;

    public Map<String, String> getAdditionalRequestData() {
        return AdditionalRequestData;
    }

    public void setAdditionalRequestData(Map<String, String> additionalRequestData) {
        AdditionalRequestData = additionalRequestData;
    }

    public String getAddressLine1() {
        return AddressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        AddressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return AddressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        AddressLine2 = addressLine2;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(String customerCode) {
        CustomerCode = customerCode;
    }

    public String getCustomerTransactionID() {
        return CustomerTransactionID;
    }

    public void setCustomerTransactionID(String customerTransactionID) {
        CustomerTransactionID = customerTransactionID;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getExpirationDate() {
        return ExpirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        ExpirationDate = expirationDate;
    }

    public String getNameOnCard() {
        return NameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        NameOnCard = nameOnCard;
    }

    public String getPAN() {
        return PAN;
    }

    public void setPAN(String PAN) {
        this.PAN = PAN;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getProcessorName() {
        return ProcessorName;
    }

    public void setProcessorName(String processorName) {
        ProcessorName = processorName;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public Map<String, String> getTransactionInputDetails() {
        return TransactionInputDetails;
    }

    public void setTransactionInputDetails(Map<String, String> transactionInputDetails) {
        TransactionInputDetails = transactionInputDetails;
    }

    public String getTransactionType() {
        return TransactionType;
    }

    public void setTransactionType(String transactionType) {
        TransactionType = transactionType;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getZIP() {
        return ZIP;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }
}
