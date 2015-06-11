package com.example.photodemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends Activity {

	public static final int TAKE_PHOTO = 1;

	public static final int CROP_PHOTO = 2;

	private ImageView picture;

	private Uri imageUri;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_main);
		

	}


}
