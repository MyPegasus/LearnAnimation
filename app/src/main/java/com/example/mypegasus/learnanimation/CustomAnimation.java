package com.example.mypegasus.learnanimation;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by Administrator on 2015/8/19 0019.
 */
public class CustomAnimation extends Animation {

	@Override
	public void initialize(int width, int height, int parentWidth, int parentHeight) {

//		System.out.println("init");

		super.initialize(width, height, parentWidth, parentHeight);
	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {

//		System.out.println(interpolatedTime);

//		t.setAlpha(interpolatedTime);

//		t.getMatrix().setTranslate(200 * interpolatedTime, 200 * interpolatedTime);

		t.getMatrix().setTranslate((float) (Math.sin(interpolatedTime * 2 * 3.14) * 100), 0);

		super.applyTransformation(interpolatedTime, t);

	}
}
