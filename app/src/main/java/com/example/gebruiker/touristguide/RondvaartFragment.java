package com.example.gebruiker.touristguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RondvaartFragment extends Fragment {


    public RondvaartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attractie> attracties = new ArrayList<Attractie>();


        View rootView = inflater.inflate(R.layout.activity_rondvaart, container, false);


        attracties.add(new Attractie(R.drawable.rondvaart, "Sterrengracht 17", "Ma t/m Zo 09:00 - 22:00", "€16,00", "www.lovers.nl", "https://www.lovers.nl"));
        attracties.add(new Attractie(R.drawable.rondvaart1, "Beatrixgracht 11", "Ma t/m Zo 09:00 - 22:00", "€20,00 (Inclusief drankje)", "www.getyourguide.nl", "https://www.getyourguide.nl/-l2986/?cmp=ga&campaignid=768809673&adgroupid=40161368613&targetid=kwd-32208113952&loc_physical_ms=1010318&matchtype=b&network=g&device=c&creative=173287244337&keyword=%2Bamsterdamse%20%2Bgrachten%20%2Btour&adposition=1t1&partner_id=CD951&gclid=CN236YCu7dICFUE6GwodgfYOJA"));
        attracties.add(new Attractie(R.drawable.rondvaart2, "Maximagracht 39", "Ma t/m Zo 11:00 - 00:00", "€35,00 (Onbeperkt bier)", "www.puuramsterdam.nl", "https://www.puuramsterdam.nl/bedrijfsuitjes/varen/boottochten/?gclid=CP6m9tyu7dICFRM8Gwod8X4LkA"));
        attracties.add(new Attractie(R.drawable.rondvaart3, "Somagracht 42", "Di t/m Za 08:00 - 20:00", "€15,50", "www.smidtje.nl", "http://www.smidtje.nl/?gclid=CLid2veu7dICFcSRGwodTOUNhQ"));
        attracties.add(new Attractie(R.drawable.rondvaart4, "Leliegracht 59", "Za & Zo 00:00 - 06:00", "€29,00", "www.tours.amsterdamtour.nl", "http://tours.amsterdamtour.nl/vaartochten-boottocht-amsterdam/goedkope-rondvaart-amsterdam-met-korting/?gclid=CPKYkJKv7dICFYUp0wodtdsB4Q"));
        attracties.add(new Attractie(R.drawable.rondvaart5, "Diliongracht 18", "Ma t/m Zo 09:00 - 22:00", "€23,50 (Liveband aanwezig)", "www.tours-tickets.com", "https://www.tours-tickets.com/nl/rondvaarten/"));


        AttractieAdapter adapter = new AttractieAdapter(getActivity(), attracties);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attractie attractie = attracties.get(position);

                String url = attractie.getUrl();

                if (url != null) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                }
            }
        });


        return rootView;
    }

}











