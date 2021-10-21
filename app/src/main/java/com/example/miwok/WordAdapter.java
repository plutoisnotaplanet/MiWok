package com.example.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackgroundResourceId;

    public WordAdapter(Context context, ArrayList<Word> words, int backgroundResourceId) {
        super(context, 0, words);
        mbackgroundResourceId = backgroundResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);
        }
        TextView title = listItemView.findViewById(R.id.title);

        title.setText(word.getmMiwokTranslation());

        TextView subtitle = listItemView.findViewById(R.id.subtitle);

        subtitle.setText(word.getDefaultTranslation());

        ImageView imageView = listItemView.findViewById(R.id.list_image_id);

        if (word.hasImage()) {

            imageView.setImageResource(word.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        View linLay = listItemView.findViewById(R.id.linear_layout_background);

        int color = ContextCompat.getColor(getContext(),mbackgroundResourceId);

        linLay.setBackgroundColor(color);

        return listItemView;
    }
}
