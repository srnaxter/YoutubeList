package com.example.marco.rssyoutube;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marco.rssyoutube.model.Videos;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by marco on 3/02/18.
 */

public class AdapterEntry extends BaseAdapter {

    private Activity activity;
    private ArrayList<Videos> videosList;

    public AdapterEntry(Activity activity, ArrayList<Videos> newsList) {
        this.activity = activity;
        this.videosList = newsList;
    }

    @Override
    public int getCount() {
        return videosList.size();
    }

    @Override
    public Object getItem(int position) {
        return videosList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (convertView == null){
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.videos_list_item, null);
        }

        Videos video = videosList.get(position);

        TextView title = v.findViewById(R.id.textViewTitle);
        title.setText(video.getTitle());

        TextView author = v.findViewById(R.id.textViewAuthor);
        author.setText(video.getAuthor());

        TextView views = v.findViewById(R.id.textViewViews);
        views.setText(video.getViews());

        ImageView videosPic = v.findViewById(R.id.imageVideoPic);

        Picasso.with(v.getContext()).load(video.getImage()).into(videosPic);

        return v;
    }
}
