package abhayjain.lyricsapp;

import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Abhay Jain on 13-04-2018.
 */

public class WordAdapter extends ArrayAdapter<Word>  {


    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_xml, parent, false);
        }


        Word currentWord = getItem(position);


        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);


        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageView=(ImageView)listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImageResourceId());

        return listItemView;
    }
}