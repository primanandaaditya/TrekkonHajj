package com.hajj.trekkon.trekkonhajj.model.mvp;

import com.hajj.trekkon.trekkonhajj.contract.MainActivityContract;

/**
 * Created by trekkon on 3/5/18.
 */

public class MainActivityModel implements MainActivityContract.MainActivityModel {

    String phoneNumber;

    public MainActivityModel(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    @Override
    public boolean phoneResult() {

        if (this.phoneNumber.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
