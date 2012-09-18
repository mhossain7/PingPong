package com.example.ponggame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {

	public Paint backgroundPaint;
	public Paint ballPaint;
	
	public GameView(Context context) {
		super(context);
		init();
	}

	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public GameView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}
	
	private void init(){
		backgroundPaint = new Paint();
		backgroundPaint.setColor(Color.BLACK);
		
		ballPaint = new Paint();
		ballPaint.setColor(Color.RED);
	}
	
	public void onDraw(Canvas canvas){
		canvas.save();
		canvas.drawRect(0, 0, getWidth(), getHeight(), backgroundPaint);
		canvas.drawCircle(80, 80, 10, ballPaint);
		canvas.restore();
	}

}
