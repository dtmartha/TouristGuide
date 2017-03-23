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
public class MuseaFragment extends Fragment {


    public MuseaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Attractie> attracties = new ArrayList<Attractie>();


        View rootView = inflater.inflate(R.layout.activity_musea, container, false);


        attracties.add(new Attractie(R.drawable.musea, "Madame Tussauds", "Ma t/m Zo 10:00 - 22:00", "€7,50", "www.madametussauds.com/amsterdam/nl", "https://www.madametussauds.com/amsterdam/nl/?gclid=CPLfpoK57dICFRBmGwod7hkGuA"));
        attracties.add(new Attractie(R.drawable.musea1, "Stedelijk Museum", "Ma t/m Zo 09:00 - 21:00", "€10,00", "www.amsterdamart.com", "http://www.amsterdamart.com/venue/stedelijk-museum-amsterdam?gclid=CNfesqS57dICFcsV0wodUGUJuw"));
        attracties.add(new Attractie(R.drawable.musea2, "Amsterdam Museum", "Ma t/m Zo", "€8,50", "www.amsterdammuseum.nl", "https://www.amsterdammuseum.nl/?gclid=CKeS6dy57dICFdEy0wod7OUIFg"));
        attracties.add(new Attractie(R.drawable.musea3, "Hermitage Museum", "Ma t/m Zo", "€15,00", "www.museumtv.nl", "https://museumtv.nl/tentoonstelling/hermitage-1917-romanovs-revolutie-einde-monarchie/?gclid=CJnA9Pe57dICFSso0wod4OIP7w"));
        attracties.add(new Attractie(R.drawable.musea4, "Van Gogh Museum", "Ma t/m Zo", "€12,50", "www.vangoghmuseum.nl", "https://www.vangoghmuseum.nl/nl/plan-je-bezoek/tickets-en-webshop?gclid=CNq31qi67dICFRBmGwodpg8Gqw"));
        attracties.add(new Attractie(R.drawable.musea5, "Tropenmuseum", "Ma t/m Zo", "€9,50", "www.tropenmuseum.nl", "https://tropenmuseum.nl/"));


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
