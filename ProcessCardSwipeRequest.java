package com.magtek.mobile.android.mtscraoemdemo.Model;

import java.util.Map;

/**
 * Created by kesavanT on 2/21/2018.
 */

public class ProcessCardSwipeRequest {

    public Map<String,String> AdditionalRequestData;
    public double Amount;
    public String CustomerCode;
    public String CustomerTransactionID;
    public String CVV;
    public String DeviceSN;
    public String KSN;
    public String MagnePrint;
    public String MagnePrintPStatus;
    public String Password;
    public String ProcessorName;
    public String Track1;
    public String Track2;
    public String Track3;
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

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getDeviceSN() {
        return DeviceSN;
    }

    public void setDeviceSN(String deviceSN) {
        DeviceSN = deviceSN;
    }

    public String getKSN() {
        return KSN;
    }

    public void setKSN(String KSN) {
        this.KSN = KSN;
    }

    public String getMagnePrint() {
        return MagnePrint;
    }

    public void setMagnePrint(String magnePrint) {
        MagnePrint = magnePrint;
    }

    public String getMagnePrintPStatus() {
        return MagnePrintPStatus;
    }

    public void setMagnePrintPStatus(String magnePrintPStatus) {
        MagnePrintPStatus = magnePrintPStatus;
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

    public String getTrack1() {
        return Track1;
    }

    public void setTrack1(String track1) {
        Track1 = track1;
    }

    public String getTrack2() {
        return Track2;
    }

    public void setTrack2(String track2) {
        Track2 = track2;
    }

    public String getTrack3() {
        return Track3;
    }

    public void setTrack3(String track3) {
        Track3 = track3;
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
