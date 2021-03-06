package com.example.android.miwok_startercode301;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        int bgColor= R.color.category_colors;
        ArrayList<Word> colorList = new ArrayList<>();

        colorList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colorList.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colorList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colorList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colorList.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        colorList.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        colorList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colorList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));
        

        WordAdapter itemsAdapter = new WordAdapter(this , colorList , bgColor);
        ListView colorsList = (ListView) findViewById(R.id.list);

        colorsList.setAdapter(itemsAdapter);
    }
}
