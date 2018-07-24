package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 10/24/2017.
 */

public class CategoryModel implements Parcelable {

    @SerializedName("CategryID")
    private String categoryid;
    @SerializedName("CategoryName")
    private String categoryname;
    @SerializedName("ISShift")
    public boolean isShift ;
    @SerializedName("ShiftID")
    public int shiftid ;
    @SerializedName("IsAlwaysAvailable")
    public boolean isAlwaysAvailable ;
    @SerializedName("IsOverrideTax")
    public boolean isOverrideTax ;
    @SerializedName("StoreID")
    public int storeid ;

    public boolean isShift() {
        return isShift;
    }

    public void setShift(boolean shift) {
        isShift = shift;
    }

    public int getShiftid() {
        return shiftid;
    }

    public void setShiftid(int shiftid) {
        this.shiftid = shiftid;
    }

    public boolean isAlwaysAvailable() {
        return isAlwaysAvailable;
    }

    public void setAlwaysAvailable(boolean alwaysAvailable) {
        isAlwaysAvailable = alwaysAvailable;
    }

    public boolean isOverrideTax() {
        return isOverrideTax;
    }

    public void setOverrideTax(boolean overrideTax) {
        isOverrideTax = overrideTax;
    }

    public int getStoreid() {
        return storeid;
    }

    public void setStoreid(int storeid) {
        this.storeid = storeid;
    }

    public CategoryModel(String categoryid, String categoryname, boolean isShift, String shiftid, boolean isAlwaysAvailable, boolean isOverrideTax, int storeid) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.isOverrideTax = isOverrideTax;
        this.isAlwaysAvailable = isAlwaysAvailable;
        this.isShift = isShift;
        this.storeid = storeid;
    }

    public CategoryModel() {
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.categoryid);
        dest.writeString(this.categoryname);
        dest.writeByte(this.isShift ? (byte) 1 : (byte) 0);
        dest.writeInt(this.shiftid);
        dest.writeByte(this.isAlwaysAvailable ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isOverrideTax ? (byte) 1 : (byte) 0);
        dest.writeInt(this.storeid);
    }

    protected CategoryModel(Parcel in) {
        this.categoryid = in.readString();
        this.categoryname = in.readString();
        this.isShift = in.readByte() != 0;
        this.shiftid = in.readInt();
        this.isAlwaysAvailable = in.readByte() != 0;
        this.isOverrideTax = in.readByte() != 0;
        this.storeid = in.readInt();
    }

    public static final Creator<CategoryModel> CREATOR = new Creator<CategoryModel>() {
        @Override
        public CategoryModel createFromParcel(Parcel source) {
            return new CategoryModel(source);
        }

        @Override
        public CategoryModel[] newArray(int size) {
            return new CategoryModel[size];
        }
    };
}
