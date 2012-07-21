package com.juanmacuevas.canvas2sound;

import com.example.android.google.apis.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

public class Canvas extends Activity {
	
	
	
	private static final int height = 0;
	private static final int with = 0;
	PixelNote[][] canvasgram;
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		init();
	}


	private void init() {
		
		canvasgram = new PixelNote[with][height];

//		for(int i=0;i<with;i++)
	}
	
}