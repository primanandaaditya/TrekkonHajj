package com.hajj.trekkon.trekkonhajj.presenter;

/**
 * Created by trekkon on 3/7/18.
 */

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.hajj.trekkon.trekkonhajj.contract.PetaActivityContract;
import com.hajj.trekkon.trekkonhajj.contract.PetaActivityContract.PetaActivityView;
import com.hajj.trekkon.trekkonhajj.helper.GPSTracker;
import com.hajj.trekkon.trekkonhajj.model.mvp.PetaActivityModel;

public class PetaActivityPresenter implements PetaActivityContract.PetaActivityPresenter {
    
    private PetaActivityView petaActivityView;
    private PetaActivityModel petaActivityModel;
    Context context;

    
    public PetaActivityPresenter (Context context, PetaActivityView petaActivityView){

        this.context = context;
        this.petaActivityView = petaActivityView;

        petaActivityView.findID();
        petaActivityModel = new PetaActivityModel(context);


    }


    @Override
    public LatLng initPeta() {
        double TLat = petaActivityModel.getLat();
        double TLong = petaActivityModel.getLong();

        petaActivityView.setLatLong(TLat, TLong);
        LatLng latLng = new LatLng(TLat, TLong);
        return latLng;
    }
}
