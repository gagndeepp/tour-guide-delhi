package gagan.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Gagan on 6/30/2017.
 */

class ListItemAdapter extends ArrayAdapter<Attraction> {

    ListItemAdapter(Context context, ArrayList<Attraction> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }
        Attraction currentAttraction = getItem(position);
        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        TextView attractionHeadingTextView = (TextView) listItemView.findViewById(R.id.list_item_heading);
        TextView attractionDescTextView = (TextView) listItemView.findViewById(R.id.list_item_description);
        TextView attractionInfoTextView = (TextView) listItemView.findViewById(R.id.list_item_info);
        assert currentAttraction != null;
        attractionImageView.setImageResource(currentAttraction.getImageRes());
        attractionHeadingTextView.setText(currentAttraction.getHeadingString());
        attractionDescTextView.setText(currentAttraction.getDescString());
        attractionInfoTextView.setText(currentAttraction.getInfoString());
        return listItemView;
    }
}
