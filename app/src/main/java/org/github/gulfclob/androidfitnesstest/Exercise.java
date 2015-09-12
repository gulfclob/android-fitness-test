package org.github.gulfclob.androidfitnesstest;

public class Exercise {
    private String mTitle;
    private int mSets;
    private int mReps;
    private int mIntensity;

    public Exercise() {
        mTitle = "";
        mSets = 0;
        mReps = 0;
        mIntensity = 0;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public int getSets() {
        return mSets;
    }

    public void setSets(int sets) {
        mSets = sets;
    }

    public int getReps() { return mReps; }

    public void setReps(int reps) {
        mReps = reps;
    }

    public int getIntensity() {
        return mIntensity;
    }

    public void setIntensity(int intensity) {
        mIntensity = intensity;
    }
}
