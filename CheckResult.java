package com.example.kesavant.kiosk.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by kesavanT on 12/11/2017.
 */

public class CheckResult extends Validation implements Parcelable {

    public String checkId = "";
    public String customerName = "";
    public boolean autoCloseDay = false;
    public Check checkIns = null;

    public CheckResult(Parcel in) {
        isValid = in.readByte() != 0;
        message = in.readString();
        checkId = in.readString();
        customerName = in.readString();
        autoCloseDay = in.readByte() != 0;
    }

    public static final Creator<CheckResult> CREATOR = new Creator<CheckResult>() {
        @Override
        public CheckResult createFromParcel(Parcel in) {
            return new CheckResult(in);
        }

        @Override
        public CheckResult[] newArray(int size) {
            return new CheckResult[size];
        }
    };

    public CheckResult() {

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isValid ? 1 : 0));
        dest.writeString(message);
        dest.writeString(checkId);
        dest.writeString(customerName);
        dest.writeByte((byte) (autoCloseDay ? 1 : 0));
    }
};