package com.cc.crowdcontrol;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn1 = (ImageButton) findViewById(R.id.imageButton2);
        
        //Listening to button event
            btn1.setOnClickListener(new View.OnClickListener() {
                
                public void onClick(View arg0) {
                        //Starting a new Intent
                        Intent i = new Intent(getApplicationContext(), SecondScreenActivity.class);
                        
                        // starting new activity
                        startActivity(i);
                }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
