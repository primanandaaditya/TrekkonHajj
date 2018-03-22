package com.hajj.trekkon.trekkonhajj.activities;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hajj.trekkon.trekkonhajj.R;
import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract;
import com.hajj.trekkon.trekkonhajj.presenter.MAPresenter;

public class MainActivity extends Activity implements MainActivityContract.MainActivityView {

    EditText txtHP;
    Button btnSubmit;

    int PERMISSION_ALL = 1;
    String[] PERMISSIONS = {Manifest.permission.READ_CONTACTS, Manifest.permission.WRITE_CONTACTS, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE , Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.CAMERA};

    private MAPresenter maPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maPresenter = new MAPresenter(this);

        if(!hasPermissions(this, PERMISSIONS)){
            ActivityCompat.requestPermissions(this, PERMISSIONS, PERMISSION_ALL);
        }
    }


    public static boolean hasPermissions(Context context, String... permissions) {

        if (context != null && permissions != null) {
            for (String permission : permissions) {
                if (ActivityCompat.checkSelfPermission(context, permission) != PackageManager.PERMISSION_GRANTED) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void findID() {

        txtHP=(EditText)findViewById(R.id.txtHP);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                maPresenter.Submit(v, txtHP.getText().toString());


            }
        });

    }

    @Override
    public void setPhoneResult(boolean phoneResult) {

        if (phoneResult == true){
            Intent intent = new Intent(MainActivity.this, KodeActivity.class);
            startActivity(intent);
            finish();

        }else{
            Toast.makeText(MainActivity.this, "Salah",Toast.LENGTH_SHORT).show();

        }
    }
}
