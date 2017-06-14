package com.example.elsayedfahmy_pc.parcelableexample.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MarwaTalaat on 10/15/2016.
 */

public class Country implements Parcelable {
    private int flag;
    private String name;

    public Country() {
    }

    public Country(int flag, String name) {

        this.flag = flag;
        this.name = name;
    }

    protected Country(Parcel in) {
        flag = in.readInt();
        name = in.readString();
    }

    public static final Creator<Country> CREATOR = new Creator<Country>() {
        @Override
        public Country createFromParcel(Parcel in) {
            return new Country(in);
        }

        @Override
        public Country[] newArray(int size) {
            return new Country[size];
        }
    };

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(flag);
        dest.writeString(name);
    }
}
