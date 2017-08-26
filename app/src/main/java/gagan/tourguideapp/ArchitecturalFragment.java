package gagan.tourguideapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ArchitecturalFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.list_view_layout, container, false);
        final ArrayList<Attraction> attractionArrayList = new ArrayList<>();
        attractionArrayList.add(new Attraction(R.drawable.qutab, getResources().getStringArray(R.array.qutab_minar)));
        attractionArrayList.add(new Attraction(R.drawable.agrasen_ki_boali, getResources().getStringArray(R.array.agrasen_boali)));
        attractionArrayList.add(new Attraction(R.drawable.humayun, getResources().getStringArray(R.array.humayun_tomb)));
        attractionArrayList.add(new Attraction(R.drawable.india_gate, getResources().getStringArray(R.array.india_gate)));
        attractionArrayList.add(new Attraction(R.drawable.redfort, getResources().getStringArray(R.array.red_fort)));
        attractionArrayList.add(new Attraction(R.drawable.safdarjung, getResources().getStringArray(R.array.safdarjang_tomb)));
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), attractionArrayList);
        ListView temp = (ListView) mainView.findViewById(R.id.list_view_layout);
        temp.setAdapter(adapter);
        return mainView;
    }
}
