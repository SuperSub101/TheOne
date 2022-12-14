package com.example.theone;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.BusHolder> {


    //Bus Adapter

    private Context context;
    private ArrayList<Bus> buses;

    //conc


    public BusAdapter(Context context, ArrayList<Bus> buses) {
        this.context = context;
        this.buses = buses;
    }


    @NonNull
    @Override
    public BusHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.bus_layout_item,parent,false);

        return new BusHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BusAdapter.BusHolder holder, int position) {

        Bus bus = buses.get(position);
        holder.SetDetails(buses);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),BusDetails.class);
                view.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return buses.size();
    }

    // Holder

    class BusHolder extends RecyclerView.ViewHolder{


        private TextView textname, textid , textfrom , textto ,textdate, textseat;

        public BusHolder(@NonNull View itemView) {
            super(itemView);

            textname = itemView.findViewById(R.id.textmainname);
            textid = itemView.findViewById(R.id.textid);
            textfrom = itemView.findViewById(R.id.textfrom);
            textto = itemView.findViewById(R.id.textto);
            textdate = itemView.findViewById(R.id.textDate);
            textseat = itemView.findViewById(R.id.textSeats);



            //itemView.setOnClickListener((View.OnClickListener) this);

        }

        void SetDetails(Bus bus,Bus bus2)
        {
            textname.setText(Bus.getBusName());
//            textid.setText(String.format(Locale.US,"Id - "+Bus.getBusId()));
            textid.setText("Id- "+Bus.getBusId());
            textfrom.setText(String.format(Locale.US,"From - "+Bus.getBusFrom()));
            textto.setText(String.format(Locale.US,"To - "+Bus.getBusTo()));
            //textdate.setText(String.format(Locale.US,"Date- -",Bus.BusDate()));
            textdate.setText(String.format(Locale.US,"Date - "+Bus.getBusDate()));
            textseat.setText(String.format(Locale.US,"Seats - "+Bus.getBusSeat()));

        }

        public void SetDetails(ArrayList<Bus> buses) {
            textname.setText(Bus.getBusName());
//            textid.setText(String.format(Locale.US,"Id - "+Bus.getBusId()));
            textid.setText("Id- "+Bus.getBusId());
            textfrom.setText(String.format(Locale.US,"From - "+Bus.getBusFrom()));
            textto.setText(String.format(Locale.US,"To - "+Bus.getBusTo()));
            //textdate.setText(String.format(Locale.US,"Date- -",Bus.BusDate()));
            textdate.setText(String.format(Locale.US,"Date - "+Bus.getBusDate()));
            //textseat.setText(String.format(Locale.US,"Seats - "+Bus.getBusSeat()));
            textseat.setText(String.format(Locale.US,"Seats - " + Bus.getBusSeat()));
        }
        
    }
    public interface OnclickListener{
        void onclickClick(int position);
    }
}



