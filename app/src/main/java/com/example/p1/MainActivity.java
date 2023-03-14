package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name,email,phone,password;
    Button submitButton,resetButton;
    TextView opView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init() {
        name = (EditText) findViewById(R.id.nameId);
        email = (EditText) findViewById(R.id.mailId);
        phone = (EditText) findViewById(R.id.phId);
        password = (EditText) findViewById(R.id.passId);
        submitButton = (Button) findViewById(R.id.submitId);
        opView = (TextView) findViewById(R.id.outputView);
        resetButton = (Button) findViewById(R.id.rst);
    }
    public void clear(View view){
        if(opView.getVisibility()==View.VISIBLE){
            opView.setVisibility(View.GONE);
        }
    }
    public void fun(View view){
        String n=name.getText().toString();
        String m=email.getText().toString();
        String ph=phone.getText().toString();
        String pass=password.getText().toString();
        if(n.isEmpty() || m.isEmpty() || ph.isEmpty() || pass.isEmpty()){
            Toast.makeText(getApplicationContext(), "Something is missing", Toast.LENGTH_SHORT).show();
            return ;
        }
        String result=n+"\n"+m+"\n"+ph+"\n"+pass;
        opView.setText(result);
        opView.setVisibility(View.VISIBLE);
    }
}