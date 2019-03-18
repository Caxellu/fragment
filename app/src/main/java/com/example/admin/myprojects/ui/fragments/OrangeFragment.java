package com.example.admin.myprojects.ui.fragments;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.admin.myprojects.R;
import com.example.admin.myprojects.ui.base.BaseFragment;

public class OrangeFragment extends BaseFragment {

    private OrangeViewModel mViewModel;

    public static OrangeFragment newInstance() {
        return new OrangeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.orange_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OrangeViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public String getName() {
        return "Orange";
    }
}
