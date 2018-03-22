package com.hajj.trekkon.trekkonhajj.activities;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hajj.trekkon.trekkonhajj.R;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract.KodeActivityView;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract.KodeActivityPresenter;
import com.hajj.trekkon.trekkonhajj.presenter.KAPresenter;

public class KodeActivity extends Activity implements KodeActivityView {

    EditText txtKode;
    Button btnSubmit;
    private KAPresenter kaPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode);

        kaPresenter = new KAPresenter(this);
    }


    @Override
    public void findID() {
        txtKode=(EditText)findViewById(R.id.txtKode);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                kaPresenter.btnKlik(v, txtKode.getText().toString());
            }
        });
    }

    @Override
    public void setResult(boolean hasil) {

        String teks="";
        if (hasil==true){
            teks="Benar";

            Intent intent = new Intent(KodeActivity.this, PetaActivity.class );
            startActivity(intent);

            finish();
        }else{
            teks="Salah";
            Toast.makeText(KodeActivity.this, teks,Toast.LENGTH_SHORT).show();

        }


    }
}
