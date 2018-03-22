package com.hajj.trekkon.trekkonhajj.presenter;

import android.view.View;

import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract.*;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract.KodeActivityModel;
import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract.KodeActivityPresenter;


/**
 * Created by trekkon on 3/7/18.
 */

public class KAPresenter implements KodeActivityPresenter {

    private KodeActivityView kodeActivityView;
    private KodeActivityModel kodeActivityModel;

    public KAPresenter(KodeActivityView kodeActivityView){
        this.kodeActivityView = kodeActivityView;
        initPresenter();
    }

    private void initPresenter(){
        kodeActivityView.findID();
    }

    @Override
    public void btnKlik(View view, String kode) {
        kodeActivityModel = new com.hajj.trekkon.trekkonhajj.model.mvp.KodeActivityModel(kode);
        boolean hasil = kodeActivityModel.getResult();
        kodeActivityView.setResult(hasil);
    }
}
