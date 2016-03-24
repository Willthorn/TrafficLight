package com.example.gilyazetdinovvr.trafficlight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private TextView mColorTextView;
    private RelativeLayout mRelativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mColorTextView = (TextView)findViewById(R.id.mTextViewColor);
        mRelativeLayout = (RelativeLayout)findViewById(R.id.mRelativeLayout);
        Button mGreenButton = (Button)findViewById(R.id.buttonGreen);
        Button mYellowButton = (Button)findViewById(R.id.buttonYellow);
        Button mRedButton = (Button)findViewById(R.id.buttonRed);

        mGreenButton.setOnClickListener(this);
        mYellowButton.setOnClickListener(this);
        mRedButton.setOnClickListener(this);




    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonGreen:
                mColorTextView.setText(R.string.color_green);
                mRelativeLayout.setBackgroundResource(R.color.colorGreen);
                break;
            case R.id.buttonYellow:
                mColorTextView.setText(R.string.color_yellow);
                mRelativeLayout.setBackgroundResource(R.color.colorYellow);
                break;
            case R.id.buttonRed:
                mColorTextView.setText(R.string.color_red);
                mRelativeLayout.setBackgroundResource(R.color.colorRed);
                break;
        }
    }


}
