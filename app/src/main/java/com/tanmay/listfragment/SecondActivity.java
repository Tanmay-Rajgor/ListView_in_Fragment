package com.tanmay.listfragment;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.tanmay.listfragment.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentSecond fragmentSecond = new FragmentSecond();

        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        fragmentSecond.setArguments(bundle);
        fragmentTransaction.add(R.id.frameLayout, fragmentSecond);
        fragmentTransaction.commit();
        }
    }

