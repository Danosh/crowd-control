package com.cc.crowdcontrol;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondScreenActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen2);
        
        //Button btnClose = (Button) findViewById(R.id.btnClose);
        //Button btnGraph = (Button) findViewById(R.id.btnGraph);
        
        // Receiving the Data
        
        Button button1 = (Button) findViewById(R.id.button1);
        
        button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent next = new Intent(getApplicationContext(), CheckIn.class);
				startActivity(next);
			}
		});
        
        /*
        // Binding Click event to Button
        btnClose.setOnClickListener(new View.OnClickListener() {
                        
                        public void onClick(View arg0) {
                                //Closing SecondScreen Activity
                                finish();
                        }
                });
        
      //Listening to button event
        btnGraph.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View arg0) {
                    //Starting a new Intent
                    Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
                    
                    // starting new activity
                    startActivity(nextScreen);
                    
            }
        
        });
        */
    }
}

