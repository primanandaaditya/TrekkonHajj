package com.hajj.trekkon.trekkonhajj.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.hajj.trekkon.trekkonhajj.R;
import com.hajj.trekkon.trekkonhajj.contract.PetaActivityContract;
import com.hajj.trekkon.trekkonhajj.presenter.PetaActivityPresenter;

public class PetaActivity extends FragmentActivity implements OnMapReadyCallback, PetaActivityContract.PetaActivityView {

    private GoogleMap mMap;
    PetaActivityPresenter petaActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peta);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        petaActivityPresenter = new PetaActivityPresenter(PetaActivity.this, this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        /*LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/

        mMap.addMarker(new MarkerOptions().position(petaActivityPresenter.initPeta()).title("Halo"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(petaActivityPresenter.initPeta()));
    }

    @Override
    public void findID() {
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void setLatLong(double TLat, double TLong) {

    }
}
