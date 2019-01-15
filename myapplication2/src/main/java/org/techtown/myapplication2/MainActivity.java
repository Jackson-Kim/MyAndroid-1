package org.techtown.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout ls = new LinearLayout(this);
        Button b1 = new Button(this);
        b1.setText("버튼 하나");
        ls.addView(b1);

        Button b2 = new Button(this);
        b2.setText("버튼 두울");
        ls.addView(b2);

        setContentView(ls);
    }
}
