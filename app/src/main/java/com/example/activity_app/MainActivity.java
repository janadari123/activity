package com.example.activity_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the question text
        setQuestion("Q1 - How to pass data between activities in Android?\nAns - Intent");
    }

    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void exitApp(View view) {
        finish(); // Close the current activity
        System.exit(0); // Exit the app
    }

    // Function to set the question text
    private void setQuestion(String questionText) {
        // Find the question1_id TextView
        TextView questionTextView = findViewById(R.id.question1_id);

        if (questionTextView != null) {
            // Set the question text
            questionTextView.setText(questionText);
        }
    }
}
