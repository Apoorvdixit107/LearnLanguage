package com.example.learnlanguage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class Sign extends AppCompatActivity {
ViewPager v;
TabLayout tabLayout;
TabItem t1,t2;
SignPageAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);
        tabLayout=findViewById(R.id.tablayout);
        v=findViewById(R.id.viewpager);
t1=findViewById(R.id.t1);
t2=findViewById(R.id.t2);
    adapter = new SignPageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
    v.setAdapter(adapter);
    tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            v.setCurrentItem(tab.getPosition());
            if(tab.getPosition()==0 || tab.getPosition()==1|| tab.getPosition()==2){
                adapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    });
        v.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }



    }
