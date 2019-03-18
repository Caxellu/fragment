package com.example.admin.myprojects.ui.fragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.myprojects.R;
import com.example.admin.myprojects.ui.base.BaseFragment;

public class GreenFragment extends BaseFragment {

    private GreenViewModel mViewModel;
    private Button btngreen;

    public static GreenFragment newInstance() {
        return new GreenFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.green_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GreenViewModel.class);
        btngreen = getView().findViewById(R.id.btngreen);
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.setIsActive(true);
            }
        });
        mViewModel.isActive.observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(@Nullable Boolean aBoolean) {
                Toast.makeText(getContext(),"isActive = "+ String.valueOf(aBoolean),Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public String getName() {
        return "Green";
    }
}
