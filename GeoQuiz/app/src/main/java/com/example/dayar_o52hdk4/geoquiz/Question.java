package com.example.dayar_o52hdk4.geoquiz;

/**
 * Created by dayar_o52hdk4 on 31.03.2017.
 */

public class Question {
    private int mTextResId;
    private  boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int TextResId, boolean answerTrue){
        mTextResId =TextResId;
        mAnswerTrue = answerTrue;
    }
}
