package com.example.dictionary;

import java.io.Serializable;

public class Dictionary implements Serializable {
    private int englishWordID;
    private int arabicWordID;
    private int backgroundColorID;
    private int imageID;
    public Dictionary(int imageID,int englishWordID,int arabicWordID,int backgroundColorID)
    {
        this.arabicWordID=arabicWordID;
        this.englishWordID=englishWordID;
        this.imageID=imageID;
        this.backgroundColorID=backgroundColorID;
    }
    public int getEnglishWordID() {
        return englishWordID;
    }

    public void setEnglishWordID(int englishWordID) {
        this.englishWordID = englishWordID;
    }

    public int getArabicWordID() {
        return arabicWordID;
    }

    public void setArabicWordID(int arabicWordID) {
        this.arabicWordID = arabicWordID;
    }

    public int getBackgroundColorID() {
        return backgroundColorID;
    }

    public void setBackgroundColorID(int backgroundColorID) {
        this.backgroundColorID = backgroundColorID;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
