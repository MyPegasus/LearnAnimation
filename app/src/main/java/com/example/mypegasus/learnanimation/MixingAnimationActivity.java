package com.example.mypegasus.learnanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Toast;

public class MixingAnimationActivity extends AppCompatActivity {

	private AnimationSet as;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mixing_animation);

		/*as = new AnimationSet(false);
		// aa 和 ta 的setDuration操作将被覆盖
		as.setDuration(1000);

		AlphaAnimation aa = new AlphaAnimation(0, 1);
		aa.setDuration(2000);
		as.addAnimation(aa);

		TranslateAnimation ta = new TranslateAnimation(200, 0, 200, 0);
		ta.setDuration(500);
		as.addAnimation(ta);*/

		findViewById(R.id.btn_animateMe).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				v.startAnimation(as);

				Animation a = AnimationUtils.loadAnimation(MixingAnimationActivity.this, R.anim.animation_mixing);

				a.setAnimationListener(new Animation.AnimationListener() {
					@Override
					public void onAnimationStart(Animation animation) {
						Toast.makeText(MixingAnimationActivity.this, "Animation Start", Toast.LENGTH_SHORT).show();
					}

					@Override
					public void onAnimationEnd(Animation animation) {
						Toast.makeText(MixingAnimationActivity.this, "Animation End", Toast.LENGTH_LONG).show();
					}

					@Override
					public void onAnimationRepeat(Animation animation) {

					}
				});

				v.startAnimation(a);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_mixing_animation, menu);
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
