package com.cc.crowdcontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CheckIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_check_in);
		Button btnGraph = (Button) findViewById(R.id.button1);
        Button btnFeed = (Button) findViewById(R.id.button2);
                
        btnGraph.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//Intent next = new Intent(getApplicationContext(), DynamicGraphActivity.class);
				//startActivity(next);
			}
		});
        
        btnFeed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent next = new Intent(getApplicationContext(), FeedView.class);
				startActivity(next);
			}
		});
	}

}
