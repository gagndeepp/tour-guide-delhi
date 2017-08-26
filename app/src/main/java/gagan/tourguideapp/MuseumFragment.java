package gagan.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static gagan.tourguideapp.R.layout.list_view_layout;

public class MuseumFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(list_view_layout, container, false);
        final ArrayList<Attraction> attractionArrayList = new ArrayList<>();
        attractionArrayList.add(new Attraction(R.drawable.ngma, getResources().getStringArray(R.array.modern_art)));
        attractionArrayList.add(new Attraction(R.drawable.aur_force, getResources().getStringArray(R.array.air_force)));
        attractionArrayList.add(new Attraction(R.drawable.gandhi_smriti, getResources().getStringArray(R.array.gandhi_smriti)));
        attractionArrayList.add(new Attraction(R.drawable.handloom_handicraft, getResources().getStringArray(R.array.handloom_handicraft)));
        attractionArrayList.add(new Attraction(R.drawable.science_musuem, getResources().getStringArray(R.array.science_center)));
        attractionArrayList.add(new Attraction(R.drawable.metro, getResources().getStringArray(R.array.metro_museum)));
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), attractionArrayList);
        ListView temp = (ListView) mainView.findViewById(R.id.list_view_layout);
        temp.setAdapter(adapter);
        return mainView;
    }
}
