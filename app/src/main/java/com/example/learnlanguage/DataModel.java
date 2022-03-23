package com.example.learnlanguage;

public class DataModel {
private int image1,image2;
private String text1;

    public DataModel(int image1, String text1,int image2) {
        this.image1 = image1;
        this.image2 = image2;
        this.text1 = text1;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }
}
