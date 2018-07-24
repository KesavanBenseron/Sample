package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kesavanT on 10/24/2017.
 */

public class CustomCatModel implements Parcelable {

    @SerializedName("CategryID")
    public String categoryid;
    @SerializedName("CategoryName")
    public String categoryname;
    @SerializedName("ISShift")
    public boolean isShift ;
    @SerializedName("ShiftID")
    public int shiftid ;
    @SerializedName("IsAlwaysAvailable")
    public boolean isAlwaysAvailable ;
    @SerializedName("IsOverrideTax")
    public boolean isOverrideTax;
    @SerializedName("StoreID")
    public int storeid;
    @SerializedName("Imageicon")
    public Integer [] imageicon;
    @SerializedName("imageName")
    public String imageName;
    @SerializedName("imageUrl")
    public String imageUrl;
    @SerializedName("image")
    public String image;
    @SerializedName("imageExtension")
    public String imageExtension;
    @SerializedName("imageAvailable")
    public boolean isimageAvailable ;
    @SerializedName("isDisplayGroup")
    public boolean isDisplayGroup ;

    public Integer[] getImageicon() {
        return imageicon;
    }

    public void setImageicon(Integer[] imageicon) {
        this.imageicon = imageicon;
    }

    public List<SubCategoryModel> subCategoryModels;

    public List<SubCategoryModel> getSubCategoryModels() {
        return subCategoryModels;
    }

    public void setSubCategoryModels(List<SubCategoryModel> subCategoryModels) {
        this.subCategoryModels = subCategoryModels;
    }

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

    public CustomCatModel(String categoryid, String categoryname, boolean isShift, String shiftid, boolean isAlwaysAvailable, boolean isOverrideTax, int storeid) {
        this.categoryid = categoryid;
        this.categoryname = categoryname;
        this.isOverrideTax = isOverrideTax;
        this.isAlwaysAvailable = isAlwaysAvailable;
        this.isShift = isShift;
        this.storeid = storeid;
    }

    public CustomCatModel() {
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
        dest.writeString(imageName);
        dest.writeString(imageExtension);
        dest.writeString(image);
        dest.writeString(imageUrl);
        dest.writeByte(this.isimageAvailable ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isDisplayGroup ? (byte) 1 : (byte) 0);
    }

    protected CustomCatModel(Parcel in) {
        this.categoryid = in.readString();
        this.categoryname = in.readString();
        this.isShift = in.readByte() != 0;
        this.shiftid = in.readInt();
        this.isAlwaysAvailable = in.readByte() != 0;
        this.isOverrideTax = in.readByte() != 0;
        this.storeid = in.readInt();
        this.imageName = in.readString();
        this.imageUrl = in.readString();
        this.imageExtension = in.readString();
        this.image = in.readString();
        this.isimageAvailable = in.readByte() != 0;
        this.isDisplayGroup = in.readByte() != 0;
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
