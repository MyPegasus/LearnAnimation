package com.example.mypegasus.learnanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;

public class TranslateAnimationActivity extends AppCompatActivity {

	private TranslateAnimation ta;
	private TranslateAnimation ta2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_translate_animation);

		/**
		 * fromXDelta ：相对于组件自身的起始X轴位置
		 * fromYDelta ：相对于组件自身的起始Y轴位置
		 * */
		/*ta = new TranslateAnimation(0, 200, 0, 200);
		ta.setDuration(1000);*/

		/*ta2 = new TranslateAnimation(50, 200, 50, 200);
		ta2.setDuration(1000);
*/
		findViewById(R.id.btn_translateMe).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
//				v.startAnimation(ta);
				v.startAnimation(AnimationUtils.loadAnimation(TranslateAnimationActivity.this, R.anim.animation_translate));
			}
		});
		/*findViewById(R.id.btn_translateMe2).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				v.startAnimation(ta2);
			}
		});*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_translate_animation, menu);
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
