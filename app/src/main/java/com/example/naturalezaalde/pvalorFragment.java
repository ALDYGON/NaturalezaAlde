package com.example.naturalezaalde;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.naturalezaalde.databinding.FragmentPvalorBinding;
import com.example.naturalezaalde.ui.pvalorviewmodel;
//import com.example.naturalezaalde.ui.pvalorviewmodel.Visualizador3DViewModel;

public class pvalorFragment extends Fragment {

    private FragmentPvalorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pvalorviewmodel visualizador3DViewModelViewModel =
                new ViewModelProvider(this).get(pvalorviewmodel.class);

        binding = FragmentPvalorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        WebView wv = binding.wv;
        Button btn_ir = binding.btnIr;

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        btn_ir.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                wv.setWebViewClient(new WebViewClient());
                wv.loadUrl("file:///android_asset/modelViewer.html");
            }});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

