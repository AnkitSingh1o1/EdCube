package com.example.edcube;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class VideoListAdapter extends ArrayAdapter<Video> {
    public VideoListAdapter(@NonNull Context context, List<Video> video) {
        super(context, 0, video);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }

        Video currVideo =getItem(position);

        //THUMBNAIL
        ImageView currVideoThumbnail = convertView.findViewById(R.id.imageView);
        try{
            URL imageURL = new URL(currVideo.getThumbnail());
            Glide.with(getContext()).load(imageURL).into(currVideoThumbnail);}
        catch (IOException e){
            e.printStackTrace();
        }

        //TITLE
        TextView heading = convertView.findViewById(R.id.textView);
        heading.setText(currVideo.getTitle());

        return convertView;
    }
}
