package com.example.gilyazetdinovvr.trafficlight;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

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
        Button RedButton = (Button)findViewById(R.id.buttonRed);
        RedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mColorTextView.setText(R.string.color_red);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorRed));
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onGreenButtonClick(View view) {
        mColorTextView.setText(R.string.color_green);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.colorGreen));

    }

    public void onYellowButtonClick(View view) {
        mColorTextView.setText(R.string.color_yellow);
        mRelativeLayout.setBackgroundResource(R.color.colorYellow);
    }
}
