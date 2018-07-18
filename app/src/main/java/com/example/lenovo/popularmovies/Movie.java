package com.example.lenovo.popularmovies;

public class Movie {
    int mImageDrawable;
    String mName;
    String mRelease;

    public Movie(int mImageDrawable, String mName, String mRelease){
        this.mImageDrawable=mImageDrawable;
        this.mName=mName;
        this.mRelease=mRelease;
    }

    public int getmImageDrawable() {

        return mImageDrawable;
    }

    public String getmName() {
        return mName;
    }

    public String getmRelease() {

        return mRelease;
    }

    public void setmImageDrawable(int mImageDrawable) {

        this.mImageDrawable = mImageDrawable;
    }

    public void setmName(String mName) {

        this.mName = mName;
    }

    public void setmRelease(String mRelease) {

        this.mRelease = mRelease;
    }
}
