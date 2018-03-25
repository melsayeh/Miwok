package com.example.android.miwok_startercode301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity);

        int bgColor= R.color.category_family;

        ArrayList<Word> FamilyMembers = new ArrayList<>();

        FamilyMembers.add(new Word( "father","әpә" , R.drawable.family_father , R.raw.family_father));
        FamilyMembers.add(new Word( "mother","әṭa" , R.drawable.family_mother , R.raw.family_mother));
        FamilyMembers.add(new Word( "son","angsi" , R.drawable.family_son , R.raw.family_son));
        FamilyMembers.add(new Word( "daughter","tune" , R.drawable.family_daughter , R.raw.family_daughter));
        FamilyMembers.add(new Word("older brother","taachi" ,  R.drawable.family_older_brother , R.raw.family_older_brother));
        FamilyMembers.add(new Word( "younger brother","chalitti" , R.drawable.family_younger_brother , R.raw.family_younger_brother));
        FamilyMembers.add(new Word( "older sister","teṭe" , R.drawable.family_older_sister , R.raw.family_older_sister));
        FamilyMembers.add(new Word( "younger sister","kolliti" , R.drawable.family_younger_sister , R.raw.family_younger_sister));
        FamilyMembers.add(new Word("grandmother","ama" ,  R.drawable.family_grandmother , R.raw.family_grandmother));
        FamilyMembers.add(new Word( "grandfather","paapa" , R.drawable.family_grandfather , R.raw.family_grandfather));


        ListView WordList = findViewById(R.id.list);

        WordAdapter Adapter = new WordAdapter(this, FamilyMembers , bgColor);

        WordList.setAdapter(Adapter);
    }
}
