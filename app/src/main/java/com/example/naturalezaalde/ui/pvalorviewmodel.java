package com.example.naturalezaalde.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class pvalorviewmodel extends ViewModel {

    private final MutableLiveData<String> mText;

    public pvalorviewmodel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is visualizador fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
