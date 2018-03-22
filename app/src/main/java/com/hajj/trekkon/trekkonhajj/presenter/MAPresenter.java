package com.hajj.trekkon.trekkonhajj.presenter;

import android.view.View;

import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract;
import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract.MainActivityView;
import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract.MainActivityPresenter;
import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract.MainActivityModel;

/**
 * Created by trekkon on 3/5/18.
 */

public class MAPresenter implements MainActivityPresenter {

    private MainActivityView mainActivityView;
    private MainActivityModel mainActivityModel;

    public MAPresenter (MainActivityView mainActivityView){
        this.mainActivityView = mainActivityView;
        initPresenter();
    }

    private void initPresenter() {
        mainActivityView.findID();
    }


    @Override
    public void Submit(View view, String phoneNumber) {

        mainActivityModel = new com.hajj.trekkon.trekkonhajj.model.mvp.MainActivityModel(phoneNumber);
        boolean hasil = mainActivityModel.phoneResult();
        mainActivityView.setPhoneResult(hasil);
    }
}
