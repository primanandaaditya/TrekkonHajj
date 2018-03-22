package com.hajj.trekkon.trekkonhajj.model.mvp;

import com.hajj.trekkon.trekkonhajj.contract.KodeActivityContract;

/**
 * Created by trekkon on 3/7/18.
 */

public class KodeActivityModel implements KodeActivityContract.KodeActivityModel {

    String kode;

    public KodeActivityModel(String kode){
        this.kode = kode;
    }


    @Override
    public boolean getResult() {
        if (kode.equals("123")){
            return  true;
        }else{
            return false;
        }
    }
}
