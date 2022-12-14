package com.example.theone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class BusRecView extends AppCompatActivity implements BusAdapter.OnclickListener {

    RecyclerView bus_recycler;

    private BusAdapter busAdapter;
    private ArrayList<Bus> busArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_rec_view);

        bus_recycler = findViewById(R.id.normal_rec);

        bus_recycler.setLayoutManager(new LinearLayoutManager(this));
        busArrayList = new ArrayList<>();
        busAdapter = new BusAdapter(this, busArrayList);
        bus_recycler.setAdapter(busAdapter);
        bus_recycler.addItemDecoration(new DividerItemDecoration(BusRecView.this, LinearLayout.VERTICAL));

        createListData();

    }

    private void createListData()
    {
        //for adding the data to the view
        //make the adapter damnit

        Bus bus = new Bus("SRS Travels",40023,"Bangalore","Chennai",14-12,45);
        busArrayList.add(bus);
        Bus bus2 = new Bus("Coach-24",401672,"Coimbatore","Delhi",17/12/22,45);
        busArrayList.add(bus);
        Bus bus3 = new Bus("Double-decker",324519,"Indore","Kolkata",15/12/22,45);
        busArrayList.add(bus);
        Bus bus4 = new Bus("SRI travels",407832,"Goa","Hyderabad",20/12/22,45);
        busArrayList.add(bus);
        Bus bus5 = new Bus("SRS Travels",40024,"Mumbai","Pune",14/12/22,45);
        busArrayList.add(bus);
        Bus bus6 = new Bus("Montagem",32567,"Chennai" ,"your mom", 28/12/22,88);
        busArrayList.add(bus);
        Bus bus7 = new Bus("Bruh",69420,"Hyderabad","Goa",2/1/23,66);
        busArrayList.add(bus);
        Bus bus8 = new Bus("SRI travels",67523,"Delhi","Coimbatore",1/1/23,23);
        busArrayList.add(bus);
        Bus bus9 = new Bus("Coach-67",653421,"Kolkata","Indore",5/1/23,34);
        busArrayList.add(bus);
        Bus bus10 = new Bus("Green Valley",986724,"Chennai","Bangalore",5/1/69,44);
        busArrayList.add(bus);

    }

    @Override
    public void onclickClick(int position) {

    }
}