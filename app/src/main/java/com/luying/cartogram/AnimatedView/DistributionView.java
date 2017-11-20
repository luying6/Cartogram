package com.luying.cartogram.AnimatedView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * 创建人：luying
 * 创建时间：2017/11/20
 * 类说明：
 */

public class DistributionView extends View {
    protected final String TAG = this.getClass().getSimpleName();
    Paint paint1;
    Paint paint2;
    Paint paint3;

    RectF mDrawRectf = new RectF();


    private enum Mode {
        DRAW, TOUCH
    }

    private enum LineGravity {

    }

    private Mode mode = Mode.DRAW;


    public DistributionView(Context context) {
        super(context);
        initView(context, null);

    }

    public DistributionView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);

    }

    public DistributionView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);

    }

    private void initView(Context context, AttributeSet attrs) {
        if (paint1 == null) paint1 = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);//抗锯齿，抗抖动
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(80);
        paint1.setColor(Color.RED);

        if (paint2 == null) paint2 = new Paint(paint1);
        paint2.setColor(Color.GREEN);

        if (paint3 == null) paint3 = new Paint(paint1);
        paint3.setColor(Color.BLUE);


    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() - getPaddingLeft() - getPaddingRight();
        float height = getHeight() - getPaddingTop() - getPaddingBottom();
        canvas.translate(width / 2, height / 2);

        //半径
        float radius = (float) (Math.min(width, height) / 2 * 0.85);
        mDrawRectf.set(-radius, -radius, radius, radius);

        canvas.drawArc(mDrawRectf, 0, 120, false, paint1);
        canvas.drawArc(mDrawRectf, 120, 120, false, paint2);
        canvas.drawArc(mDrawRectf, 240, 120, false, paint3);
    }
}
