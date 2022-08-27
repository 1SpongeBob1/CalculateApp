package com.example.calculate.data;

import android.os.Parcel;
import android.os.Parcelable;

public class PcbInfo implements Parcelable {
    String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public static final Creator<PcbInfo> CREATOR = new Creator<PcbInfo>() {
        @Override
        public PcbInfo createFromParcel(Parcel in) {
            PcbInfo pcbInfo = new PcbInfo();
            pcbInfo.test = in.readString();
            return pcbInfo;
        }

        @Override
        public PcbInfo[] newArray(int size) {
            return new PcbInfo[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(test);
    }
}
