package com.hajj.trekkon.trekkonhajj.model.mvp;

import android.content.Context;
import android.widget.Toast;

import com.hajj.trekkon.trekkonhajj.contract.PetaActivityContract;
import com.hajj.trekkon.trekkonhajj.helper.GPSTracker;
import com.hajj.trekkon.trekkonhajj.helper.SingleShotLocationProvider;

/**
 * Created by trekkon on 3/7/18.
 */

public class PetaActivityModel implements PetaActivityContract.PetaActivityModel {

    double TLat, TLong;
    GPSTracker gpsTracker;
    Context context;

    public PetaActivityModel (final Context context){
        this.context = context;

        gpsTracker = new GPSTracker(context);
        if (gpsTracker.canGetLocation()){
            TLat = gpsTracker.getLatitude();
            TLong = gpsTracker.getLongitude();
        }

    }



    @Override
    public double getLat() {
        return TLat;
    }

    @Override
    public double getLong() {

        return TLong;
    }


}
