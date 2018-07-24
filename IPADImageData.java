package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by kesavanT on 10/27/2017.
 */

class IPADImageData implements Parcelable{

    @SerializedName("id")
    public String imageid;
    @SerializedName("name")
    public String imagename;
    @SerializedName("imageAvailable")
    public boolean imageAvailable;
    @SerializedName("imageVersion")
    public int imageVersion;
    @SerializedName("imageUrl")
    public String imageUrl;
    @SerializedName("imageExtension")
    public String imageExtension;
    @SerializedName("buttonColor")
    public String buttonColor ;
    @SerializedName("image")
    public String image ;

    public String getImageid() {
        return imageid;
    }

    public void setImageid(String imageid) {
        this.imageid = imageid;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public boolean isImageAvailable() {
        return imageAvailable;
    }

    public void setImageAvailable(boolean imageAvailable) {
        this.imageAvailable = imageAvailable;
    }

    public int getImageVersion() {
        return imageVersion;
    }

    public void setImageVersion(int imageVersion) {
        this.imageVersion = imageVersion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageExtension() {
        return imageExtension;
    }

    public void setImageExtension(String imageExtension) {
        this.imageExtension = imageExtension;
    }

    public String getButtonColor() {
        return buttonColor;
    }

    public void setButtonColor(String buttonColor) {
        this.buttonColor = buttonColor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static Creator<IPADImageData> getCREATOR() {
        return CREATOR;
    }

    protected IPADImageData(Parcel in) {
        imageid = in.readString();
        imagename = in.readString();
        imageAvailable = in.readByte() != 0;
        imageVersion = in.readInt();
        imageUrl = in.readString();
        imageExtension = in.readString();
        buttonColor = in.readString();
        image = in.readString();
    }

    public static final Creator<IPADImageData> CREATOR = new Creator<IPADImageData>() {
        @Override
        public IPADImageData createFromParcel(Parcel in) {
            return new IPADImageData(in);
        }

        @Override
        public IPADImageData[] newArray(int size) {
            return new IPADImageData[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(imageid);
        dest.writeString(imagename);
        dest.writeByte((byte) (imageAvailable ? 1 : 0));
        dest.writeInt(imageVersion);
        dest.writeString(imageUrl);
        dest.writeString(imageExtension);
        dest.writeString(buttonColor);
        dest.writeString(image);
    }
}
