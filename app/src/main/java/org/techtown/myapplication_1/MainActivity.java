package org.techtown.myapplication_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // 이벤트리스너. 생성될때.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
