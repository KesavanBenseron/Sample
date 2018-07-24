package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 4/3/2018.
 */

public class JSONStructure implements Parcelable {
    @SerializedName("id")
    public String id;
    @SerializedName("version")
    public int version;
    @SerializedName("json")
    public String json;
    @SerializedName("store")
    public String store;
    //var employeePins : Array<String>?
    public String account ;
    @SerializedName("downloadCustomerJson")
    public boolean downloadCustomerJson;
    @SerializedName("customerVersion")
    public int customerVersion ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public boolean isDownloadCustomerJson() {
        return downloadCustomerJson;
    }

    public void setDownloadCustomerJson(boolean downloadCustomerJson) {
        this.downloadCustomerJson = downloadCustomerJson;
    }

    public int getCustomerVersion() {
        return customerVersion;
    }

    public void setCustomerVersion(int customerVersion) {
        this.customerVersion = customerVersion;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeInt(this.version);
        dest.writeString(this.json);
        dest.writeString(this.store);
        dest.writeString(this.account);
        dest.writeByte(this.downloadCustomerJson ? (byte) 1 : (byte) 0);
        dest.writeInt(this.customerVersion);
    }

    public JSONStructure() {
    }

    protected JSONStructure(Parcel in) {
        this.id = in.readString();
        this.version = in.readInt();
        this.json = in.readString();
        this.store = in.readString();
        this.account = in.readString();
        this.downloadCustomerJson = in.readByte() != 0;
        this.customerVersion = in.readInt();
    }

    public static final Parcelable.Creator<JSONStructure> CREATOR = new Parcelable.Creator<JSONStructure>() {
        @Override
        public JSONStructure createFromParcel(Parcel source) {
            return new JSONStructure(source);
        }

        @Override
        public JSONStructure[] newArray(int size) {
            return new JSONStructure[size];
        }
    };
}
