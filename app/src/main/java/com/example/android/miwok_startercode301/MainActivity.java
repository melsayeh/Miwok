/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok_startercode301;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Finds the TextView that we are gonna attach the event listener to
        TextView numbers = findViewById(R.id.numbers);

        //1- Create new OnClickListener from the interface View.OnClickListener
        //2- Create a method to activate an intent to open NumbersActivity
        //   when the OnClickListener is activated.

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbers = new Intent (view.getContext(),NumbersActivity.class);
                startActivity(numbers);
            }
        });

        TextView family = findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent family = new Intent(view.getContext(),FamilyActivity.class);
                startActivity(family);
            }
        });

        TextView colors = findViewById(R.id.colors);

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colors = new Intent (view.getContext(),ColorsActivity.class);
                startActivity(colors);
            }
        });

        TextView phrases = findViewById(R.id.phrases);

        phrases.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent phrases = new Intent(view.getContext(),PhrasesActivity.class);
                startActivity(phrases);
            }
        });
    }
}
