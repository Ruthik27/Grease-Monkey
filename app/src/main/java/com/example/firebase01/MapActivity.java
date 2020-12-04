package com.example.firebase01;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    ArrayList<LatLng> arrayList=new ArrayList<LatLng>();
    LatLng Maharashtra=new LatLng(18.515625722387334, 73.85409690308553);
    LatLng pimpri=new LatLng(18.650470685575502, 73.8230514782272);
    LatLng nashik=new LatLng(20.0020753706489, 73.78785431640247);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(Maharashtra);
        arrayList.add(pimpri);
        arrayList.add(nashik);
    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        for (int i=0;i<arrayList.size();i++){
            map.addMarker(new MarkerOptions().position(arrayList.get(i)).title("Marker"));
            map.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
            map.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
        }


    }
}
