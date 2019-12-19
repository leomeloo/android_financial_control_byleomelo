package com.example.leobank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class HomeActivity {

    @BindViews(R.id.listView)
    ListView lv;

    public View OnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){



        lv.setAdapter();

        View view = inflater.inflate(R.layout.activity_home, null);


        return(view);
    }
}

