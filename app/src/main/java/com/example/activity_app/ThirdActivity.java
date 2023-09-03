package com.example.activity_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        // Set the question text
        setQuestion("Q3 - What is the primary use of an SQLite database in Android?\nAns - To store structured data.");
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
        // Find the question3_id TextView
        TextView questionTextView = findViewById(R.id.question3_id);

        if (questionTextView != null) {
            // Set the question text
            questionTextView.setText(questionText);
        }
    }
}
