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
    LatLng TempoHouse=new LatLng(18.516801926789707, 73.87091618326347  );
    LatLng KartikTempoHouse=new LatLng(18.46686447151899, 73.8574632119982);
    LatLng KrishnaTempoHouse=new LatLng(18.516476377357307, 73.86834126265052);
    LatLng MaruthiTempoHouse=new LatLng(18.516801926789707, 73.86551114890855);
    LatLng PerfectTempoHouse=new LatLng(18.60262429405917, 73.82622728025174);
    LatLng YogeshAutoSpares =new LatLng( 18.49835799775999, 73.95827245657956);
    LatLng VighneshAutoSpares =new LatLng(  18.495778208498113, 73.9451517100845);
    LatLng JAIHANUMANAUTOSPAREPARTS  =new LatLng(  18.491234727120183, 73.93118340961875);
    LatLng AKAutospares  =new LatLng( 18.50486399295796, 73.95448010184478);
    LatLng ChetakAutoSpares  =new LatLng( 18.50067010445481, 73.90242479554851);
    LatLng Rahulautosparehouse   =new LatLng( 18.51597839190971, 73.86375429870384);
    LatLng ClassicAutopartsOnly4Wheelers =new LatLng( 18.487873961504803, 73.8561214483412);
    LatLng ShreeGurunanakAutoSpareParts =new LatLng( 18.515011397245225, 73.86732345577954);
    LatLng AutoHerb =new LatLng(  18.5828105762177, 73.76079521014378);
    LatLng SwachhCar =new LatLng(   18.523450532845178, 73.84217946198025);
    LatLng Xacc  =new LatLng(   18.545267869081304, 73.9069277344838);
    LatLng SunderjiCarSpa =new LatLng(    18.49048843217357, 73.87097959910886);
    LatLng AutoSpaExpress =new LatLng(     18.49034806746474, 73.81464525190722);
    LatLng AutOzViLLeCarDetailingStudio =new LatLng( 18.562887774321617, 73.78975322438534);
    LatLng XpressAutoshineCarSpa =new LatLng( 18.545952278579417, 73.90596983211553);
    LatLng MarutiServiceCentre =new LatLng( 18.501743668437754, 73.83594270260416);
    LatLng NewPoonaCar =new LatLng( 18.49295284309898, 73.82802607962344);
    LatLng BoschCarService =new LatLng( 18.530475937716588, 73.9329157937415);
    LatLng HyundaiSalesService =new LatLng( 18.498561487766853, 73.95744966848763);
    LatLng AutoMechanica   =new LatLng( 18.57427993614873, 73.96563381579722);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        arrayList.add(Maharashtra);
        arrayList.add(pimpri);
        arrayList.add(nashik);
        arrayList.add(TempoHouse);
        arrayList.add(KartikTempoHouse);
        arrayList.add(KrishnaTempoHouse);
        arrayList.add(MaruthiTempoHouse);
        arrayList.add(PerfectTempoHouse);
        arrayList.add(YogeshAutoSpares);
        arrayList.add(VighneshAutoSpares);
        arrayList.add(JAIHANUMANAUTOSPAREPARTS);
        arrayList.add(AKAutospares);
        arrayList.add(ChetakAutoSpares);
        arrayList.add(Rahulautosparehouse);
        arrayList.add(ClassicAutopartsOnly4Wheelers);
        arrayList.add(ShreeGurunanakAutoSpareParts);
        arrayList.add(AutoHerb);
        arrayList.add(SwachhCar);
        arrayList.add(SunderjiCarSpa);
        arrayList.add(AutoSpaExpress);
        arrayList.add(AutOzViLLeCarDetailingStudio);
        arrayList.add(XpressAutoshineCarSpa );
        arrayList.add(MarutiServiceCentre );
        arrayList.add(NewPoonaCar);
        arrayList.add(BoschCarService);
        arrayList.add(HyundaiSalesService);
        arrayList.add(AutoMechanica );
    }




    @Override
    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        for (int i=0;i<arrayList.size();i++){
            map.addMarker(new MarkerOptions().position(arrayList.get(i)).title(String.valueOf(arrayList)));
            map.animateCamera(CameraUpdateFactory.zoomTo(15.0f));
            map.moveCamera(CameraUpdateFactory.newLatLng(arrayList.get(i)));
        }


    }
}
