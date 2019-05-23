package com.example.forfriend;
//21-05-2019,10117221,Savero Rama Raynaldi,IF-7

public enum ModelObject {

    RED(R.string.red, R.layout.view_red),
    BLUE(R.string.blue, R.layout.view_blue),
    GREEN(R.string.green, R.layout.view_green);

    private int mTittleResId;
    private int mLayoutResId;

    ModelObject(int tittleResId, int layoutResId){
        mTittleResId = tittleResId;
        mLayoutResId = layoutResId;
    }
    public int getTittleResId(){
        return mTittleResId;
    }
    public int getLayoutResId(){
        return mLayoutResId;
    }
}
