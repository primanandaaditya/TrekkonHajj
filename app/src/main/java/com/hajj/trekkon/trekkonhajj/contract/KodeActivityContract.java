package com.hajj.trekkon.trekkonhajj.contract;

import android.view.View;

/**
 * Created by trekkon on 3/7/18.
 */

public interface KodeActivityContract {

    interface KodeActivityView{
        void findID();
        void setResult(boolean hasil);
    }

    interface KodeActivityModel{
        boolean getResult();
    }

    interface KodeActivityPresenter{
        void btnKlik(View view, String kode);
    }

}
