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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_restaurants, container, false);

        final ArrayList<Attractie> attracties = new ArrayList<Attractie>();


        attracties.add(new Attractie(R.drawable.restaurants, "King of the Ribs", "Ma t/m Zo 15:00 - 22:30", "Vanaf €5,50", "www.kingoftheribs.nl", "http://www.kingoftheribs.nl/"));
        attracties.add(new Attractie(R.drawable.restaurants1, "Vapiano", "Ma t/m Zo 12:00 - 22:00", "Vanaf €7,50", "www.vapiano.com/nl", "https://nl.vapiano.com/nl/home/"));
        attracties.add(new Attractie(R.drawable.restaurants2, "La place", "Ma t/m Zo 08:00 - 18:00", "Vanaf €6,50", "www.laplace.com/nl", "https://www.laplace.com/nl/"));
        attracties.add(new Attractie(R.drawable.restaurants3, "Burger King", "Ma t/m Zo 12:00 - 22:00", "Vanaf €2,75", "www.burgerking.nl", "https://www.burgerking.nl/"));
        attracties.add(new Attractie(R.drawable.restaurants4, "Kwalitaria", "Ma t/m Zo 11:00 - 22:00", "Vanaf €2,95", "www.kwalitaria.nl", "https://kwalitaria.nl/"));
        attracties.add(new Attractie(R.drawable.restaurants5, "Kokusai", "Ma t/m Zo 16:30 - 23:00", "€27,00 (Onbeperkt 2 uur sushi eten)", "www.restaurantkokusai.nl", "http://www.restaurantkokusai.nl/"));


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


