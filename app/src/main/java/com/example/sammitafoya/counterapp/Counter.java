package com.example.sammitafoya.counterapp;

public class Counter {
    private int mCount;

    public Counter() {
        mCount = 0;
    }

    public void addCount() {
        mCount++;
    }

    public Integer getCount() {
        return mCount;
    }
}
