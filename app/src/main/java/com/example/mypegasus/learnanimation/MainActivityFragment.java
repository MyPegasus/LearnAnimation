package com.example.mypegasus.learnanimation;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

	public MainActivityFragment() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_main, container, false);

		view.findViewById(R.id.btn_animateMe).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				/*AlphaAnimation aa = new AlphaAnimation(0, 1);
				aa.setDuration(1000);

				v.startAnimation(aa);*/
				v.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.animation_alpha));
			}
		});

		return view;
	}
}
