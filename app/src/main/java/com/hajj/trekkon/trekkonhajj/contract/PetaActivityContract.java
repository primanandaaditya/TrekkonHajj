package com.hajj.trekkon.trekkonhajj.contract;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

/**
 * Created by trekkon on 3/7/18.
 */

public interface PetaActivityContract {

    interface PetaActivityView{
        void findID();
        void setLatLong(double TLat, double TLong);
    }


    interface PetaActivityModel{
        double getLat();
        double getLong();


    }

    interface PetaActivityPresenter{
        LatLng initPeta();
    }

}
