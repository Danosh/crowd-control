package com.cc.crowdcontrol;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TrafficGraph extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_traffic_graph);
		Button btnHome = (Button) findViewById(R.id.button1);
        
        btnHome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent next = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(next);
			}
		});
	}

}
