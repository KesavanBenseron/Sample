package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 11/22/2017.
 */

public class CategoryJSON implements Parcelable {

    @SerializedName("id")
    public String categoryid;
    @SerializedName("name")
    public String categoryname;
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

    public CategoryJSON(){};
    public CategoryJSON(Parcel in) {
        categoryid = in.readString();
        categoryname = in.readString();
        buttonColor = in.readString();
        IsimageAvailable = in.readByte() != 0;
        isDisplayGroup = in.readByte() != 0;
        imageName = in.readString();
        imageUrl = in.readString();
        imageExtension = in.readString();
        image = in.readString();
    }

    public static final Creator<CategoryJSON> CREATOR = new Creator<CategoryJSON>() {
        @Override
        public CategoryJSON createFromParcel(Parcel in) {
            return new CategoryJSON(in);
        }

        @Override
        public CategoryJSON[] newArray(int size) {
            return new CategoryJSON[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(categoryid);
        dest.writeString(categoryname);
        dest.writeString(buttonColor);
        dest.writeByte(IsimageAvailable ? (byte) 1 : (byte) 0);
        dest.writeByte(isDisplayGroup ? (byte) 1 : (byte) 0);
        dest.writeString(imageName);
        dest.writeString(imageExtension);
        dest.writeString(image);
        dest.writeString(imageUrl);
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageExtension() {
        return imageExtension;
    }

    public void setImageExtension(String imageExtension) {
        this.imageExtension = imageExtension;
    }
}

