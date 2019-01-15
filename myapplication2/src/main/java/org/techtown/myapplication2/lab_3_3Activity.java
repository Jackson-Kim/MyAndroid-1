package org.techtown.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lab_3_3Activity extends AppCompatActivity implements View.OnClickListener{

    Button bt;
    Button bf;
    TextView target;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_3_3);

        //View 객체 획득
        bt = (Button)findViewById(R.id.btn_visible_true);
        target = (TextView)findViewById(R.id.text_visible_target);
        bf = (Button)findViewById(R.id.btn_visible_false);

        //이벤트 등록
        bt.setOnClickListener(this);
        bf.setOnClickListener(this);




    }


    public void onClick(View v){
        if(v==bt)
            target.setVisibility(View.VISIBLE);
        else if(v==bf)
            target.setVisibility(View.INVISIBLE);
    }

}
