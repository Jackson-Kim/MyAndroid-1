package org.techtown.myapplication2;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class lab_3_4Activity extends AppCompatActivity {

    CheckBox cb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_3_4);

        //Custom Font 적용
        TextView textView=(TextView)findViewById(R.id.fontView);
        TextView textView2=(TextView)findViewById(R.id.fontView);
        Typeface typeface=Typeface.createFromAsset(getAssets(), "test.ttf");
        textView.setTypeface(typeface);

        //CheckBox 이벤트 프로그램
        cb = (CheckBox)findViewById(R.id.checkbox);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cb.setText("is Checked");
                } else{
                    cb.setText("is unChecked");
                }
            }
        });

    }
}
