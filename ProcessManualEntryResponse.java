package com.magtek.mobile.android.mtscraoemdemo.Model;

import java.util.Map;

/**
 * Created by kesavanT on 2/21/2018.
 */

public class ProcessManualEntryResponse {
    public String AuthCode;
    public double AuthorizedAmount;
    public String AVSResult;
    public String CustomerTransactionID;
    public String CVVResult;
    public String IssuerAuthenticationData;
    public String IssuerScriptTemplate1;
    public String IssuerScriptTemplate2;
    public boolean IsTransactionApproved;
    public String MagTranID;
    public String MPPGv3WSFault;
    public String Token;
    public String TransactionID;
    public String TransactionMessage;
    public Map<String,String> TransactionOutputDetails;
    public String TransactionStatus;
    public String TransactionUTCTimestamp;

    public String getAuthCode() {
        return AuthCode;
    }

    public void setAuthCode(String authCode) {
        AuthCode = authCode;
    }

    public double getAuthorizedAmount() {
        return AuthorizedAmount;
    }

    public void setAuthorizedAmount(double authorizedAmount) {
        AuthorizedAmount = authorizedAmount;
    }

    public String getAVSResult() {
        return AVSResult;
    }

    public void setAVSResult(String AVSResult) {
        this.AVSResult = AVSResult;
    }

    public String getCustomerTransactionID() {
        return CustomerTransactionID;
    }

    public void setCustomerTransactionID(String customerTransactionID) {
        CustomerTransactionID = customerTransactionID;
    }

    public String getCVVResult() {
        return CVVResult;
    }

    public void setCVVResult(String CVVResult) {
        this.CVVResult = CVVResult;
    }

    public String getIssuerAuthenticationData() {
        return IssuerAuthenticationData;
    }

    public void setIssuerAuthenticationData(String issuerAuthenticationData) {
        IssuerAuthenticationData = issuerAuthenticationData;
    }

    public String getIssuerScriptTemplate1() {
        return IssuerScriptTemplate1;
    }

    public void setIssuerScriptTemplate1(String issuerScriptTemplate1) {
        IssuerScriptTemplate1 = issuerScriptTemplate1;
    }

    public String getIssuerScriptTemplate2() {
        return IssuerScriptTemplate2;
    }

    public void setIssuerScriptTemplate2(String issuerScriptTemplate2) {
        IssuerScriptTemplate2 = issuerScriptTemplate2;
    }

    public boolean isTransactionApproved() {
        return IsTransactionApproved;
    }

    public void setTransactionApproved(boolean transactionApproved) {
        IsTransactionApproved = transactionApproved;
    }

    public String getMagTranID() {
        return MagTranID;
    }

    public void setMagTranID(String magTranID) {
        MagTranID = magTranID;
    }

    public String getMPPGv3WSFault() {
        return MPPGv3WSFault;
    }

    public void setMPPGv3WSFault(String MPPGv3WSFault) {
        this.MPPGv3WSFault = MPPGv3WSFault;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }

    public String getTransactionID() {
        return TransactionID;
    }

    public void setTransactionID(String transactionID) {
        TransactionID = transactionID;
    }

    public String getTransactionMessage() {
        return TransactionMessage;
    }

    public void setTransactionMessage(String transactionMessage) {
        TransactionMessage = transactionMessage;
    }

    public Map<String, String> getTransactionOutputDetails() {
        return TransactionOutputDetails;
    }

    public void setTransactionOutputDetails(Map<String, String> transactionOutputDetails) {
        TransactionOutputDetails = transactionOutputDetails;
    }

    public String getTransactionStatus() {
        return TransactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        TransactionStatus = transactionStatus;
    }

    public String getTransactionUTCTimestamp() {
        return TransactionUTCTimestamp;
    }

    public void setTransactionUTCTimestamp(String transactionUTCTimestamp) {
        TransactionUTCTimestamp = transactionUTCTimestamp;
    }
}
