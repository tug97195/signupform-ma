package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                //Check if all imports are given
                EditText editName = (EditText) findViewById(R.id.editName);
                EditText editEmail = (EditText) findViewById(R.id.editEmail);
                EditText editPassword = (EditText) findViewById(R.id.editPassword);
                EditText editPassword2 = (EditText) findViewById(R.id.editPassword2);
                String name = editName.getText().toString();
                String email = editEmail.getText().toString();
                String password = editPassword.getText().toString();
                String password2 = editPassword2.getText().toString();

                if(name.equals("") || email.equals("") || password.equals("") || password2.equals("")){
                    Context context = getApplicationContext();
                    CharSequence text = "ERROR: You did not complete the form !!";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                } else{
                    if(password.equals(password2)){
                        Context context = getApplicationContext();
                        CharSequence text = "Welcome: " + name;
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    } else{
                        Context context = getApplicationContext();
                        CharSequence text = "ERROR: Passwords do not match !! Given: " + password + " and " + password2;
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

                }
            }
        });
    }
}