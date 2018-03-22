package com.hajj.trekkon.trekkonhajj.contract;

import android.view.View;

/**
 * Created by trekkon on 3/5/18.
 */

public interface MainActivityContract {

    interface MainActivityView{
        void findID();
        void setPhoneResult(boolean phoneResult);
    }


    interface MainActivityModel{
        boolean phoneResult();
    }


    interface MainActivityPresenter{
        void Submit(View view, String phoneNumber);
    }
}
