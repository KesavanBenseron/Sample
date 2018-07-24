package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kesavanT on 11/1/2017.
 */

public class MenuItemJSON implements Parcelable {

    @SerializedName("id")
    public String menuid;
    @SerializedName("name")
    public String menuname;
    @SerializedName("imageAvailable")
    public boolean IsimageAvailable ;
    @SerializedName("imageName")
    public String imageName;
    @SerializedName("buttonColor")
    public String buttonColor;
    @SerializedName("measureType")
    public String measureType;
    @SerializedName("servingSizeId")
    public String servingSizeId;
    @SerializedName("servingSizeName")
    public String servingSizeName;
    @SerializedName("price")
    public String price;
    public boolean isPlaceorder;
    // it will use after the item place other wise it will default int value
    public int placedOrderNo;
    @SerializedName("imageUrl")
    public String imageUrl;
    @SerializedName("image")
    public String image;
    @SerializedName("imageExtension")
    public String imageExtension;
    @SerializedName("description")
    public String description;
    public List<ModifierGroup> modifierGroupList;
    public boolean isModifier = false;
    public boolean isServingSize = false;
    public int quantity = 1;

    public MenuItemJSON(Parcel in) {
        menuid = in.readString();
        menuname = in.readString();
        IsimageAvailable = in.readByte() != 0;
        imageName = in.readString();
        buttonColor = in.readString();
        measureType = in.readString();
        servingSizeId = in.readString();
        servingSizeName = in.readString();
        price = in.readString();
        imageUrl = in.readString();
        imageExtension = in.readString();
        image = in.readString();
    }

    public static final Creator<MenuItemJSON> CREATOR = new Creator<MenuItemJSON>() {
        @Override
        public MenuItemJSON createFromParcel(Parcel in) {
            return new MenuItemJSON(in);
        }

        @Override
        public MenuItemJSON[] newArray(int size) {
            return new MenuItemJSON[size];
        }
    };

    public MenuItemJSON() {

    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
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

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getMeasureType() {
        return measureType;
    }

    public void setMeasureType(String measureType) {
        this.measureType = measureType;
    }

    public String getServingSizeId() {
        return servingSizeId;
    }

    public void setServingSizeId(String servingSizeId) {
        this.servingSizeId = servingSizeId;
    }

    public String getServingSizeName() {
        return servingSizeName;
    }

    public void setServingSizeName(String servingSizeName) {
        this.servingSizeName = servingSizeName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public List<ModifierGroup> getModifierGroupList() {
        return modifierGroupList;
    }

    public void setModifierGroupList(List<ModifierGroup> modifierGroupList) {
        this.modifierGroupList = modifierGroupList;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(menuid);
        dest.writeString(menuname);
        dest.writeByte(IsimageAvailable ? (byte) 1 : (byte) 0);
        dest.writeString(imageName);
        dest.writeString(buttonColor);
        dest.writeString(measureType);
        dest.writeString(servingSizeId);
        dest.writeString(servingSizeName);
        dest.writeString(price);
        dest.writeString(imageExtension);
        dest.writeString(image);
        dest.writeString(imageUrl);
    }
}
