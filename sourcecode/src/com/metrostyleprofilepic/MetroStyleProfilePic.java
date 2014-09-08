package com.metrostyleprofilepic;

import java.util.Random;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class MetroStyleProfilePic extends View {

	private Context mContext;

	public enum MetroStyleColors {

		DARK_GRAY(0), SOFT_GRAY(1), RED(2), BROWN(3), MANGO(4), LIME(5), GREEN(
				6), TEAL(7), BLUE(8), PURPLE(9), MAGENTA(10), PINK(11), WHITE(
				12);

		private final int value;

		private MetroStyleColors(final int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	public MetroStyleProfilePic(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);
		mContext = context;
	}

	public MetroStyleProfilePic(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
	}

	public MetroStyleProfilePic(Context context) {
		super(context);
		mContext = context;
	}

	@Override
	protected void onDraw(Canvas canvas) {

		super.onDraw(canvas);

		int bgColor = randomColor(0, 11);
		
		Paint paint = new Paint();
		
		paint.setColor(getBackgroundColor(bgColor));
		canvas.drawRect(new Rect(0, 0, 100, 100), paint);
		
		paint.setColor(getBackgroundColor(MetroStyleColors.WHITE.getValue()));
		paint.setStrokeWidth(20);
		canvas.drawText("AE", 10, 10, paint);
		
	}

	private int randomColor(int min, int max) {

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	private int getBackgroundColor(int number) {

		if (number == MetroStyleColors.DARK_GRAY.getValue())
			return mContext.getResources().getColor(R.color.dark_gray);
		else if (number == MetroStyleColors.SOFT_GRAY.getValue())
			return mContext.getResources().getColor(R.color.soft_gray);
		else if (number == MetroStyleColors.RED.getValue())
			return mContext.getResources().getColor(R.color.red);
		else if (number == MetroStyleColors.BROWN.getValue())
			return mContext.getResources().getColor(R.color.brown);
		else if (number == MetroStyleColors.MANGO.getValue())
			return mContext.getResources().getColor(R.color.mango);
		else if (number == MetroStyleColors.LIME.getValue())
			return mContext.getResources().getColor(R.color.lime);
		else if (number == MetroStyleColors.GREEN.getValue())
			return mContext.getResources().getColor(R.color.green);
		else if (number == MetroStyleColors.TEAL.getValue())
			return mContext.getResources().getColor(R.color.teal);
		else if (number == MetroStyleColors.BLUE.getValue())
			return mContext.getResources().getColor(R.color.blue);
		else if (number == MetroStyleColors.PURPLE.getValue())
			return mContext.getResources().getColor(R.color.purple);
		else if (number == MetroStyleColors.MAGENTA.getValue())
			return mContext.getResources().getColor(R.color.magenta);
		else if (number == MetroStyleColors.PINK.getValue())
			return mContext.getResources().getColor(R.color.pink);
		else if (number == MetroStyleColors.WHITE.getValue())
			return mContext.getResources().getColor(R.color.white);
		else
			return mContext.getResources().getColor(R.color.dark_gray);

	}
}
