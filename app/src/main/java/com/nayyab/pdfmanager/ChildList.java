package com.nayyab.pdfmanager;

import android.os.Parcel;
import android.os.Parcelable;

public class ChildList implements Parcelable {

    private String title;


    public ChildList(String title) {
        this.title = title;
    }

    protected ChildList(Parcel in) {
        title = in.readString();
    }

    public static final Creator<ChildList> CREATOR = new Creator<ChildList>() {
        @Override
        public ChildList createFromParcel(Parcel in) {
            return new ChildList(in);
        }

        @Override
        public ChildList[] newArray(int size) {
            return new ChildList[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public void setTitle(String Title) {
        this.title = Title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
    }
}
