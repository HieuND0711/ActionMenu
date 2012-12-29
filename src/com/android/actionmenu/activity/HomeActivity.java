package com.android.actionmenu.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.actionmenu.library.ArcMenu;
import com.android.actionmenu.library.RayMenu;

public class HomeActivity extends Activity {
	private static final int[] ITEM_DRAWABLES = { R.drawable.composer_camera, R.drawable.composer_music,
		R.drawable.composer_place, R.drawable.composer_sleep, R.drawable.composer_thought, R.drawable.composer_with };

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.layout_home);

	ArcMenu arcMenu = (ArcMenu) findViewById(R.id.arc_menu);

	final int itemCount = ITEM_DRAWABLES.length;
	for (int i = 0; i < itemCount; i++) {
		ImageView item = new ImageView(this);
		item.setImageResource(ITEM_DRAWABLES[i]);

		final int position = i;
		arcMenu.addItem(item, new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(HomeActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
			}
		});// Add a menu item
	}

	RayMenu rayMenu = (RayMenu) findViewById(R.id.ray_menu);
	for (int i = 0; i < itemCount; i++) {
		ImageView item = new ImageView(this);
		item.setImageResource(ITEM_DRAWABLES[i]);

		final int position = i;
		rayMenu.addItem(item, new OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(HomeActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
			}
		});// Add a menu item
	}
}
}
