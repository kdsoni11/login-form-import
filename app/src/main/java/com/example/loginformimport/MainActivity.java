package com.example.loginformimport;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.loginformimport.databinding.ActivityMainBinding;
import com.loginformlibrary.listener.CompleteListener;
import com.loginformlibrary.model.LoginFormModel;
import com.loginformlibrary.view.ShowForm;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompleteListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new ShowForm.Builder()
                .with(this)
                .setListener(this)
                .build();
    }
    @Override
    public void onComplete(LoginFormModel formModel) {
        if (formModel==null){
            finish();
        }else {
            Toast.makeText(this, formModel.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}