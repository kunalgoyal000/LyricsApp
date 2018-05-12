package abhayjain.lyricsapp;

/**
 * Created by Abhay Jain on 13-04-2018.
 */

public class Word {


    private String mDefaultTranslation;

    private int mImageResourceId;

    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId =imageResourceId;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

}

