package com.example.smsmanager;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

import android.widget.ImageView;


	public class MainActivity extends Activity {

	ImageView add;
	ImageView messages;
	ImageView settings;
	ImageView about;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView about = (ImageView) findViewById(R.id.about);
		ImageView add = (ImageView) findViewById(R.id.add);
		ImageView settings = (ImageView) findViewById(R.id.settings);
		ImageView messages = (ImageView) findViewById(R.id.manage_messages);
		
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, AboutActivity.class));
				
			}
		});
	
	
		add.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, AddContactActivity.class));
			
		}
	});

	
		messages.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, MessagesActivity.class));
		
	}
});

	
		settings.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this, SettingsActivity.class));
		
	}
});
}
	
}

