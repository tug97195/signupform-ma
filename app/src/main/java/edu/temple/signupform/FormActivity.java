package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                TextView textView = (TextView)findViewById(R.id.textView);
//                textView.setText("You have clicked the button");
//            }
//
//        });
    }
}