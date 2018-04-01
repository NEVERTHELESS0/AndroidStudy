package com.example.liyang.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class ButtonActivity extends AppCompatActivity {

    private TextView mTv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mTv1 = findViewById(R.id.tv_1);
        mTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonActivity.this, "你妹妹的", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void showToast(View v){
        Toast.makeText(this, "你妹的", Toast.LENGTH_LONG).show();
    }

}
