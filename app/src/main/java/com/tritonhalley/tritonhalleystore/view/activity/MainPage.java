package com.tritonhalley.tritonhalleystore.view.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.tritonhalley.tritonhalleystore.R;
import com.tritonhalley.tritonhalleystore.view.fragment.CartPageFragment;
import com.tritonhalley.tritonhalleystore.view.fragment.CategoryPageFragment;
import com.tritonhalley.tritonhalleystore.view.fragment.HomePageFragment;
import com.tritonhalley.tritonhalleystore.view.fragment.ProfilePageFragment;

public class MainPage extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        findViews();
        listener();
    }
    private void findViews(){
         mBottomNavigationView = findViewById(R.id.button_navigation);
    }
    private void listener(){
        mBottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectionFragment = null ;

                switch (item.getItemId()) {
                    case R.id.nav_home:{
                        selectionFragment = HomePageFragment.newInstance();
                        break;
                    }
                    case R.id.nav_category:{
                        selectionFragment = CategoryPageFragment.newInstance();
                        break;
                    }
                    case R.id.nav_cart:{
                        selectionFragment = CartPageFragment.newInstance();
                        break;
                    }
                    case R.id.nav_profile:{
                        selectionFragment = ProfilePageFragment.newInstance();
                        break;
                    }
                }
                startFragment(selectionFragment);
                return true;
            }
        });
    }
    private void startFragment(Fragment fragment) {
        FragmentManager fM = getSupportFragmentManager();
        fM.beginTransaction().replace(R.id.fragment_container,fragment).commit();
    }
}