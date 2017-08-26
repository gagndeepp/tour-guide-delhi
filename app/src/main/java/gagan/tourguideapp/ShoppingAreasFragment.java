package gagan.tourguideapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingAreasFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.list_view_layout, container, false);
        final ArrayList<Attraction> attractionArrayList = new ArrayList<>();
        attractionArrayList.add(new Attraction(R.drawable.cp, getResources().getStringArray(R.array.cp)));
        attractionArrayList.add(new Attraction(R.drawable.hauzkhas, getResources().getStringArray(R.array.hauzkhas)));
        attractionArrayList.add(new Attraction(R.drawable.citywalk, getResources().getStringArray(R.array.select_citywalk)));
        attractionArrayList.add(new Attraction(R.drawable.dlf, getResources().getStringArray(R.array.dlf)));
        attractionArrayList.add(new Attraction(R.drawable.chandni_chowk, getResources().getStringArray(R.array.chandni_chowk)));
        attractionArrayList.add(new Attraction(R.drawable.dillihaat, getResources().getStringArray(R.array.dilli_haat)));
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), attractionArrayList);
        ListView temp = (ListView) mainView.findViewById(R.id.list_view_layout);
        temp.setAdapter(adapter);
        return mainView;
    }
}
