package com.example.android.miwok_startercode301;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

/*
* {@link WordAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Word} objects.
* */
    public class WordAdapter extends ArrayAdapter<Word> {
    /** Constructor
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param resource A List of Word objects to display in a list
     */
    int viewBgColor;
    public WordAdapter(@NonNull Activity context, ArrayList<Word> resource , int bgColor ) {
        super(context,0, resource);
        viewBgColor = bgColor;
    }

     /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the Word.
     */
    @NonNull
    @Override
    //Override getView method
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        // (Recycling) Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView==null){
        listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);}

        // Get the {@link Word} object located at this position in the list
        final Word currentWord = getItem(position);


        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        // Get the version name from the current Word object and
        // set this text on the name TextView

        LinearLayout layout = listItemView.findViewById(R.id.list_item);
        layout.setBackgroundResource(viewBgColor);

        final ImageView playImage = listItemView.findViewById(R.id.playButton);

        View.OnClickListener onClickListener = new View.OnClickListener() {

            @Override
            public void onClick( View view) {
                final MediaPlayer mediaPlayer = MediaPlayer.create(getContext(), currentWord.getAudioResource());
                    mediaPlayer.start();
                    playImage.setImageResource(R.drawable.ic_pause);


                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                        playImage.setImageResource(R.drawable.ic_play);
                    }
                });

            }
        };
        playImage.setOnClickListener(onClickListener);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        //Check if the currentWord has Image provided
        //If true, set the Image Resource ID for the View, otherwise, hide the view
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResource());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }

}
