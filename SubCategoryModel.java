package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 10/24/2017.
 */

public class SubCategoryModel implements Parcelable {

    @SerializedName("CategoryID")
    public String categoryid;
    @SerializedName("SubCategoryID")
    public String subcategoryid;
    @SerializedName("SubCategoryName")
    public String subcategoryname;
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

    public SubCategoryModel(String categoryid, String subcategoryid, String getSubcategoryname) {
        this.categoryid = categoryid;
        this.subcategoryid = subcategoryid;
        this.subcategoryname = getSubcategoryname;
    }

    public SubCategoryModel() {
    }

    protected SubCategoryModel(Parcel in) {
        categoryid = in.readString();
        subcategoryid = in.readString();
        subcategoryname = in.readString();
        imageName = in.readString();
        imageUrl = in.readString();
        imageExtension = in.readString();
        image = in.readString();
    }

    public static final Creator<SubCategoryModel> CREATOR = new Creator<SubCategoryModel>() {
        @Override
        public SubCategoryModel createFromParcel(Parcel in) {
            return new SubCategoryModel(in);
        }

        @Override
        public SubCategoryModel[] newArray(int size) {
            return new SubCategoryModel[size];
        }
    };

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    public String getSubcategoryid() {
        return subcategoryid;
    }

    public void setSubcategoryid(String subcategoryid) {
        this.subcategoryid = subcategoryid;
    }

    public String GetSubcategoryname() {
        return subcategoryname;
    }

    public void GetSubcategoryname(String getSubcategoryname) {
        this.subcategoryname = getSubcategoryname;
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
        dest.writeString(categoryid);
        dest.writeString(subcategoryid);
        dest.writeString(subcategoryname);
        dest.writeString(imageName);
        dest.writeString(imageExtension);
        dest.writeString(image);
        dest.writeString(imageUrl);
    }
}
