package com.example.user.shaharapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    ToggleButton tg;
    Switch Sw;
    LinearLayout Lini;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tg=(ToggleButton)findViewById(R.id.Tgb);
        Sw=(Switch)findViewById(R.id.Swichh);
        Lini=(LinearLayout)findViewById(R.id.layout);

    }

    public void buttonclick(View view) {
        if(tg.isChecked()&& Sw.isChecked())
            Lini.setBackgroundColor(Color.BLUE );
            if(tg.isChecked())
                Lini.setBackgroundColor(Color.CYAN);
            if(Sw.isChecked())
                Lini.setBackgroundColor(Color.MAGENTA);

              else Lini.setBackgroundColor(Color.WHITE);
    }
}
