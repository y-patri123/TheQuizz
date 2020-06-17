package com.example.thequizz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdminHomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_page);
        final Button manageQuizz = findViewById(R.id.mabutton);
        manageQuizz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startQuizz();
            }
        });
    }
    private void startQuizz(){
        Intent intent = new Intent( AdminHomePage.this, QuestionPage.class);
        startActivity(intent);
    }
}
