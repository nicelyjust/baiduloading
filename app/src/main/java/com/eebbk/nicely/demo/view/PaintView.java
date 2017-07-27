package com.eebbk.nicely.demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;

import com.eebbk.nicely.demo.utils.DimentionUtils;

/*
 *  @项目名：  Demo 
 *  @包名：    com.eebbk.nicely.demo.view
 *  @文件名:   PaintView
 *  @创建者:   lz
 *  @创建时间:  2017/7/24 14:54
 *  @描述：    自定义view需要重写测量
 */
public class PaintView extends View {
    private static final String TAG = "PaintView";
    private Paint mPaint;
    private Paint mTxtPaint;
    private Path mPath;
    private String mDrawText= "辅";
    private int mTextSize = DimentionUtils.dip2px(getContext(), 50);
    private int mHeight = DimentionUtils.dip2px(getContext(), 100);
    private int mWidth = DimentionUtils.dip2px(getContext(), 100);
    private Rect mRect;

    public PaintView(Context context) {
        this(context , null);
    }

    public PaintView(Context context, AttributeSet attrs) {
        this(context, attrs , 0);
    }

    public PaintView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        //文字画笔（抗锯齿粗体）
        mTxtPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTxtPaint.setColor(Color.rgb(41 , 163 , 254));
        mTxtPaint.setTextAlign(Paint.Align.CENTER);
        mTxtPaint.setTypeface(Typeface.DEFAULT_BOLD);

        mRect = new Rect();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize      = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize       = MeasureSpec.getSize(heightMeasureSpec);
        if (widthMode == MeasureSpec.EXACTLY) {
            mWidth = widthSize;
        }
        if (heightMode == MeasureSpec.EXACTLY) {
            mHeight = heightSize;
        }
        setMeasuredDimension(mWidth , mHeight);
        mTextSize = mWidth/2;
        mTxtPaint.setTextSize(mTextSize);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mRect.set(0, 0, mWidth, mHeight);
        mTxtPaint.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = mTxtPaint.getFontMetrics();
        float             top         = fontMetrics.top;
        float             bottom      = fontMetrics.bottom;
        canvas.drawText(mDrawText , 0 , canvas.getHeight()/2 , mTxtPaint);
    }

}
