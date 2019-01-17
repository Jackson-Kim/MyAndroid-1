package org.techtown.part2_4;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Lab4_2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4_2);
        ImageView iv = (ImageView)findViewById(R.id.icon);
        iv.setBackground(new ShapeDrawable(new OvalShape()));
        iv.setClipToOutline(true);
    }
}
