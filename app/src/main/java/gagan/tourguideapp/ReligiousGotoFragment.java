package gagan.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ReligiousGotoFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.list_view_layout, container, false);
        final ArrayList<Attraction> attractionArrayList = new ArrayList<>();
        attractionArrayList.add(new Attraction(R.drawable.akshardham, getResources().getStringArray(R.array.akshardham)));
        attractionArrayList.add(new Attraction(R.drawable.banglasahib, getResources().getStringArray(R.array.banglasahib)));
        attractionArrayList.add(new Attraction(R.drawable.iskcon, getResources().getStringArray(R.array.iskcon_punjabibagh)));
        attractionArrayList.add(new Attraction(R.drawable.lotus_temple, getResources().getStringArray(R.array.lotus_temple)));
        attractionArrayList.add(new Attraction(R.drawable.sisganj, getResources().getStringArray(R.array.sisganjsahib)));
        attractionArrayList.add(new Attraction(R.drawable.jama_masjid, getResources().getStringArray(R.array.jama_masjid)));
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), attractionArrayList);
        ListView temp = (ListView) mainView.findViewById(R.id.list_view_layout);
        temp.setAdapter(adapter);
        return mainView;
    }
}
