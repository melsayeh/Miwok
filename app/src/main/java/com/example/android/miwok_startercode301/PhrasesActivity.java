package com.example.android.miwok_startercode301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        int bgColor= R.color.category_phrases;

        ArrayList<Word> phraseList = new ArrayList<>();

        phraseList.add(new Word( "Where are you going?","minto wuksus?" , R.raw.phrase_where_are_you_going));
        phraseList.add(new Word( "What is your name?","tinnә oyaase'nә?" , R.raw.phrase_what_is_your_name));
        phraseList.add(new Word( "My name is ..","oyaaset.." , R.raw.phrase_my_name_is));
        phraseList.add(new Word( "How are you feeling","michәksәs?" , R.raw.phrase_how_are_you_feeling));
        phraseList.add(new Word( "I am feeling good","kuchi achit" , R.raw.phrase_im_feeling_good));
        phraseList.add(new Word( "Are you coming?","әәnәs'aa?" , R.raw.phrase_are_you_coming));
        phraseList.add(new Word("Yes, I am coming","hәә’ әәnәm" , R.raw.phrase_yes_im_coming));
        phraseList.add(new Word("I am coming","әәnәm" , R.raw.phrase_im_coming));
        phraseList.add(new Word( "Let's go","yoowutis" , R.raw.phrase_lets_go));
        phraseList.add(new Word( "Come here","әnni'nem" , R.raw.phrase_come_here));



        WordAdapter Adapter = new WordAdapter(this, phraseList , bgColor);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(Adapter);

    }
}
