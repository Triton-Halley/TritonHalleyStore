package com.tritonhalley.tritonhalleystore.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.tritonhalley.tritonhalleystore.R;

public class CategoryPageFragment extends Fragment {




    public CategoryPageFragment() {
        // Required empty public constructor
    }


    public static CategoryPageFragment newInstance() {
        CategoryPageFragment fragment = new CategoryPageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category_page, container, false);
    }
}