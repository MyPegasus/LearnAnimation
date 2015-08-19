package com.example.mypegasus.learnanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;

public class ScaleAnimationActivity extends AppCompatActivity {

	private ScaleAnimation sa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scale_animation);

//		sa = new ScaleAnimation(0, 1, 0, 1);
//		sa = new ScaleAnimation(0, 1, 0, 1, 100, 50);
		/*sa = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
		sa.setDuration(1000);*/

		findViewById(R.id.btn_scaleMe).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				v.startAnimation(sa);
				v.startAnimation(AnimationUtils.loadAnimation(ScaleAnimationActivity.this, R.anim.animation_scale));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_scale_animation, menu);
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
}
