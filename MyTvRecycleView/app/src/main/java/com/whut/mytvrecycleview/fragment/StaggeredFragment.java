package com.whut.mytvrecycleview.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.whut.mytvrecycleview.R;

import butterknife.ButterKnife;

/**
 * 作者: x00378851
 * 日期: 2018/10/21 15:48
 */

public class StaggeredFragment  extends Fragment {
    public static StaggeredFragment newInstance() {
        StaggeredFragment fragment = new StaggeredFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.layout_staggered_grid, container, false);
        ButterKnife.bind(this, view);
        return view;
    }
}
