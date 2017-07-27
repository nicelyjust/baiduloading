package com.eebbk.nicely.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/*
 *  @项目名：  Demo 
 *  @包名：    com.eebbk.nicely.demo
 *  @文件名:   MainActivity
 *  @创建者:   Administrator
 *  @创建时间:  2017/7/19 18:07
 *  @描述：    TODO
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView mTextView;
    private String html = "<strong>我的测试</strong>这是什么鬼<p>换行</p>";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* mTextView = (TextView) findViewById(R.id.tv);
        CharSequence  charSequence = Html.fromHtml(html);
        mTextView.setText(charSequence);*/
    }

}
