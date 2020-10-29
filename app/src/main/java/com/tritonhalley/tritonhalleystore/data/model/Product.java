package com.tritonhalley.tritonhalleystore.data.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
     private int  mId;
     private String mName;
     private String mDescription;
     private String mPrice;
     private String mDateCreated;
     private int mAverageRating;

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getPrice() {
        return mPrice;
    }

    public void setPrice(String price) {
        mPrice = price;
    }

    public String getDateCreated() {
        return mDateCreated;
    }

    public void setDateCreated(String dateCreated) {
        mDateCreated = dateCreated;
    }

    public int getAverageRating() {
        return mAverageRating;
    }

    public void setAverageRating(int averageRating) {
        mAverageRating = averageRating;
    }

    protected Product(Parcel in) {
        mId = in.readInt();
        mName = in.readString();
        mDescription = in.readString();
        mPrice = in.readString();
        mDateCreated = in.readString();
        mAverageRating = in.readInt();
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mId);
        dest.writeString(mName);
        dest.writeString(mDescription);
        dest.writeString(mPrice);
        dest.writeString(mDateCreated);
        dest.writeInt(mAverageRating);
    }
}
