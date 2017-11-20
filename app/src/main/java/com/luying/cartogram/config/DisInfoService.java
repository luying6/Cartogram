package com.luying.cartogram.config;

import android.graphics.Paint;

import com.luying.cartogram.data.DisInfo;

import java.util.UUID;

/**
 * 创建人：luying
 * 创建时间：2017/11/20
 * 类说明：
 */

public class DisInfoService {
    private String id;
    private DisInfo mDisInfo;
    private float startAngle;
    private float endAngle;
    private int strokeWidth;
    private boolean drawStrokeOnly = true; //不填充
    private Paint mPaint;
    private Paint mCopyPaint;


    public DisInfoService(DisInfo mDisInfo) {
        id = UUID.randomUUID().toString();
        this.mDisInfo = mDisInfo;
        initPaint(mDisInfo);
    }

    private void initPaint(DisInfo info) {
        if (mPaint == null) mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        mPaint.setStyle(drawStrokeOnly ? Paint.Style.STROKE : Paint.Style.FILL);
        mPaint.setStrokeWidth(strokeWidth);
        mPaint.setColor(info.getColor());
        mPaint.setStrokeJoin(Paint.Join.MITER);//直角

        if (mCopyPaint == null) mCopyPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        mCopyPaint.set(mPaint);
    }


    public static DisInfoService create(DisInfo mDisInfo) {
        return new DisInfoService(mDisInfo);
    }

    public DisInfo getmDisInfo() {
        return mDisInfo;
    }

    public void setmDisInfo(DisInfo mDisInfo) {
        this.mDisInfo = mDisInfo;
    }

    public float getStartAngle() {
        return startAngle;
    }

    public void setStartAngle(float startAngle) {
        this.startAngle = startAngle;
    }

    public float getEndAngle() {
        return endAngle;
    }

    public void setEndAngle(float endAngle) {
        this.endAngle = endAngle;
    }

    public int getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(int strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public boolean isDrawStrokeOnly() {
        return drawStrokeOnly;
    }

    public void setDrawStrokeOnly(boolean drawStrokeOnly) {
        this.drawStrokeOnly = drawStrokeOnly;
    }

    public Paint getmPaint() {
        return mPaint;
    }

    public void setmPaint(Paint mPaint) {
        this.mPaint = mPaint;
    }

    public Paint getmCopyPaint() {
        return mCopyPaint;
    }

    public void setmCopyPaint(Paint mCopyPaint) {
        this.mCopyPaint = mCopyPaint;
    }
}
