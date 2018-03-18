package com.example.tedi.sharkweek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mPeriodInfoTextView;
    private ImageButton mPeriodStartsImageButton;
    private TextView mCalendarTextView;
    private TextView mSettingsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPeriodInfoTextView = findViewById(R.id.period_info_tv);
        mPeriodStartsImageButton = findViewById(R.id.period_starts_ib);
        mCalendarTextView = findViewById(R.id.calendar_tv);
        mSettingsTextView = findViewById(R.id.settings_tv);

        //TODO: Set number of days left to period on mPeriodInfoTextView
        int days = 3;
        String text = getResources().getQuantityString(R.plurals.days_left_to_period, days, days);
        mPeriodInfoTextView.setText(text);

        mPeriodStartsImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Open activity that lets the user choose a start date of the period
                Toast.makeText(getApplicationContext(),
                        "Open activity that lets the user choose a start date of the period",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

        mCalendarTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Open calendar activity
                Toast.makeText(getApplicationContext(),
                        " Open calendar activity",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });

        mSettingsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: Open settings activity
                Toast.makeText(getApplicationContext(),
                        " Open settings activity",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }
}
