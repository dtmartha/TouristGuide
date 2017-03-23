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
public class ConcertenFragment extends Fragment {


    public ConcertenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attractie> attracties = new ArrayList<Attractie>();


        View rootView = inflater.inflate(R.layout.activity_concerten, container, false);


        attracties.add(new Attractie(R.drawable.concert, "Mariah Carey", "Paradiso", "23 Maart 20:30, €37,50", "www.paradiso.nl", "https://www.paradiso.nl/web/Agenda.htm"));
        attracties.add(new Attractie(R.drawable.concert1, "Sneazzy", "Melkweg", "20 Maart 20:00, €20,00", "www.melkweg.nl", "https://www.melkweg.nl/nl/agenda/"));
        attracties.add(new Attractie(R.drawable.concert2, "Tiesto", "Ziggo dome", "28 Maart 00:00, €55,00 ", "www.ziggodome.nl", "https://www.ziggodome.nl/agenda"));
        attracties.add(new Attractie(R.drawable.concert3, "Calvin Harris", "Ziggo dome", "1 April 22:00, €45,00", "www.ziggodome.nl", "https://www.ziggodome.nl/agenda"));
        attracties.add(new Attractie(R.drawable.concert4, "Gregory Porter", "Ziggo dome", "2 April 19:00, €14,95", "www.ziggodome.nl", "https://www.ziggodome.nl/agenda"));
        attracties.add(new Attractie(R.drawable.concert5, "Jebroer", "Amsterdam, Flevopark", "5 April 23:00, €10,00", "www.appelsap.net/festival", "http://appelsap.net/festival/"));


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
