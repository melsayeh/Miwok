package com.example.android.miwok_startercode301;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.text.Html;
import android.widget.ImageView;

/**
 * {@link Word} represents a single Android platform release.
 * Each object has 2 properties: Defualt Translation, and Miwok Translation.
 */

public class Word {
    private String defaultTranslation;
    private String miwokTranslation;
    private int audioResource;
    private int imageResource = -1;

    /*
   * Constructor to create a new Word object.
   *
   * @param defaultTranslation is the word in Default Translation
   * @param miwokTranslation is the word in Miwok Translation
   * */

    public Word(String defaultTranslation, String miwokTranslation,int audioResource) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioResource = audioResource;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResource, int audioResource) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResource = imageResource;
        this.audioResource = audioResource;
    }

    //Get the default translation
    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    //Get the Miwok translation
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    //Get Image Resource ID
    public int getImageResource() {
        return imageResource;
    }

    //Get Audio Resource ID

    public int getAudioResource() {
        return audioResource;
    }
    //Set the Default Translation
    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    //Set the Miwok Translation
    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    //Set Image Resource ID
    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    //@return true if Image resouce ID was provided
    public boolean hasImage(){
        return imageResource!= -1;
    }

    //Set Audio Resource ID

    public void setAudioResource(int audioResource) {
        this.audioResource = audioResource;
    }
}
