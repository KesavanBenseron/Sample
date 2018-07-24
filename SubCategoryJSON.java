package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 12/5/2017.
 */

public class SubCategoryJSON implements Parcelable {

    @SerializedName("id")
    public String subcategoryid;
    @SerializedName("name")
    public String subcategoryname;
    @SerializedName("buttonColor")
    public String buttonColor;
    @SerializedName("imageAvailable")
    public boolean IsimageAvailable ;
    @SerializedName("isDisplayGroup")
    public boolean isDisplayGroup ;
    @SerializedName("imageName")
    public String imageName;
    @SerializedName("imageUrl")
    public String imageUrl;
    @SerializedName("image")
    public String image;
    @SerializedName("imageExtension")
    public String imageExtension;

    protected SubCategoryJSON(Parcel in) {
        subcategoryid = in.readString();
        subcategoryname = in.readString();
        buttonColor = in.readString();
        IsimageAvailable = in.readByte() != 0;
        isDisplayGroup = in.readByte() != 0;
        imageName = in.readString();
        imageUrl = in.readString();
        imageExtension = in.readString();
        image = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(subcategoryid);
        dest.writeString(subcategoryname);
        dest.writeString(buttonColor);
        dest.writeByte((byte) (IsimageAvailable ? 1 : 0));
        dest.writeByte((byte) (isDisplayGroup ? 1 : 0));
        dest.writeString(imageName);
        dest.writeString(imageExtension);
        dest.writeString(image);
        dest.writeString(imageUrl);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SubCategoryJSON> CREATOR = new Creator<SubCategoryJSON>() {
        @Override
        public SubCategoryJSON createFromParcel(Parcel in) {
            return new SubCategoryJSON(in);
        }

        @Override
        public SubCategoryJSON[] newArray(int size) {
            return new SubCategoryJSON[size];
        }
    };

    public String getSubcategoryid() {
        return subcategoryid;
    }

    public void setSubcategoryid(String categoryid) {
        this.subcategoryid = categoryid;
    }

    public String getSubcategoryname() {
        return subcategoryname;
    }

    public void setSubcategoryname(String categoryname) {
        this.subcategoryname = categoryname;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public boolean isimageAvailable() {
        return IsimageAvailable;
    }

    public void setIsimageAvailable(boolean isimageAvailable) {
        IsimageAvailable = isimageAvailable;
    }

    public boolean isDisplayGroup() {
        return isDisplayGroup;
    }

    public void setDisplayGroup(boolean displayGroup) {
        isDisplayGroup = displayGroup;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
