package com.example.thequizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private  EditText Password;
    private TextView Info;
    private Button Login;
    private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.laname);
        Password = (EditText)findViewById(R.id.lapwd);
        Info = (TextView)findViewById(R.id.lainfo);
        Login = (Button)findViewById(R.id.lalogin);
        Button lalogin = findViewById(R.id.lalogin);
        lalogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });


        Info.setText("No of attempts remaining : 5");
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate (String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, AdminHomePage.class);
            startActivity(intent);
        }else{
            counter--;
            Info.setText("No of attempts remaining :" +String.valueOf(counter));
            if (counter==0){
                Login.setEnabled(false);
            }
        }
    }


    private void
     Login(){
        Intent intent = new Intent(MainActivity.this, AdminHomePage.class);
        startActivity(intent);
    }
}
