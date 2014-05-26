package com.academicode.stylesthemes;

import android.app.Activity;
import android.os.Bundle;

/**
 * This is the first (and only) Activity that the user sees when running the Application.
 * 
 * Currently, we only display the "layout\main.xml" file.
 * 
 * @author Marc J. McDougall
 */
public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		// Mandatory parent method call.
		super.onCreate(savedInstanceState);
		
		// Set the content view to main.xml.
		setContentView(R.layout.main);
	}
}
