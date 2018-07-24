package com.magtek.mobile.android.mtscraoemdemo.Model;

import java.util.Map;

/**
 * Created by kesavanT on 2/21/2018.
 */

public class ProcessTokenRequest {
    public Map<String,String> AdditionalRequestData;
    public double Amount;
    public String CustomerCode;
    public String CustomerTransactionID;
    public String Password;
    public String ProcessorName;
    public String Token;
    public Map<String,String> TransactionInputDetails;
    public String TransactionType;
    public String Username;

    public Map<String, String> getAdditionalRequestData() {
        return AdditionalRequestData;
    }

    public void setAdditionalRequestData(Map<String, String> additionalRequestData) {
        AdditionalRequestData = additionalRequestData;
    }

    public double getAmount() {
        return Amount;
    }

    public void setAmount(double amount) {
        Amount = amount;
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

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
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
}
