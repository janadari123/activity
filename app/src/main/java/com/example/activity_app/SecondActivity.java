package com.example.activity_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Set the question text
        setQuestion("Q2 - What is the primary purpose of an Intent in Android?\nAns - To perform inter-component communication.");
    }

    public void goToThirdActivity(View view) {
        Intent intent = new Intent(this, ThirdActivity.class);
        startActivity(intent);
    }

    public void exitApp(View view) {
        finish(); // Close the current activity
        System.exit(0); // Exit the app
    }

    // Function to set the question text
    private void setQuestion(String questionText) {
        // Find the question2_id TextView
        TextView questionTextView = findViewById(R.id.question2_id);

        if (questionTextView != null) {
            // Set the question text
            questionTextView.setText(questionText);
        }
    }
}
