package com.example.thequizz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.List;

public class QuestionPage extends AppCompatActivity {
    private TextView question;
    private TextView score;
    private TextView questionmark;
    private TextView textViewCountDown;
    private RadioGroup radioGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private Button submit1;

    private List<Question> questionList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_page);

        question = findViewById(R.id.question);
        score = findViewById(R.id.score);
        questionmark = findViewById(R.id.questionmark);
        textViewCountDown = findViewById(R.id.time);
        radioGroup= findViewById(R.id.radioGroup);
        rb1 = findViewById(R.id.option1);
        rb2 = findViewById(R.id.option2);
        rb3 = findViewById(R.id.option3);
        rb4 = findViewById(R.id.option4);
        submit1 = findViewById(R.id.submit1);

        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestions();

    }
}
