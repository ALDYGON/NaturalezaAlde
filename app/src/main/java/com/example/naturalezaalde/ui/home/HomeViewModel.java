package com.example.naturalezaalde.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Los árboles son los esfuerzos de la tierra para hablar con el cielo que escucha.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}