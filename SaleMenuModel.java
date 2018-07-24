package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kesavanT on 11/10/2017.
 */

public class SaleMenuModel implements Parcelable {

    private String saleMenuName;
    private Integer [] saleMenuImage;
    private int saleMenuPrice;
    private int saleFinalPrice;

    protected SaleMenuModel(Parcel in) {
        saleMenuName = in.readString();
        saleMenuPrice = in.readInt();
        saleFinalPrice = in.readInt();
    }

    public static final Creator<SaleMenuModel> CREATOR = new Creator<SaleMenuModel>() {
        @Override
        public SaleMenuModel createFromParcel(Parcel in) {
            return new SaleMenuModel(in);
        }

        @Override
        public SaleMenuModel[] newArray(int size) {
            return new SaleMenuModel[size];
        }
    };

    public String getSaleMenuName() {
        return saleMenuName;
    }

    public void setSaleMenuName(String saleMenuName) {
        this.saleMenuName = saleMenuName;
    }

    public Integer[] getSaleMenuImage() {
        return saleMenuImage;
    }

    public void setSaleMenuImage(Integer[] saleMenuImage) {
        this.saleMenuImage = saleMenuImage;
    }

    public int getSaleMenuPrice() {
        return saleMenuPrice;
    }

    public void setSaleMenuPrice(int saleMenuPrice) {
        this.saleMenuPrice = saleMenuPrice;
    }

    public int getSaleFinalPrice() {
        return saleFinalPrice;
    }

    public void setSaleFinalPrice(int saleFinalPrice) {
        this.saleFinalPrice = saleFinalPrice;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(saleMenuName);
        dest.writeInt(saleMenuPrice);
        dest.writeInt(saleFinalPrice);
    }
}
