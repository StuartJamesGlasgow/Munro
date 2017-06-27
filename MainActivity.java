package com.example.android.munros;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Munro> munros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        populateMunroList();
        displayAllMunros();
    }

    private void populateMunroList(){

        munros.add(new Munro ("Ben Nevis", 1345));
        munros.add(new Munro ("Ben MacDui", 1309));
        munros.add(new Munro ("Braeriach", 1296));

    }

    private void displayAllMunros(){

        for(Munro munro: munros){
            Button myButton = new Button(this);
            myButton.setText(munro.name);
            myButton.setBackgroundColor(Color.BLUE);
            myButton.setTextColor(Color.RED);
            myButton.setTextSize(12);

            LinearLayout ll = (LinearLayout) findViewById(R.id.main_layout);
//        LayoutParams lp = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            ll.addView(myButton);
        }

    }

    private void displayMunro(Munro aMunro){

    }


    private void openMunro(Munro aMunro){

    }

}
