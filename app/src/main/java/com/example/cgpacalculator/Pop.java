package com.example.cgpacalculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class Pop extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pop);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height  = dm.heightPixels;

        getWindow().setLayout((int)(width*0.6),(int)(height*0.5));

        String finalresult = new Double(MainActivity.avg).toString();

        TextView t = (TextView)findViewById(R.id.val);
        TextView t1 = (TextView)findViewById(R.id.review);

        t.setText(finalresult);

        if(MainActivity.avg>8)
            t1.setText("Excellent");
        else if (MainActivity.avg>7)
            t1.setText("Work Harder");
        else
            t1.setText("May God Be With You");

    }
}
