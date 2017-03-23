package com.example.gebruiker.touristguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractieAdapter extends ArrayAdapter<Attractie> {


    private static final String LOG_TAG = AttractieAdapter.class.getSimpleName();
    private LayoutInflater inflater;


    public AttractieAdapter(Activity context, ArrayList<Attractie> attracties) {
        super(context, 0, attracties);
        inflater = LayoutInflater.from(getContext());

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = inflater.inflate(
                    R.layout.list_item, parent, false);
        }

        Attractie currentLocation = getItem(position);
        TextView locationword = (TextView) listItemView.findViewById(R.id.locatie_text_view);
        locationword.setText(currentLocation.getLocatie());

        Attractie currentPrice = getItem(position);
        TextView priceword = (TextView) listItemView.findViewById(R.id.prijs_text_view);
        priceword.setText(currentPrice.getPrijs());

        Attractie currentTime = getItem(position);
        TextView timeword = (TextView) listItemView.findViewById(R.id.tijd_text_view);
        timeword.setText(currentTime.getTijd());

        Attractie currentArtist = getItem(position);
        TextView artistword = (TextView) listItemView.findViewById(R.id.artiest_text_view);
        artistword.setText(currentArtist.getArtiest());



        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_image);

        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentPrice.hasImage()) {
            iconView.setImageResource(currentPrice.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);


        } else {
            iconView.setVisibility(View.GONE);
        }


        return listItemView;
    }
}
